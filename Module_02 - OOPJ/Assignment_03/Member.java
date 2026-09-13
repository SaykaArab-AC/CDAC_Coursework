
public class Member {
	String name;
	int age;
	String phoneNumber;
	String address;
	int salary;
	
	void printSalary() {
		System.out.println("Salary = "+salary);
	}
	
	void getInfo() {
		System.out.println("Enter Name : ");
		name=ConsoleInput.getString();
		System.out.println("Enter Age : ");
		age=ConsoleInput.getInt();
		System.out.println("Enter Phone Number : ");
		phoneNumber=ConsoleInput.getString();
		System.out.println("Enter Address : ");
		address=ConsoleInput.getString();
		System.out.println("Enter Salary : ");
		salary=ConsoleInput.getInt();
	}

	void display() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Phone Number : "+phoneNumber);
		System.out.println("Address : "+address);
		System.out.println("Salary : "+salary);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public static void main(String args[]){
		Member m1=new Member();
		m1.getInfo();
		
		PrimeMembers pm=new PrimeMembers();
		pm.getInfo();
		
		pm.display();
		
	}
}
