public class StringConcatenation {
    public static void main(String args[]){
        String str1="Hello";
        String str2="World";
        String str3=str1+str2;
        boolean isEquals=false;

        if(str1==str3){
            isEquals=true;
        }
        System.out.println("Is str3 pointing to the same object str1 ? :"+isEquals);
    }
}
