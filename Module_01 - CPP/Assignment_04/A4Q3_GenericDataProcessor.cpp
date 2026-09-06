#include <iostream>
#include <vector>
#include <algorithm>
#include <cctype>
#include <stdexcept>
using namespace std;

template <typename T>
class DataBuffer {
private:
	T*   data;
	int  capacity;
	int  head=0;
	int  tail=0;
	int  count=0;

public:
	DataBuffer(int capacity):capacity(capacity){
        data=new T[capacity];
	}
	~DataBuffer(){
        delete[] data;
	}
	void push(const T& value){

	    data[tail]=value;

	    tail=(tail+1)%capacity;

	    if(count<capacity){
	        count++;
	    }
	    else{
	        head=(head+1)%capacity;
	    }
	}
	T pop(){
        if(count==0){
        	throw underflow_error("Buffer is empty");
        }

		T temp=data[head];
		head++;
		count--;
        if(head==capacity){
            head=0;
        }
		return temp;
	}
	T peek() const{
		if(count>0)
			return data[head];
		return T();
	}
	bool isEmpty() const{
		if(count<=0){
			return true;
		}else{
			return false;
		}
	}
	bool isFull() const{
		if(count==capacity)
			return true;
		return false;
	}
	int  size() const{
		return count;
	}

//	template <typename U>
	friend ostream& operator<<(ostream& out, const DataBuffer<T>& buf){
		for(int i=0;i<buf.count;i++){
                out<<buf.data[i]<<" ";
        }
        return out;
	}
};

class DataProcessor {
public:

	virtual void loadData(const string& source) = 0;
	virtual void processData() = 0;
	virtual void exportResult(const string& destination) = 0;
	virtual string processorType() const = 0;
	virtual int recordCount() const = 0;

	virtual void printSummary() const{
		 cout << "Processor: " << processorType() << endl;
		 cout << "Records: " << recordCount() << endl;
	}

	virtual ~DataProcessor() = default;
};

class CSVProcessor:public DataProcessor{
	vector<string> v;
	static int CSVCount;

public:
	void loadData(const string& source) override{
			v={
				 "101,John,25,50000",
				"102,Sarah,30,65000",
				"103,David,28,55000",
				"104,Emily,35,72000",
				"105,Michael,22,45000"
		};
	}
	void processData()override{
		for(auto& s:v){
			transform(s.begin(),s.end(),s.begin(),::toupper);
		}
	}
	void exportResult(const string& destination)override{
		cout<<"[CSV Export -> "<<destination<<"]"<<endl;
		for(string& ele:v){
			cout<<ele<<endl;
		}
	}
	string processorType() const override{
		return "CSV Processor";
	}
	int recordCount() const {
		return v.size();
	}
};

class SensorStreamProcessor:public DataProcessor{
	vector<double> s;
	static int sensorCount;
	double minVal;
	double maxVal;
	double mean;
public:
	void loadData(const string& source) override{
			s={23.4, 21.8, 25.1,52.3,41.3,96,10.3,52.7};
	}
	void processData()override{
		minVal=*min_element(s.begin(),s.end());
		maxVal=*max_element(s.begin(),s.end());
		double sum=0;
		for(double x:s){
			sum+=x;
		}
		mean=sum/s.size();

	}
	void exportResult(const string& destination)override{
		cout<<"[Sensor Export -> "<<destination<<"]"<<endl;
		cout << "Mean: " << mean << endl;
		    cout << "Min: " << minVal << endl;
		    cout << "Max: " << maxVal << endl;
	}
	string processorType() const{
		return "Sensor Stream Processor";
	}
	int recordCount() const {
		return s.size();
	}
};

int main() {
	vector<DataProcessor*> pipeline;

	pipeline.push_back(new CSVProcessor());
	pipeline.push_back(new SensorStreamProcessor());

	for (auto* p : pipeline) {
		p->loadData("source_data");
		p->processData();
		p->printSummary();
		p->exportResult("output_dir");
		cout << "---" << endl;
	}

	cout<<endl<<endl;

	// Integer buffer — simulate sensor tick IDs
	DataBuffer<int> tickBuffer(5);
	for (int i = 1; i <= 7; i++)
		tickBuffer.push(i * 10);

	cout << "Tick Buffer: " << tickBuffer << endl;

	// Double buffer — simulate temperature readings
	DataBuffer<double> tempBuffer(4);

	tempBuffer.push(36.6); tempBuffer.push(37.1);
	tempBuffer.push(38.2); tempBuffer.push(36.9);
	cout << "Before pop: " << tempBuffer << endl;
	cout << "Popped: " << tempBuffer.pop() << endl;
	cout << "After pop:  " << tempBuffer << endl;

	// String buffer — simulate log message queue
	DataBuffer<string> logBuffer(3);
	logBuffer.push("INFO: Server started");
	logBuffer.push("WARN: High memory usage");
	logBuffer.push("ERROR: DB connection timeout");
	logBuffer.push("INFO: Retry successful");
	// Overwrites oldest
	cout << "Log Buffer: " << logBuffer << endl;

	for(auto* p : pipeline){
	    delete p;
	}
	return 0;
}
