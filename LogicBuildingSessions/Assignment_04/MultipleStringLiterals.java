public class MultipleStringLiterals {
    public static void main(String args[]){
        String str1="Sayka";
        String str2="Sayka";
        String str3="Sayka";
        boolean isEquals=false;

        if(str1==str2 && str2==str3){
            isEquals=true;
        }
        System.out.println("All Strings point to the same object ? : "+isEquals);
    }
}   