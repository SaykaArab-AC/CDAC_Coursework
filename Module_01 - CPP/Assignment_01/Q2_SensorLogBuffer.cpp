#include <iostream>
#include <climits>
using namespace std;

int main() {
	int n;
	int skipped=0;
	double minimum=INT_MAX;
	double maximus=INT_MIN;
	double average;
	double sum=0;
	int normal=0;
	int warning=0;
	int critical=0;
	int shutdown=0;

	cout<<"Enter N :";
	cin>>n;

	cout<<"Enter Temperature Values :"<<endl;
	double temperature[n];
	for(int i=0;i<n;i++){
		cin>>temperature[i];
	}

	cout<<"Reading entered : "<<n<<endl;
	cout<<"Valid Readings : ";

	for(int i=0;i<n;i++){
		if(temperature[i]<0){
			skipped++;
			continue;
		}
		if(temperature[i]>=0 && temperature[i]<30){
			normal++;
		}
		else if(temperature[i]>=30 && temperature[i]<45){
			warning++;
		}
		else if(temperature[i]>=45 && temperature[i]<60){
					critical++;
		}
		else{
			shutdown++;
		}
		cout<<temperature[i]<<"  ";
	}
	cout<<endl;
	cout<<"Skipped (Errors) : "<<skipped<<endl;
	cout<<"FIRST CRITICAL : ";

	for(int i=0;i<n;i++){
		if(temperature[i]>=45){
			cout<<"Index "<<i<<" -> "<<temperature[i]<<"℃"<<endl;
			break;
		}
	}

	for(int i=0;i<n;i++){
		minimum=min(minimum,temperature[i]);
		maximus=max(maximus,temperature[i]);
		sum+=temperature[i];
	}
	average=sum/n;

	cout<<"Max : "<<maximus<<"℃    Minimum : "<<minimum<<"℃   Average : "<<average<<"℃"<<endl;
	cout<<"Normal : "<<normal<<"	Warning : "<<warning<<"		Critical : "<<critical<<"		Shutdown : "<<shutdown<<endl;
	return 0;
}
