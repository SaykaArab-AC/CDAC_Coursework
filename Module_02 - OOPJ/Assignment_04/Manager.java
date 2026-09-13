
public class Manager extends Employee {
	double hra;

	
	public Manager() {
		
	}

	public Manager(String name, String address, int age, boolean gender, int basicSalary,double hra) {
		super(name, address, age, gender, basicSalary);
		this.hra=hra;
	}
	
	void addManager() {
		super.addEmployee();
		System.out.println("Enter HRA :");
		hra=ConsoleInput.getDouble();
	}

}
