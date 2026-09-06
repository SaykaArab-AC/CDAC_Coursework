#include <iostream>
#include <iomanip>
#include <vector>
using namespace std;

class Vehicle{
protected:
	string registrationNo;
	string ownerName;
	int yearOfManufacture;
	double kmDriven;
public:
	Vehicle(){

	}

	Vehicle(const string& reg, const string& owner, int year, double km):registrationNo(reg),ownerName(owner),yearOfManufacture(year),kmDriven(km){
		cout<<"[Vehicle Constructor] "<<registrationNo<<" : "<<ownerName<<endl;
	}
	virtual double fuelCost(double kmToTravel) const = 0;

	virtual string vehicleType() const = 0;

	virtual void describe() const{
		cout<<"Registration No. = "<<registrationNo<<endl;
		cout<<"Owner Name = "<<ownerName<<endl;
		cout<<"Year Of Manufacture = "<<yearOfManufacture<<endl;
		cout<<"Km Driven = "<<kmDriven<<endl;
	}

	double getKmDriven() const{
		return kmDriven;
	}

	string getRegNo() const{
		return registrationNo;
	}
	string getOwnerName() const {
		return ownerName;
	}
	virtual ~Vehicle(){
		cout<<"[Vehicle Destrcutor] "<<registrationNo<<endl;
	}
};

class Car:public Vehicle{
	string fuelType;
	double mileageKmpl;
public:
	Car(){

	}

	Car(const string& reg, const string& owner, int year, double km,const string& fuelType,double mileageKmpl):Vehicle(reg,owner,year,km),fuelType(fuelType),mileageKmpl(mileageKmpl){
		cout<<"[Car Constructor] "<<registrationNo<<endl;
	}

	string vehicleType()const override{
		return "Car";
	}

	double fuelCost(double kmToTravel) const{
		if(fuelType=="Petrol"){
			return kmToTravel/mileageKmpl*106.00;
		}else{
			return kmToTravel/mileageKmpl*93.00;
		}
	}
	void describe()const override{
		Vehicle::describe();
		cout<<"Fuel Type = "<<fuelType<<endl;
		cout<<"Mileage = "<<mileageKmpl<<endl;
	}
	string getOwnerName() const {
	    return ownerName;
	}

	~Car(){
		cout<<"[Car Destructor] "<<registrationNo<<endl;
	}
};

class Truck:public Vehicle{
	double payloadCapacityTons;
	double fuelEfficiencyKmpl;
public:
	Truck(const string& reg, const string& owner, int year, double km,double payloadCapacityTons,double fuelEfficiencyKmpl):Vehicle(reg,owner,year,km),payloadCapacityTons(payloadCapacityTons),fuelEfficiencyKmpl(fuelEfficiencyKmpl){
		cout<<"[Truck Constructor] "<<registrationNo<<endl;
	}

	string vehicleType()const override{
		return "Truck";
	}

	double fuelCost(double kmToTravel) const{
		return (kmToTravel/(fuelEfficiencyKmpl*(1-0.05*payloadCapacityTons)))*93;
	}
	void describe()const{
		Vehicle::describe();
		cout<<"Paylod capcity Tons = "<<payloadCapacityTons<<endl;
		cout<<"Fuel Efficiency Kmpl = "<<fuelEfficiencyKmpl<<endl;
	}

	~Truck(){
		cout<<"[Truck Destructor] "<<registrationNo<<endl;
	}
};

class ElectricTruck:public Truck{
public:
	double batteryCapacityKWh;
	double rangePerChargeKm;

	ElectricTruck(const string& reg, const string& owner, int year, double km,double payloadCapacityTons,double fuelEfficiencyKmpl,double batteryCapacityKWh,double rangePerChargeKm):Truck(reg,owner,year,km,payloadCapacityTons,fuelEfficiencyKmpl),batteryCapacityKWh(batteryCapacityKWh),rangePerChargeKm(rangePerChargeKm){
		cout<<"[Electric Truck Constructor] "<<registrationNo<<endl;
	}
	double fuelCost(double kmToTravel) const{
		return (kmToTravel/rangePerChargeKm)*batteryCapacityKWh*9.50;
	}
	string vehicleType()const override{
		return "Electric Truck";
	}
	void describe()const{
		Truck::describe();
		cout<<"Batter Capacity KWh = "<<batteryCapacityKWh<<endl;
		cout<<"Range Per Charge Km = "<<rangePerChargeKm<<endl;
	}

	~ElectricTruck(){
		cout<<"[Electric Truck Destructor] "<<registrationNo<<endl;
	}

};
class Van:public Vehicle{
	int seatingcapacity;
	double mileage;

public:
	Van(){

	}
	Van(const string& reg, const string& owner, int year, double km,int seatingcapacity,double mileage):Vehicle(reg,owner,year,km),seatingcapacity(seatingcapacity),mileage(mileage){

	}

	~Van(){
		cout<<"[Van Destructor] "<<registrationNo<<endl;
	}
	double fuelCost(double kmToTravel) const{
		return kmToTravel/mileage*106;
	}
	string vehicleType()const override{
		return "Van";
	}
};

void printFleetReport(const vector<Vehicle*>& fleet, double tripKm){
	double efficient=INT_MAX;
	string reg;
	string tp;
	cout<<"===== FLEET REPORT — Trip Distance: 200 km ====="<<endl;
	cout<<"Reg\t\t"<<"Type\t\t"<<"Owner\t\t"<<"Km Driven"<<endl;
	for(auto ele:fleet){
		cout<<ele->getRegNo()<<"\t"<<ele->vehicleType()<<"\t"<<ele->getOwnerName()<<"\t"<<ele->getKmDriven()<<endl;
	}
	cout<<endl;
	cout<<"===== FUEL / CHARGE COST ESTIMATE ====="<<endl;
	for(auto ele:fleet){
		if(ele->fuelCost(tripKm)<efficient){
			efficient=ele->fuelCost(tripKm);
			reg=ele->getRegNo();
			tp=ele->vehicleType();
		}
		ElectricTruck* e = dynamic_cast<ElectricTruck*>(ele);
		    if (e != nullptr) {
		        cout <<"[Battery :"<<e->batteryCapacityKWh<<" % Charged]"<<endl;
		    }
		cout<<left;
		cout<<ele->getRegNo()<<" ("<<ele->vehicleType()<<")"<<setw(20)<<": Rs."<<ele->fuelCost(tripKm)<<endl;
	}
	cout<<endl;
	cout<<"Most Efficient Vehicle:" <<reg<<" ("<<tp<<") - Rs."<<efficient<<" for 200km"<<endl;
}

int main() {
	ElectricTruck et("V-ET001","Green Logistics", 2023, 89000,100.0, 10.0, 85.0, 400.0);

	vector<Vehicle*> v;
	v.push_back(new Car("KA01AA001","Ramesh Kumar",2001,45200,"Petrol",18.75));
	v.push_back(new Truck("MH04BB002","Shyam Logistics", 2018, 123500,10,5));
	v.push_back(new Van("DL05DD004", "City Travels", 2021, 67000,8, 15.0));
	v.push_back(new ElectricTruck("GJ07CC003", "Green Fleet Co", 2024,89000, 40.0, 4.0, 85.0, 400.0));
	v.push_back(new Car("MH12EE005", "Amit Sharma", 2022, 32000,"Diesel", 22.0));

	printFleetReport(v,200);

	for(Vehicle* x:v){
		delete x;
	}
	return 0;
}
