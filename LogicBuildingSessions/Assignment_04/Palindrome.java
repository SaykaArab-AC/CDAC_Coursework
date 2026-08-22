import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter String :");
        String str=sc.next();
        
        for(int i=0,j=str.length()-1;i<=(str.length()-1)/2;i++,j--){
            if(str.charAt(i)==str.charAt(j)){
                continue;
            }else{
                System.out.println("String '"+str+"' is not a Palindrome");
                return;
            }
        }
        System.out.println("String '"+str+"' is a Palindrome");
    }
}
