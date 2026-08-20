import java.util.*;
public class SumOfNNumbers{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter number N (Sum of 1-N):");
	int num=sc.nextInt();
	
	System.out.println("Sum = "+calculateSum(num));
        }

    public static int calculateSum(int num){
	int sum=0;
	for(int i=1;i<=num;i++){
		sum+=i;
	}	
	return sum;
    }	
}