import java.util.Scanner;

public class FactorialNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to find its factorial :");
        int n=sc.nextInt();

        int fact=factorial(n);
        System.out.println("Factorial of "+n+" ("+n+"!) = "+fact);        
    }    
    public static int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            if(i==0){
                System.out.print("1");
            }
            else{
                fact=fact*i;
            }
        }
        return fact;
    }
}

