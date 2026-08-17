import java.util.*;

public class GoodMorning {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int time;
        System.out.println("Enter Time(24hrs) :");
        time=sc.nextInt();
        if(time>=5 && time<=12){
            System.out.println("Good Morning :) ");
        }
        else{
            System.out.println("Not Morning !");
        }
    }
}
