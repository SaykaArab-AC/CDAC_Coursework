import java.util.Scanner;

public class Pattern3 {
    public static void main(String arsg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of Rows :");
        int row=sc.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
               System.out.print(2*j-1);
                if(j<i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    } 
}
