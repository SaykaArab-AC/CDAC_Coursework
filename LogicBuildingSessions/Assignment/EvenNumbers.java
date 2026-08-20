import java.util.*;
public class EvenNumbers{
    public static void main(String args[]){
	printEvenNumbers();
    }

    public static void printEvenNumbers(){
	int i=1;
	System.out.println("Even Numbers are :");
	while(i<=50){
		if(i%2==0)
			System.out.print(i+" ");
		i++;
	}
    }
}