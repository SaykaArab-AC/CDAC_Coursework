#include <iostream>
#include <climits>
#include <iomanip>

using namespace std;

int main() {
	double temperature[3][3];

	cout<<"Enter Temperature Values :"<<endl;
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			cin>>temperature[i][j];
		}
	}

	for(int i=1;i<=3;i++){
		cout<<"\t\tRoom "<<i;
	}
	cout<<endl;
	for(int i=0;i<3;i++){
		cout<<"Floor "<<i+1<<"  : ";
		for(int j=0;j<3;j++){
			cout<<"\t"<<temperature[i][j]<<"\t   ";
		}
		cout<<endl;
	}

	double hottestRoom=INT_MIN;
	double hottestFloor=INT_MIN;
	double floorSum=0;
	double floorAvg=0;
	int floor;
	int room;
	int warning=0;
	for(int i=0;i<3;i++){
		floorSum=0;
		for(int j=0;j<3;j++){
			if(temperature[i][j]>=30){
				warning++;
			}
			hottestRoom=max(hottestRoom,temperature[i][j]);
			floorSum+=temperature[i][j];
			floor=i+1;
			room=j+1;
		}
		hottestFloor=max(hottestFloor,floorSum);
	}
	floorAvg=hottestFloor/3;
	cout<<"\nHottest Room : Floor "<<floor<<", Room "<<room<<" -> "<<hottestRoom<<"℃"<<endl;
	cout<<"Hottest Floor : Floor "<<floor<<" (avg "<<fixed<<setprecision(2)<<floorAvg<<"℃)"<<endl;
	cout<<"Rooms at Warning or above : "<<warning<<endl;
	return 0;
}
