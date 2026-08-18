import java.util.Scanner;

public class GradeEvaluation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter Maths Marks :");
        int maths=sc.nextInt();

        System.out.println("Enter English Marks :");
        int english=sc.nextInt();

        System.out.println("Enter History Marks :");
        int history=sc.nextInt();

        System.out.println("Enter Science Marks :");
        int science=sc.nextInt();

        float avg=(maths+english+history+science)/4f;
        System.out.println("Average Marks = "+avg);
        if(avg>=90){
            System.out.println("Grade A");
        }
        else if (avg<90 && avg>=70){
            System.out.println("Grade B");
        }
        else if (avg<70 && avg>=50){
            System.out.println("Grade C");
        }
        else if (avg<50 && avg>=30){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }


    }
}