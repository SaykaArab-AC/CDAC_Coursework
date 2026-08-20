import java.util.*;
public class CheckAge{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the age :");
        int age=sc.nextInt();

	System.out.println("Category = "+checkAgeCategory(age));

    }

    public static String checkAgeCategory(int age){
	return age<=18 ? "Minor": (age<=60 ? "Adult" : "Senior Citizen");
    }
}