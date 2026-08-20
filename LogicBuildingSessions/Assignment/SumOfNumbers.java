import java.util.*;
public class SumOfNumbers{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number :");
        int num1=sc.nextInt();

        System.out.println("Enter second number :");
        int num2=sc.nextInt();

        int result=sumOfTwoNumbers(num1,num2);
        System.out.println("Sum = "+result);
    }

    public static int sumOfTwoNumbers(int num1,int num2){
        return num1+num2;
    }
}