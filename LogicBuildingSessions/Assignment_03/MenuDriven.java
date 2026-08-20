import java.util.*;
public class MenuDriven{
    byte a;
    short b;
    int c;
    long d;
    float e;
    double f;
    char g;
    boolean h;

    public static void main(String args[]){
	Scanner sc=new Scanner(System.in); 
	int ch;
	do{
	System.out.println("\n*******************************************");
	System.out.println("0.Exit");  
	System.out.println("1.Grade Evaluation System");
	System.out.println("2.Check Leap Year");
	System.out.println("3.Day of Week");
	System.out.println("4.Identify Default Values of Variables");
	System.out.println("*******************************************");
	System.out.println("\nEnter Your Choice :");
	ch=sc.nextInt();

	switch(ch){
		case 1:calculateGrades();
			break;

		case 2:checkLeapYear();
			break;

		case 3:checkDayOfWeek();
			break;

		case 4:defaultValues();
			break;

		case 5:break;

	}
	}while(ch!=0);
	
    }
    
    public static void calculateGrades(){
	Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter Maths Marks :");
        int maths=sc.nextInt();

        System.out.println("Enter English Marks :");
        int english=sc.nextInt();

        System.out.println("Enter History Marks :");
        int history=sc.nextInt();

        System.out.println("Enter Science Marks :");
        int science=sc.nextInt();

        float avg=(maths+english+history+science)/4f;
        System.out.println("Average Marks = "+avg);
        if(avg>=90){
            System.out.println("Grade A");
        }
        else if (avg<90 && avg>=70){
            System.out.println("Grade B");
        }
        else if (avg<70 && avg>=50){
            System.out.println("Grade C");
        }
        else if (avg<50 && avg>=30){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }
   }

   public static void checkLeapYear(){
	Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Leap Year :");
        int year=sc.nextInt();

        if((year%4==0 && year %100 !=0) || year%400==0){
            System.out.println(year+" is a Leap Year.");
        }
        else{
            System.out.println(year+" is not a Leap Year.");
        }
   }

  public static void checkDayOfWeek(){
	Scanner sc=new Scanner(System.in);

        System.out.println("Enter Day number :");
        int day=sc.nextInt();

        switch(day){
            case 1:
                System.out.println("It's MONDAY");
                break;
            case 2:
                System.out.println("It's TUESDAY");
                break;
            case 3:
                System.out.println("It's WEDNESDAY");
                break;
            case 4:
                System.out.println("It's THURSDAY");
                break;
            case 5:
                System.out.println("It's FRIDAY");
                break;
            case 6:
                System.out.println("It's SATURDAY");
                break;
            case 7:
                System.out.println("It's SUNDAY");
                break;
            default:
                System.out.println("Invalid Day Number!!");
        }
    }

   public static void defaultValues(){
	MenuDriven obj=new MenuDriven();
	
	System.out.println("Default Values are :");
        System.out.println("a = "+obj.a);
        System.out.println("b = "+obj.b);
        System.out.println("c = "+obj.c);
        System.out.println("d = "+obj.d);
        System.out.println("e = "+obj.e);
        System.out.println("f = "+obj.f);
        System.out.println("g = "+obj.g);
        System.out.println("h = "+obj.h);
   }
}