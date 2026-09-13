
public class Engineer extends Employee {
	double overtime;
	
	public Engineer() {
		super();
	}

	public Engineer(String name, String address, int age, boolean gender, int basicSalary,double overtime) {
		super(name, address, age, gender, basicSalary);
		this.overtime=overtime;
	}
	
	void addEngineer() {
		super.addEmployee();
		System.out.println("Enter Overtime :");
		overtime=ConsoleInput.getDouble();
	}
}
