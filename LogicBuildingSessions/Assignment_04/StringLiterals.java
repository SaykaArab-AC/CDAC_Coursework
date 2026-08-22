public class StringLiterals {
    public static void main(String args[]){
        String str1="Hello";
        String str2="Hello";
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
