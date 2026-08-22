public class InternStringPool {
    public static void main(String args[]){
        String str1=new String("hello");
        String str2=str1.intern();
        String str3="hello";
        boolean isEquals=false;

        if(str2==str3){
            isEquals=true;
        }
        System.out.println("Is str2 pointing to the same object str3 ? : "+isEquals);
    }
}   