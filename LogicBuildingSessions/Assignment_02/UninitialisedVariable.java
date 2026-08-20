import java.util.Scanner;

public class UninitialisedVariable {
    byte a;
    short b;
    int c;
    long d;
    float e;
    double f;
    char g;
    boolean h;

    public static void main(String args[]){
	UninitialisedVariable obj=new UninitialisedVariable();

        System.out.println("a = "+obj.a);
        System.out.println("b = "+obj.b);
        System.out.println("c = "+obj.c);
        System.out.println("d = "+obj.d);
        System.out.println("e = "+obj.e);
        System.out.println("f = "+obj.f);
        System.out.println("g = "+obj.g);
        System.out.println("h = "+obj.h);
    }
}
