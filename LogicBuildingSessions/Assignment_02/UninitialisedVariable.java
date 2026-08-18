import java.util.Scanner;

public class UninitialisedVariable {
    public static void main(String args[]){
        //Local Variables
        // byte a;
        // short b;
        // int c;
        // long d;
        // float e;
        // double f;
        // char g;
        // boolean h;
        //This will give compile time error.

        byte a=-12;
        short b=2;
        int c=1122112299;
        long d=999999999999999999L;
        float e=90.9f;
        double f=33.16;
        char g='s';
        boolean h=true;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
        System.out.println("e = "+e);
        System.out.println("f = "+f);
        System.out.println("g = "+g);
        System.out.println("h = "+h);
    }
}
