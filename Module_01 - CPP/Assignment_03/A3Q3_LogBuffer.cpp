#include <iostream>
#include <cstring>
using namespace std;

class LogBuffer{
private:
	char *buffer;
	int capacity;
	int size=0;
	static int instanceCount;
	mutable int accessCount=0;

public:
	//Parameterized Constructor
	LogBuffer(int capacity):capacity(capacity){
		buffer=new char[capacity];
		++instanceCount;
		cout<<"[LogBuffer Created] Capacity = "<<capacity<<endl;
	}

	// Copy Constructor - Deep copy
	LogBuffer(const LogBuffer& other){
		++instanceCount;
		capacity=other.capacity;
		size=other.size;
		buffer=new char[capacity];

		for(int i=0;i<other.size;i++){
			buffer[i]=other.buffer[i];
		}
	}

	//Copy Assignment Operator
	LogBuffer& operator=(const LogBuffer& other){
		if(this != &other){
			cout<<"\n[LogBuffer Assigned]"<<endl;
			delete []buffer;
			capacity=other.capacity;
			size=other.size;
			buffer=new char[capacity];
			memcpy(buffer,other.buffer,strlen(other.buffer)+1);
		}
		else{
			cout<<"\n[Self-assignment detected — no operation]"<<endl;
		}
		return *this;		//returned the current object
	}

	~LogBuffer(){
		cout<<"[LogBuffer Destroyed]"<<endl;
		instanceCount--;
		delete[] buffer;
	}

	void append(const char* msg){
		memcpy(buffer+size,msg,strlen(msg)+1);
		size+=strlen(msg);
	}

	void print() const{
		accessCount++;
		for(int i=0;i<size;i++){
			cout<<buffer[i];
		}
		cout<<endl;
	}
	void clear(){
		size=0;
	}

	static int getInstanceCount(){
		return instanceCount;
	}

	int getAccessCount() const {
		return accessCount;
	}
};

int LogBuffer::instanceCount=0;

int main() {

	// Objective 1 : Basic usage
	LogBuffer log1(256);
	log1.append("Server started on port 8080");
	log1.append(" | Request received from 192.168.1.10");
	log1.print();

	// Objective 2 : Deep copy via copy constructor
	LogBuffer log2 = log1;
	// copy constructor
	log2.append(" | Cached response sent");
	cout << "log1 : ";
	log1.print(); // must NOT contain log2's append
	cout << "log2 : ";
	log2.print();

	// Objective 3 : Copy assignment operator
	LogBuffer log3(256);
	log3 = log1;
	cout << "log3 : ";
	log3.print();

	// copy assignment

	// Objective 4 : Self-assignment guard
	log1 = log1;
	// must not crash or corrupt data

	// Objective 5 : Static member
	cout << "\nLive LogBuffer objects : " << LogBuffer::getInstanceCount() <<endl<<endl;

	cout<<"print() is called "<<log1.getAccessCount()+log3.getAccessCount()<<" times."<<endl;
	return 0;
}
