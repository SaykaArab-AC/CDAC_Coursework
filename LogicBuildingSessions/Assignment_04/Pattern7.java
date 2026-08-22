import java.util.Scanner;

public class Pattern7 {
    public static void main(String arsg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of Rows :");
        int row=sc.nextInt();

        for(int i=1,k=1;i<=row;i++){
            for(int j=1;j<=i;j++,k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    } 
}
