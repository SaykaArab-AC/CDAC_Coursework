#include <iostream>
#include <cmath>
using namespace std;

class Product{
	int productId;
	string name;
	double price;
	int quantity;


	public:
	void acceptDetails(){
		cout<<"Enter Product Id : "<<endl;
		cin>>productId;

		cout<<"Enter Name : "<<endl;
		cin>>name;

		cout<<"Enter Price : "<<endl;
		cin>>price;

		cout<<"Enter Quantity : "<<endl;
		cin>>quantity;

	}
	void displayDetails() const{
		cout<<productId<<"\t\t"<<name<<"\t\t"<<price<<"\t\t"<<quantity<<"\t\t"<<totalValue()<<endl;

	}
	double totalValue() const{
		return price*quantity;
	}
	bool isLowStock(int threshold) const{
		if(quantity<threshold){
			return true;
		}
		return false;
	}

	const string& getName() const {
		return name;
	}

};

double reorderCost(int qty, double unitPrice){
	return qty*unitPrice;
}

double reorderCost(double qty, double unitPrice){
	return qty*unitPrice;
}

double reorderCost(int qty, double unitPrice, double taxRate){
	return (qty*unitPrice)*(taxRate/100+1);
}

double applyDiscount(double price, double discountPercent = 10.0){
	return (price-price*(discountPercent/100));
}

int main() {

	Product p[5];

	for(int i=0;i<5;i++){
		p[i].acceptDetails();
	}

	int threshold;
	cout<<"Enter Threshold : "<<endl;
	cin>>threshold;

	cout<<"================= INVENTORY REPORT ================="<<endl;
	cout<<"ID\t\tName\t\tPrice\t\tQty\t\tTotal Value"<<endl;

	double highestTotal=0.0;
	int index;
	for(int i=0;i<5;i++){
		p[i].displayDetails();
		if(highestTotal<p[i].totalValue()){
			highestTotal=p[i].totalValue();
			index=i;
		}
	}
	cout<<"Highest Value Product : "<<p[index]<<" ( Rs. "<<highestTotal<<" )"<<endl;

	cout<<"Low Stock  :";
	for(int i=0;i<5;i++){
		if(p[i].isLowStock(threshold)){
			cout<<p[i].getName()<<"  ";
		}
	}

	cout<<"Reordered Cost = "<<reorderCost(15,500.50)<<endl;
	cout<<"Reordered Cost = "<<reorderCost(15.6,500.50)<<endl;
	cout<<"Reordered Cost = "<<reorderCost(15,500.50,18)<<endl;

	cout<<"Final cost = "<<applyDiscount(499)<<endl;
	cout<<"Final cost = "<<applyDiscount(499,12)<<endl;
	return 0;
}
