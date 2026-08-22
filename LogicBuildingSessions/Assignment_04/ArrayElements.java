import java.util.Scanner;

public class ArrayElements {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.println("Enter Array Elements : ");
        for (int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array Elements are :");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
