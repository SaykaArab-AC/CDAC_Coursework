#include <iostream>
#include <iomanip>
using namespace std;

class Patient{
private:
	int patientId;
	string name;
	int age;
	string ward;
	const string bloodGroup;

public:
	Patient():bloodGroup("O+"){
		cout<<"[Constructor] Default patient registered."<<endl;
		patientId=0;
		name="Unknown";
		age=0;
		ward="General";
	}

	Patient(int id, const string& nm):patientId(id),name(nm){
		cout<<"[Constructor] Emergency : "<<name<<endl;
	}

	Patient(int id, const string& name, int age, const string& ward, const string& bg):bloodGroup(bg),patientId(id),ward(ward)
	{
		this->name=name;
		cout<<"[Constructor] Full Admission : "<<this->name<<endl;
		this->age=age;
	}

	~Patient(){
		cout<<"[Destructor] Patient "<<name<<" discharged."<<endl;
	}

	void displayRecord() const{
		cout<<"\nPatient Record ->"<<endl;
		cout<<left;
		cout<<setw(11)<<"ID "<<": "<<patientId<<endl;
		cout<<setw(11)<<"Name "<<": "<<name<<endl;
		cout<<setw(11)<<"Age "<<": "<<age<<endl;
		cout<<setw(11)<<"Ward "<<": "<<ward<<endl;
		cout<<setw(11)<<"Blood Grp "<<": "<<bloodGroup<<endl;
		cout<<endl;
	}
	void transferWard(const string& newWard){
		cout<<"Ward Transfer : "<<name<<" -> "<<newWard<<endl<<endl;
	}

	int getAge() const {
		return age;
	}

	void setAge(int age) {
		this->age = age;
	}

	const string& getBloodGroup() const {
		return bloodGroup;
	}

	const string& getName() const {
		return name;
	}

	void setName(const string &name) {
		this->name = name;
	}

	int getPatientId() const {
		return patientId;
	}

	void setPatientId(int patientId) {
		this->patientId = patientId;
	}

	const string& getWard() const {
		return ward;
	}

	void setWard(const string &ward) {
		this->ward = ward;
	}


};
int main() {
	Patient p[3]={
		Patient(1,"Meera Joshi",34,"ICU","A+"),
		Patient(2,"Raj Patel")
	};

	// If we just do Patient p[3] it calls default constructot for all 3 object at once
	// only so for parameterised cons to be called above syntax shoudl be used

	p[0].displayRecord();

	p[1].transferWard("ICU");

	Patient* p1=new Patient[4]{
		Patient(4,"Preeta Roy",67,"General","AB-"),
		Patient(5,"Abhir Goenka")
	};

	p1[0].displayRecord();
	p[1].displayRecord();
	p1[1].transferWard("Surgical Ward");

	delete [] p1;
	return 0;
}
