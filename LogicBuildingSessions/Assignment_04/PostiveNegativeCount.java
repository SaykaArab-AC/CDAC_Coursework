import java.util.Scanner;

public class PostiveNegativeCount {
    
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Size of array : ");
            int size=sc.nextInt();
            int arr[]=new int[size];

            System.out.println("Enter Array Elements : ");
            for (int i=0;i<size;i++) {
                arr[i]=sc.nextInt();
            }
            
            int positiveCount=0;
            int negativeCount=0;
            for (int i : arr) {
                if(i==0)
                    continue;
                if(i>0){
                    positiveCount++;
                }
                else{
                    negativeCount++;
                }
            }

            System.out.println("Positive Numbers = "+positiveCount);
            System.out.println("Negative Numbers = "+negativeCount);
        }

}
