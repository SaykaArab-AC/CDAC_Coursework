import java.util.Scanner;

public class Pattern4 {
    public static void main(String arsg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of Rows :");
        int row=sc.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    } 
}
