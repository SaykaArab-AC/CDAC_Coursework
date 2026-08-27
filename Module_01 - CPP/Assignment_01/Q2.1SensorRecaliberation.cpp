#include <iostream>
using namespace std;

void resetSensorPairV1(int reading1, int reading2);
void resetSensorPairV2(int &reading1, int &reading2);
void resetSensorPairV3(int *reading1, int *reading2);

int main() {
	int reading1;
	int reading2;

	cout<<"Enter Reading1 : "<<endl;
	cin>>reading1;
	cout<<"Enter Reading2 : "<<endl;
	cin>>reading2;

	cout<<"--- V1: Call by Value ---"<<endl;
	cout<<"Before Swapping -> Reading1 = "<<reading1<<"\t\tReading2 = "<<reading2<<endl;
	resetSensorPairV1(reading1,reading2);
	cout<<"After Swapping -> Reading1 = "<<reading1<<"\t\tReading2 = "<<reading2<<endl<<endl;
	/*
	 * It didnt swap bcz those values(copies of original) are swapped only in tht resetSensorPairV1() scope
	 * here copies of original values are passed to the func. so swapping happens only on those copies not original values
	 * when func end copies are destroyed ,so here it prints the original values only
	 *
	 * */
	cout<<"--- V2: Call by Value ---"<<endl;
	cout<<"Before Swapping -> Reading1 = "<<reading1<<"\t\tReading2 = "<<reading2<<endl;
	resetSensorPairV2(reading1,reading2);
	cout<<"After Swapping -> Reading1 = "<<reading1<<"\t\tReading2 = "<<reading2<<endl<<endl;

	cout<<"--- V3: Call by Value ---"<<endl;
	cout<<"Before Swapping -> Reading1 = "<<reading1<<"\t\tReading2 = "<<reading2<<endl;
	resetSensorPairV3(&reading1,&reading2);
	cout<<"After Swapping -> Reading1 = "<<reading1<<"\t\tReading2 = "<<reading2<<endl<<endl;

	return 0;
}
void resetSensorPairV1(int reading1, int reading2){
	reading1=reading1+reading2;
	reading2=reading1-reading2;
	reading1=reading1-reading2;
}

void resetSensorPairV2(int &reading1, int &reading2){
	reading1=reading1+reading2;
	reading2=reading1-reading2;
	reading1=reading1-reading2;

}

void resetSensorPairV3(int *reading1, int *reading2){
	*reading1=*reading1+*reading2;
	*reading2=*reading1-*reading2;
	*reading1=*reading1-*reading2;
}
