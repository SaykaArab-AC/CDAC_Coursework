#include <iostream>
using namespace std;

int main() {
	int statusReg  = 0b10110001;
	int controlReg = 0b00000000;
	int dataReg    = 0b11001010;

	const int *regPtr1=&statusReg;
//	*regPtr1=controlReg; 		error: assignment of read-only location '* regPtr1'
//								here only address can be changed not value bcz its pointer to a const variable
	regPtr1=&controlReg;
	cout<<"statusReg = "<<statusReg<<endl;
	cout<<"regPtr1 = "<<regPtr1<<endl;

	int *const regPtr2=&dataReg;
	*regPtr2=dataReg;
//	regPtr2=dataReg;     NOT ALLOWED
	cout<<"controlReg = "<<controlReg<<endl;
	cout<<"regPtr2 = "<<regPtr2<<endl;

	const int *const regPtr3=&statusReg;
//	*regPtr3=statusReg;     NOT ALLOWED
//	regPtr3=&statusReg;     NOT ALLOWED
	cout<<"dataReg = "<<dataReg<<endl;
	cout<<"regPtr3 = "<<regPtr3<<endl;


	return 0;
}
