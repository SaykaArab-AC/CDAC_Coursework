public class StringEquality {
    public static void main(String args[]){
        String str1=new String("hello");
        String str2=new String("hello");
        boolean isEquals=false;
        
        if(str1==str2){
            isEquals=true;
        }

        System.out.println("Both variables point to the same object ( == ) : "+isEquals);
        
        isEquals=false;
        if(str1.equals(str2)){
            isEquals=true;
        }
        System.out.println("Both variables point to the same object ( equals() ) : "+isEquals);
    }
}
