import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SearchingElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array : ");
        int size=sc.nextInt();
        Integer arr[]=new Integer[size];
        
        System.out.println("Enter Element to search :");
        int target=sc.nextInt();
        System.out.println("Enter Array Elements : ");
        for (int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }

        List<Integer> list=Arrays.asList(arr);
        boolean isFound=list.contains(target);

        if(isFound){
            System.out.println("Target "+target+" Found");
        }
        else{
            System.out.println("Target "+target+" Not Found");
        }

    }
}
