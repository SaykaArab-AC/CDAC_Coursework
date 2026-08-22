import java.util.Scanner;

public class MultiplesOf3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number N :");
        int n=sc.nextInt();

        System.out.println("Multiples of 3 upto "+n+" ->");
        for(int i=1;i<=n;i++){
            if(i%3==0){
                System.out.print(i+" ");
            }
        }
    }    
}
