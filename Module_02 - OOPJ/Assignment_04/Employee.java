import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {

	String name;
	String address;
	int age;
	boolean gender;
	int basicSalary;

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
	
	public static void writeInFile() {
		
		
	}
	public static void main(String[] args) {
		final int ADD_EMPLOYEE=1;
		final int DISPLAY_EMPLOYEE=2;
		final int SORT_EMPLOYEE=3;
		final int SAVE_EMPLOYEE=4;
		final int LOAD_EMPLOYEE=5;
		final int EXIT=0;
		
		final int ADD_MANAGER=1;
		final int ADD_ENGINEER=2;
		final int ADD_SALESPERSON=3;

		final int DISPLAY_ALL_EMPLOYEEES=1;
		final int DISPLAY_FIRST_EMPLOYEEE=2;
		final int DISPLAY_NEXT_EMPLOYEEE=3;
		final int DISPLAY_PREV_EMPLOYEEE=4;
		final int DISPLAY_LAST_EMPLOYEEE=5;

		final int SORT_ALL_MANAGER=1;
		final int SORT_ALL_ENGINEER=2;
		final int SORT_ALL_SALESPERSON=3;
		final int SORT_ALL_EMP_ASC=4;
		final int SORT_ALL_EMP_DESC=5;
		
		String pathName="E:\\# AC_COURSE (C-DAC)\\MODULE_02 - OOP\\ASSIGNMENT\\A4\\src\\EmployeeRecord.txt";
		File file=new File(pathName);
		
		LinkedList ll=new LinkedList();
		while(true) {
			System.out.println("**********************  ~ MAIN MENU ~  *************************");
			System.out.println("1.ADD EMPLOYEE");
			System.out.println("2.DISPLAY EMPLOYEE");
			System.out.println("3.SORT EMPLOYEES");
			System.out.println("4.SAVE EMPLOYEE");
			System.out.println("5.LOAD EMPLOYEE");
			System.out.println("0.EXIT");
			System.out.println("****************************************************************");
			
			System.out.println("Enter Your Choice :");
			int choice=ConsoleInput.getInt();
			
			switch(choice) {
			case EXIT:
				System.out.println("Thank you for using Employee Management System. Goodbye!");
				return;
				
			case ADD_EMPLOYEE:
				
				System.out.println("**********************  ~ ADD ~  ***************************");
				System.out.println("1.ADD MANAGER");
				System.out.println("2.ADD ENGINEER");
				System.out.println("3.ADD SALESPERSON");
				System.out.println("0.EXIT TO MAIN MENU");
				System.out.println("************************************************************");
				
				System.out.println("Enter Your Choice :");
				choice=ConsoleInput.getInt();
				
				switch(choice) {
				case EXIT:
					break;
					
				case ADD_MANAGER:
					Manager m=new Manager();
					m.addManager();
					ll.addLast(m);
					
					break;
					
				case ADD_ENGINEER:
					Engineer e=new Engineer();
					e.addEngineer();
					ll.addLast(e);
					break;
					
				case ADD_SALESPERSON:
					SalesPerson s=new SalesPerson();
					s.addSalesPerson();
					ll.addLast(s);
					break;
					
				default:
					System.out.println("Invalid Choice !!");
				
				}
				break;
				
			case DISPLAY_EMPLOYEE:
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
				case EXIT:
					return;
					
				case DISPLAY_ALL_EMPLOYEEES:
					ll.displayAll();
					break;
				
				case DISPLAY_FIRST_EMPLOYEEE:
					ll.displayFirst();
					break;
				
				case DISPLAY_NEXT_EMPLOYEEE:
					
					break;
				
				case DISPLAY_PREV_EMPLOYEEE:
					break;
				
				case DISPLAY_LAST_EMPLOYEEE:
					ll.displayLast();
					break;
				
				default:
					System.out.println("Invalid Choice !!");
				
				}
				
				break;
				
			case SORT_EMPLOYEE:
				System.out.println("**********************  ~ SORT ~  **************************");
				System.out.println("1.ALL MANAGER");
				System.out.println("2.ALL ENGINEER");
				System.out.println("3.ALL SALESPERSON");
				System.out.println("4.ALL EMPLOYEES IN ALPHABETICAL ORDER (ASC)");
				System.out.println("5.ALL EMPLOYEES IN ALPHABETICAL ORDER (DESC)");
				System.out.println("0.EXIT TO MAIN MENU");
				System.out.println("************************************************************");
				
				System.out.println("Enter Your Choice :");
				choice=ConsoleInput.getInt();
				
				switch(choice) {
				case EXIT:
					return;
				
				case SORT_ALL_MANAGER:
					ll.sortManager();
					break;
				
				case SORT_ALL_ENGINEER:
					ll.sortEngineer();
					break;
				
				case SORT_ALL_SALESPERSON:
					ll.sortSalesPerson();
					break;
				
				case SORT_ALL_EMP_ASC:
					ll.sortEmployeesAsc();
					break;
				
				case SORT_ALL_EMP_DESC:
					ll.sortEmployeesDesc();
					break;
				
				default:
					System.out.println("Invalid Choice !!");
				}
				
				break;
			
			case SAVE_EMPLOYEE:
				System.out.println("**********************  ~ SAVE ~  **************************");
				try(FileOutputStream fos=new FileOutputStream(file);ObjectOutputStream oos=new ObjectOutputStream(fos);){
					oos.writeObject(ll);
					
					System.out.println("Record Saved to File..");
				}
				catch (IOException e) {
					e.printStackTrace();
				}
				
				System.out.println("*************************************************************");
				break;
			
			case LOAD_EMPLOYEE:
				
				System.out.println("**********************  ~ LOAD ~  *******************************");
				try(FileInputStream fis=new FileInputStream(file);ObjectInputStream ois=new ObjectInputStream(fis)){
					LinkedList llist=(LinkedList) ois.readObject();
					llist.displayAll();
					
					System.out.println("Loaded Successfully ..");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				System.out.println("****************************************************************");
				break;
			
			default:
				System.out.println("Invalid Choice !!");
			}
		}

	}

}
