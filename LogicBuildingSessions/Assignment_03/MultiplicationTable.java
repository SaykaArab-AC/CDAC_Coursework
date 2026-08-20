import java.util.*;
public class MultiplicationTable{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter the table u want to print :");
	int num=sc.nextInt();
	printMultiplicationTable(num);
        }

    public static void printMultiplicationTable(int num){
	System.out.println("Table of "+num+" :");
	for(int i=1;i<=10;i++){
		System.out.println(num+" X "+i+"  = "+ (num*i));
	}	
	
    }
}