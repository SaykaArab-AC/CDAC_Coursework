import java.util.*;
public class PositiveNumbers{
    public static void main(String args[]){

	System.out.println("Postive Number = "+askForPositiveNumbers());

    }

    public static int askForPositiveNumbers(){
	Scanner sc=new Scanner(System.in);
	int num;
	
	do{
		System.out.println("Enter a Positive Number :");
		num=sc.nextInt();
	}
	while(num<0);

	return num;
    }
}