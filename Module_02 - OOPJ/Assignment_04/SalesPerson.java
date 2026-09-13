
public class SalesPerson extends Employee {
	double commission;

	
	public SalesPerson() {
		super();
	}


	public SalesPerson(String name, String address, int age, boolean gender, int basicSalary,double commission) {
		super(name, address, age, gender, basicSalary);
		this.commission=commission;
	}
	
	void addSalesPerson() {
		super.addEmployee();
		System.out.println("Enter Commission :");
		commission=ConsoleInput.getDouble();
	}
	
}
