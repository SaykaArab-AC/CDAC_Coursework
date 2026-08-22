import java.util.Scanner;

public class Pattern1 {
    public static void main(String arsg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of Rows :");
        int row=sc.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                if(j!=1){
                    System.out.print("* ");
                }
                System.out.print(i+" ");
            }
            System.out.println();
        }
        
        for(int i=row;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(j!=1){
                    System.out.print("* ");
                }
                System.out.print(i+" ");
            }
            System.out.println();
        }
        

    }
}
