
class Employee
{
	String name;
	int yearOfJoining;
	int salary;
	String address;
	int Salary;
	int Hours;

	Employee(String name,int yearOfJoining,int salary,String address)
	{
		this.name=name;
		this.yearOfJoining=yearOfJoining;
		this.salary=salary;
		this.address=address;
	}
	
	public Employee() {
	}

	void getInfo(int iSalary,int iHours)
	{
		this.Salary=iSalary;
		this.Hours=iHours;
	}

	void addSal()
	{
		if(Salary<500)
			Salary=Salary+10;
	}

	void addWork()
	{
		if(Hours>6)
			Salary=Salary+5;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}