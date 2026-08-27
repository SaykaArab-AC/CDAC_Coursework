#include <iostream>
#include <cmath>
#include <climits>
using namespace std;

double computeRMS(double* signal, int n);
void normalise(double* signal, int n);
int countZeroCrossings(double* signal, int n);
void applyGain(double* signal, int n, double gainFactor);

int main() {
	int n=5;
	double signal[n];
//	double *ptr=signal;
	double gainFactor;

	cout<<"Enter Test Signals :"<<endl;

	for(int i=0;i<n;i++){
		cin>>signal[i];
	}
	cout<<"Before Normalize ->"<<endl;
	for(int i=0;i<n;i++){
		cout<<*(signal+i)<<"  ";
	}

	normalise(signal,n);

	cout<<"\nAfter Normalize ->"<<endl;
	for(int i=0;i<n;i++){
		cout<<*(signal+i)<<"  ";
	}

	cout<<endl<<endl;
	cout<<"Enter Gain Factor : "<<endl;
	cin>>gainFactor;

	cout<<"Before  GainFactor ->"<<endl;
	for(int i=0;i<n;i++){
		cout<<*(signal+i)<<"  ";
	}

	applyGain(signal,n,gainFactor);
	cout<<"\nAfter GainFactor ->"<<endl;
	for(int i=0;i<n;i++){
		cout<<*(signal+i)<<"  ";
	}
	cout<<endl<<endl;
	cout<<"RMS = "<<computeRMS(signal,n)<<endl;
	cout<<"Count = "<<countZeroCrossings(signal,n)<<endl;
	return 0;
}

double computeRMS(double* signal, int n){
	double sum=0;
	double power;
	for(int i=0;i<n;i++){
		power=pow(*(signal+i),2);
		sum+=power;
	}
	return sqrt(sum/5);
}



void normalise(double* signal, int n){
	double maximum=INT_MIN;
	for(int i=0;i<n;i++){
		maximum=max(abs(*(signal+i)),maximum);
	}
	for(int i=0;i<n;i++){
		*(signal+i)/=maximum;
	}

}


int countZeroCrossings(double* signal, int n){
	int count=0;
	for(int i=0;i<n;i++){
		if((*(signal+i)<0 && *(signal+i+1)>=0) || (*(signal+i)>=0 && *(signal+i+1)<0)){
			count++;
		}
	}
	return count;
}

void applyGain(double* signal, int n, double gainFactor){
	for(int i=0;i<n;i++){
		*(signal+i)*=gainFactor;
	}
}

