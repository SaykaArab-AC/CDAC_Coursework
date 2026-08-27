#include <iostream>
#include <cmath>
using namespace std;

inline double distanceBetween(double x1, double y1, double x2, double y2);
inline double toRadians(double degrees);
inline double clamp(double value, double minVal, double maxVal);
inline bool isInSafeZone(double x, double y, double cx, double cy, double radius);

int main() {
	double homeX = 0.0;
	double homeY = 0.0;
	double safeZoneRad=50.0;

	double x1 = 30.0;
	double y1 = 40.0;

	cout<<"Waypoints : ("<<x1<<","<<y1<<")"<<endl;
	cout<<"Distance from Home : "<<distanceBetween(homeX,homeY,x1,y1)<<endl;
	cout<<"Inside safe zone: "<<(isInSafeZone(x1,y1,homeX,homeY,safeZoneRad)==1?"YES":"NO");
	return 0;
}

inline double distanceBetween(double x1, double y1, double x2, double y2){
	return sqrt(pow(x2-x1, 2)+pow(y2-y1, 2));

}

inline double toRadians(double degrees){
	return degrees*(M_PI/180);

}

inline double clamp(double value, double minVal, double maxVal){
	return value>maxVal?maxVal:(value<minVal?minVal:value);
}

inline bool isInSafeZone(double x, double y, double cx, double cy, double radius){
	return distanceBetween(x,y,cx,cy)<=radius ? true : false;
}
