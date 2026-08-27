#include <iostream>
#include <iomanip>
using namespace std;

class Employee{
	private:
		int empId;
		string name;
		string department;
		char grade=' ';
		double basicSalary=0;
		bool isActive=true;
		static int employeeCount;
		static int nextEmpId;

	public :
		Employee(){
			empId=nextEmpId;
			nextEmpId++;
			employeeCount++;
		}

	public:
		double getBasicSalary() const {
			return basicSalary;
		}

		void setBasicSalary(double basicSalary) {
			if(basicSalary > 10000 && basicSalary < 500000)
				this->basicSalary = basicSalary;
			else
				cout<<"Salary must be between Rs.10,000 and Rs.5,00,000. Value rejected."<<endl;
		}

		const string& getDepartment() const {
			return department;
		}

		void setDepartment(const string &department) {
			if(department=="Engineering" || department=="HR" ||department=="Finance" ||department=="Operations")
				this->department = department;
			else
				cout<<"ERROR: Marketing' is not a registered department."<<endl;
		}

		int getEmpId() const {
			return empId;
		}

		static int getEmployeeCount() {
			return employeeCount;
		}

		char getGrade() const {
			return grade;
		}

		void setGrade(char grade) {
			if(grade=='A' || grade=='B' ||grade=='C'||grade=='D')
				this->grade = grade;
			else
				cout<<"ERROR: Invalid grade 'X'. Accepted values: A, B, C, D."<<endl;
		}

		bool getIsActive() const {
			return isActive;
		}

		const string& getName() const {
			return name;
		}

		void setName(const string &name) {
			this->name = name;
		}

		double computeAllowances() const{
			if(grade=='A')
				return basicSalary*0.4;
			else if(grade=='B')
				return basicSalary*0.30;
			else if(grade=='C')
				return basicSalary*0.2;
			else if(grade=='D')
				return basicSalary*0.1;
			else
				return -1;
		}

		double computeGrossSalary() const{
			return basicSalary + computeAllowances();
		}

		double computeTax() const{
			if(computeGrossSalary()<=50000){
				return 0.0;
			}
			else if(computeGrossSalary()>50000 && computeGrossSalary()<100000){
				return computeGrossSalary() *  0.10;
			}
			else{
				return 5000+0.20*computeGrossSalary();
			}
		}

		double computeNetSalary() const{
			return computeGrossSalary() - computeTax();
		}
		bool deactivate(){
			isActive=false;
			return isActive;
		}
		void acceptDetails(){
			char grd;
			double basicSal;
			string dept;
			string nm;

			cout<<"Enter Grade :";
			cin>>grd;
			setGrade(grd);

			cout<<"Enter Basic Salary :";
			cin>>basicSal;
			setBasicSalary(basicSal);

			cout<<"Enter Department :";
			cin>>dept;
			setDepartment(dept);

			cout<<"Enter Employee Name :";
			cin>>nm;
			setName(nm);
		}
		void printPayslip() const{
			cout<<left;
			cout<<"============================================"<<endl;
			cout<<"\tEMPLOYEE PAYSLIP — AUG 2026"<<endl;
			cout<<"============================================"<<endl;
			cout<<setw(17)<<"Emp ID"<<":"<<getEmpId()<<endl;
			cout<<setw(17)<<"Name"<<":"<<getName()<<endl;
			cout<<setw(17)<<"Department"<<":"<<getDepartment()<<endl;
			cout<<setw(17)<<"Grade"<<":"<<getGrade()<<endl;
			cout<<setw(17)<<"Status"<<":"<<getIsActive()<<endl;
			cout<<"-------------------------------------------"<<endl;

			cout<<setw(17)<<"Basic Salary"<<":"<<getBasicSalary()<<endl;
			cout<<setw(17)<<"Allowances (30%)"<<":"<<computeAllowances()<<endl;
			cout<<setw(17)<<"Gross Salary"<<":"<<computeGrossSalary()<<endl;
			cout<<"-------------------------------------------"<<endl;
			cout<<setw(17)<<"Tax Deduction"<<":"<<computeTax()<<endl;
			cout<<setw(17)<<"Net Salary"<<":"<<computeNetSalary()<<endl;
			cout<<"============================================"<<endl;

		}
};

int Employee::employeeCount = 0;
int Employee::nextEmpId=1001;

int main() {
	Employee e1;
	Employee* e2 = new Employee();
	Employee* e3 = new Employee();
	e1.acceptDetails();
	e2->acceptDetails();
	e3->acceptDetails();

	// e1.empId = 999;
	// e1.basicSalary = -1000;

	e1.printPayslip();
	e2->printPayslip();
	e3->printPayslip();

	e3->deactivate();
	if (!e3->getIsActive()){
		cout << e3->getName() << " is no longer active. Payroll skipped." << endl;
	}

	cout << "Total Employees : " << Employee::getEmployeeCount() << endl;
	delete e2;
	delete e3;
	return 0;
}
