
public class Employee {

	String name;
	String address;
	int age;
	boolean gender;
	int basicSalary;
	
	
	public Employee(String name) {
		this.name = name;
	}

	public Employee() {
		
	}

	public Employee(String name, String address, int age, boolean gender, int basicSalary) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.basicSalary = basicSalary;
	}

	void addEmployee() {
		System.out.println("Enter Name :");
		name=ConsoleInput.getString();
		System.out.println("Enter Address :");
		address=ConsoleInput.getString();
		System.out.println("Enter Age :");
		age=ConsoleInput.getInt();
		System.out.println("Enter Gender :");
		gender=ConsoleInput.getBoolean();
		System.out.println("Enter Basic Salary :");
		basicSalary=ConsoleInput.getInt();
	}
	
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		while(true) {
			System.out.println("**********************  ~ MAIN MENU ~  ***********************");
			System.out.println("1.ADD EMPLOYEE");
			System.out.println("2.DISPLAY EMPLOYEE");
			System.out.println("3.SORT EMPLOYEES");
			System.out.println("4.SAVE EMPLOYEE");
			System.out.println("5.LOAD EMPLOYEE");
			System.out.println("0.EXIT");
			System.out.println("**************************************************************");
			
			System.out.println("Enter Your Choice :");
			int choice=ConsoleInput.getInt();
			
			switch(choice) {
			case 0:
				return;
			case 1:
				System.out.println("**********************  ~ ADD ~  ***********************");
				System.out.println("1.ADD MANAGER");
				System.out.println("2.ADD ENGINEER");
				System.out.println("3.ADD SALESPERSON");
				System.out.println("0.EXIT TO MAIN MENU");
				System.out.println("*****************************************************");
				
				System.out.println("Enter Your Choice :");
				choice=ConsoleInput.getInt();
				
				switch(choice) {
				case 0:
					break;
				case 1:
					Manager m=new Manager();
					m.addManager();
					ll.addLast(m);
					break;
				case 2:
					Engineer e=new Engineer();
					e.addEngineer();
					ll.addLast(e);
					break;
				case 3:
					SalesPerson s=new SalesPerson();
					s.addSalesPerson();
					ll.addLast(s);
					break;
				default:
					System.out.println("Invalid Choice !!");
				
				}
				break;
			case 2:
				System.out.println("**********************  ~ DISPLAY ~  ***********************");
				System.out.println("1.ALL EMPLOYEEES");
				System.out.println("2.FIRST EMPLOYEE");
				System.out.println("3.NEXT EMPLOYEE");
				System.out.println("4.PREVIOUS EMPLOYEE");
				System.out.println("5.LAST EMPLOYEE");
				System.out.println("0.EXIT TO MAIN MENU");
				System.out.println("************************************************************");
				
				System.out.println("Enter Your Choice :");
				choice=ConsoleInput.getInt();
				
				switch(choice) {
				case 0:
					return;
				case 1:
					ll.displayAll();
					break;
				case 2:
					ll.displayFirst();
					break;
				case 3:
					
					break;
				case 4:
					break;
				case 5:
					ll.displayLast();
					break;
				default:
					System.out.println("Invalid Choice !!");
				
				}
				
				break;
			case 3:
				System.out.println("**********************  ~ SORT ~  ***********************");
				System.out.println("1.ALL MANAGER");
				System.out.println("2.ALL ENGINEER");
				System.out.println("3.ALL SALESPERSON");
				System.out.println("4.ALL EMPLOYEES IN ALPHABETICAL ORDER (ASC)");
				System.out.println("5.ALL EMPLOYEES IN ALPHABETICAL ORDER (DESC)");
				System.out.println("0.EXIT TO MAIN MENU");
				System.out.println("**********************************************************");
				
				System.out.println("Enter Your Choice :");
				choice=ConsoleInput.getInt();
				
				switch(choice) {
				case 0:
					return;
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				default:
					System.out.println("Invalid Choice !!");
				}
				
				break;
			case 4:
				System.out.println("**********************  ~ SAVE ~  ***********************");
				
				System.out.println("*********************************************************");
				break;
			case 5:
				System.out.println("**********************  ~ LOAD ~  ***********************");
				
				System.out.println("*********************************************************");
				break;
			default:
				System.out.println("Invalid Choice !!");
			}
		}

	}

}
