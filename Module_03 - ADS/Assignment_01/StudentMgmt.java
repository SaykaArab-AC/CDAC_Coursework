package practice.assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMgmt {

	static ArrayList<Integer> ids=new ArrayList<Integer>();

	static void addStudent(int id) {
		ids.addLast(id);
	}
	
	static void removeStudent() {
		System.out.println("Student "+ids.removeFirst()+" submits");
	}
	
	static void display() {
		System.out.println(ids);
		System.out.println("Queue becomes :"+ids);
	}
	
	static void searchStudent(Scanner sc) {
		System.out.println("Enter id :");
		int id=sc.nextInt();
		if(ids.contains(id)) {
			System.out.println("Student "+id+" is waiting");
		}
		else {
			System.out.println("Student "+id+" is not waiting");			
		}
		
	}
	
	static void waitingStd() {
		System.out.println("Current number of students : "+ids.size());
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("*************************************");
			System.out.println("0.EXIT");
			System.out.println("1.ADD STUDENT");
			System.out.println("2.REMOVE STUDENT");
			System.out.println("3.DISPLAY CURRENT STUDENT");
			System.out.println("4.SEARCH IF STUDENT WAITING");
			System.out.println("5.DISPLAY COUNT OF STUDENT WAITING");
			System.out.println("*************************************");
			
			System.out.println("Enter your choice :");
			int ch=sc.nextInt();
			
			switch(ch) {
			case 0:
				System.out.println("Exiting...");
				return;
			case 1:
				System.out.println("Enter student id :");
				int id=sc.nextInt();
				addStudent(id);
				break;
				
			case 2:
				removeStudent();
				break;
				
			case 3:
				display();
				break;
			
			case 4:
				searchStudent(sc);
				break;
			
			case 5:
				waitingStd();
				break;
			
			default:
				System.out.println("Invalid choice !!");
			}
		}
	}

}


