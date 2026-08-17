import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float length;
        float breadth;
        float area;
        
        System.out.println("Enter length :");
        length=sc.nextFloat();

        System.out.println("Enter breadth :");
        breadth=sc.nextFloat();

        area=length*breadth;

        System.out.println("Area of Rectangle = "+area+" sq units");
    }
}
