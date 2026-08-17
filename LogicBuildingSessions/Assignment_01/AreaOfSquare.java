import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float side;
        float area;
        
        System.out.println("Enter side :");
        
        side=sc.nextFloat();
        area=side*side;

        System.out.println("Area of Square = "+area+" sq units");
    }
}
