#include <iostream>
#include <cmath>
using namespace std;

bool parsePacket(const int* rawData, int size,int** outMin, int** outMax);

int main() {
	int packet[] = {45, 12, 67, 8, 55, 31};
	int* minPtr = nullptr;
	int* maxPtr = nullptr;

	if (parsePacket(packet, 6, &minPtr, &maxPtr)) {
		cout << "Calibration Min : " << *minPtr << endl;
		cout << "Calibration Max : " << *maxPtr << endl;
	}
	return 0;
}

bool parsePacket(const int* rowData, int size,int** outMin, int** outMax){
	if(size<=0){
		return false;
	}
    *outMin=(int*)&rowData[0];
    *outMax=(int*)&rowData[0];

	for(int i=0;i<size;i++){
        if(**outMin> *(rowData+i)){
            *outMin=(int*)rowData+i;
        }
        if(**outMax< *(rowData+i)){
            *outMax=(int*)rowData+i;
        }
	}
	return true;
}
