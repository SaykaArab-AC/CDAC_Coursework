import java.util.*;
public class EvenNumbers{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number N :");
        int n=sc.nextInt();
	    printEvenNumbers(n);
    }

    public static void printEvenNumbers(int num){
        System.out.print("Even Numbers are : ");
        for(int i=1;i<=num;i++){
            if(i%2==0)
                System.out.print(i+" ");
        }
    }
}