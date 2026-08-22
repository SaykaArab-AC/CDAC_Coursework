import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindIndexOfElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        
        System.out.println("Enter Element to search :");
        int target=sc.nextInt();
        System.out.println("Enter Array Elements : ");
        for (int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        int index=Arrays.binarySearch(arr,target);
        if(index>0)
            System.out.println("Index of element "+target+" = "+index);
        else
            System.out.println("Not Found");
        
    }
}
