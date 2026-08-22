import java.util.Scanner;

public class Pattern9 {
    public static void main(String arsg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of Rows :");
        int row=sc.nextInt();

        //Upper Triangle
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print("  ");
            }

            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //Lower Triangle
        for(int i=row;i>=1;i--){
            for(int j=1;j<=row-i;j++){
                System.out.print("  ");
            }

            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    } 
}