#include <iostream>
using namespace std;

int main() {
	double sensorReading;
	int statusCode;
	double tempF;
	string statusLabel;
	string action;
	string reading;

	cout<<"Enter Sensor Readings :";
	cin>>sensorReading;

	if(sensorReading<0){
		statusCode=-1;
	}
	else if(sensorReading>=0 && sensorReading<30){
		statusCode=0;
	}
	else if(sensorReading>=30 && sensorReading<45){
			statusCode=1;
	}
	else if(sensorReading>=45 && sensorReading<60){
				statusCode=2;
	}
	else{
		statusCode=3;
	}

	switch(statusCode){
		case -1:
			statusLabel="SENSOR_ERROR";
			action="Sensor fault — check wiring";
			break;
		case 0:
			statusLabel="NORMAL";
			action="No action required";
			break;
		case 1:
			statusLabel="WARNING";
			action="Alert sent to supervisor";
			break;
		case 2:
			statusLabel="CRITICAL";
			action="Cooling system triggered";
			break;
		case 3:
			statusLabel="SHUTDOWN";
			action="Emergency shutdown initiated";
			break;
	}
	tempF=(sensorReading*9/5)+32;
	reading = sensorReading < 25 ? "Below Average":"Above average";

	cout<<"Temperature	: "<<sensorReading<<"°C / "<<tempF<<" F"<<endl;
	cout<<"Status		: "<<statusLabel<<endl;
	cout<<"Action		: " <<action<<endl;
	cout<<"Reading		: " <<reading<<endl;
	return 0;
}
