import java.util.Scanner;

public class PrintStringElements {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Size :");
        int size=sc.nextInt();

        String names[]=new String[size];
        System.out.println("Enter Names :");
        for(int i=0;i<size;i++){
            names[i]=sc.next();
        }

        System.out.println("Names :");
        for(String i:names){
            System.out.print(i+" ");
        }
    }
}
