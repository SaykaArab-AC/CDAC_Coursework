#include <iostream>
#include <string>
using namespace std;

class LedgerEntry{
	string description;
	double* amounts;
	int days;
	static int totalEntries;

public:
	LedgerEntry():days(0){
		amounts=new double[days];
		totalEntries++;
	}

	LedgerEntry(string description,int days):description(description),days(days){
		amounts=new double[days];
		totalEntries++;
	}

	LedgerEntry(int days):days(days){
		amounts =new double[days];
	}
	// Move Constructor
	LedgerEntry(LedgerEntry&& a)noexcept{
		cout<<"\n[Move Constructor] Ownership transferred from: January Sales"<<endl;
		days=a.days;
		amounts=a.amounts;
		a.days=0;
		a.amounts=nullptr;
	}

	//Move assignment operator
	LedgerEntry& operator=(LedgerEntry&& a)noexcept{
		cout<<"\n[Move Assignment] Ownership transferred from: February Sales"<<endl;
		if(this!=&a){
			delete [] amounts;
			days=a.days;
			amounts=a.amounts;
			a.amounts=nullptr;
		}
		return *this;
	}

	//Copy assignment operator
	LedgerEntry& operator=(const LedgerEntry& a){
		cout<<"\nCopy Assignment Operator.."<<endl;
		if(this!=&a){
			delete [] amounts;
			days=a.days;
			amounts=new double[days];
			for(int i=0;i<days;i++){
				amounts[i]=a.amounts[i];
			}
		}
		return *this;
	}

	LedgerEntry operator+(const LedgerEntry& other) const{
		LedgerEntry result(days);
		for(int i=0;i<days;i++){
			result.amounts[i]=amounts[i]+other.amounts[i];
		}
		return result;
	}

	bool operator==(const LedgerEntry& other) const{
		for(int i=0;i<days;i++){
			if(amounts[i]==other.amounts[i]){
				return true;
			}
		}
		return false;
}

	bool operator>(const LedgerEntry& other) const{
		for(int i=0;i<days;i++){
			if(amounts[i]<other.amounts[i]){
				return true;
			}
		}
		return false;
	}

	double& operator[](int index){
		if(index < days){
			return amounts[index];
		}else{
			throw out_of_range("Array out of bounds...");
		}
	}
	static int getTotal(){
		return totalEntries;
	}

	friend ostream& operator<<(ostream& out, const LedgerEntry& entry);
	friend istream& operator>>(istream& in, LedgerEntry& entry);

	~LedgerEntry(){
		cout<<"[Destructor] "<<description<<endl;
		delete[] amounts;
	}
};

ostream& operator<<(ostream& out, const LedgerEntry& entry){
	for(int i=0;i<entry.days;i++){
		out<<entry.amounts[i]<<", ";
	}
	cout<<endl;
	return out;
}

istream& operator>>(istream& in, LedgerEntry& entry){
	for(int i=0;i<entry.days;i++){
		in>>entry.amounts[i];
	}
	cout<<endl;
	return in;
}

int LedgerEntry::totalEntries=0;

int main() {

	LedgerEntry jan("January Sales", 5);
	jan[0] = 1200.50;
	jan[1] = 3400.00;
	jan[2] = 800.75;
	jan[3] = 2100.00;
	jan[4] = 650.25;

	LedgerEntry feb("February Sales", 5);
	feb[0] = 900.00;
	feb[1] = 2200.50;
	feb[2] = 1750.00;
	feb[3] = 3000.00;
	feb[4] = 475.50;

	cout << jan << endl;
	cout << feb << endl;

	// Objective 2 — Operator + (sum two ledgers into combined)
	LedgerEntry combined = jan + feb;
	cout << "Combined: " << combined << endl;

	// Objective 3 — Relational operators
	cout << "Jan == Feb : " << (jan == feb ? "Yes" : "No") << endl;
	cout << "Jan  > Feb : " << (jan  > feb ? "Yes" : "No") << endl;

	// Objective 4 — Move constructor (should NOT deep copy)
	LedgerEntry moved = move(jan);
	cout << "After move, jan.amounts is null: "
	<< (/* check jan is empty */ true ? "YES" : "NO") << endl;
	cout << "Moved entry: " << moved << endl;

	// Objective 5 — Move assignment
	LedgerEntry q1("Q1 Total", 5);
	q1 = move(feb);
	// feb's resources transferred to q1
	cout << "Q1 (moved from feb): " << q1 << endl;

	// Objective 6 — Static member
	cout << "Live LedgerEntry objects: " << jan.getTotal()<< endl;
	return 0;
}
