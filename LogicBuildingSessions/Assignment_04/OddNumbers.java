import java.util.*;
public class OddNumbers{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number N :");
        int n=sc.nextInt();
	    int result=printEvenNumbers(n);
        System.out.print(result+" ");
    }

    public static int printEvenNumbers(int num){
        int sum=0;
        System.out.print("Sum of Odd Numbers are = ");
        for(int i=1;i<=num;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }
}