import java.util.*;

public class PositiveNumber{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int num;

        System.out.println("Enter a number :");
        num=sc.nextInt();
        if(num>0){
            System.out.println(num+" is a Positive number");
        }
        else{
            System.out.println(num+" is not a Positive number");
        }
    }
}