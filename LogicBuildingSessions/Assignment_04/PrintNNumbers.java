import java.util.Scanner;

public class PrintNNumbers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number N :");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
    }    
}
