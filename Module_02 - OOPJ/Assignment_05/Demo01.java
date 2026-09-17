
public class Demo01 {

	public static void main(String[] args) {
		
		// Q1
		String str="Java Exercises!";
		System.out.println("The character at position 0 is : "+str.charAt(0));
		System.out.println("The character at position 10 is : "+str.charAt(10));

		// Q2
		String str1="This is Exercise 1";
		String str2="This is Exercise 1";
		
		if(str1.length()==str2.length()) {
			for(int iTemp=0;iTemp<str1.length();iTemp++) {
				if(str1.charAt(iTemp)!=str2.charAt(iTemp)) {
					System.out.println("This is Exercise 1 is less than This is Exercise 2");
					return;
				}
				else {
					continue;
				}
			}
			System.out.println("They are Equal");
		}
		
		// Q3
		String str4="Python Exercises";
		String str5="Python Exercise";
		String str6="se";
		
		System.out.println("'"+str4+"' ends with '"+str6+"' ? "+str4.endsWith(str6));
		System.out.println("'"+str5+"' ends with '"+str6+"' ? "+str5.endsWith(str6));
		
		// Q4
		String str7="The quick brown fox jumps over the lazy dog".toLowerCase().trim();
		int [] charArray=new int[26];
		char [] charArray2="abcdefghijklmnopqrstuvwxyz".toCharArray();
		
		for(int iTemp=0;iTemp<str7.length()-1;iTemp++) {
			char ch=str7.charAt(iTemp);
			if(ch>='a' && ch<='z')
				charArray[ch - 'a']=str7.indexOf(str7.charAt(iTemp));
		}
		
		for(int iTemp=0;iTemp<charArray.length;iTemp++) {
			System.out.print(charArray2[iTemp]+"\t");			
		}
		System.out.println();
		System.out.println("=".repeat(210));
		for(int iTemp=0;iTemp<charArray.length;iTemp++) {
			System.out.print((charArray[iTemp])+"\t");
			
		}
		System.out.println();
		
		// Q5
		String str8="The quick brown fox jumps over the lazy dog.";
		System.out.println("REPLACED str8 : "+str8.replace("fox","cat"));
		
		// Q6
		String str9="The Quick BroWn FoX!";
		System.out.println("UPPERCASE : "+str9.toUpperCase());
		
		// Q7
		String str10="The quick brown fox jumps";
		StringBuffer reversedStr=new StringBuffer();
		for(int i=str10.length()-1;i>0;i--) {
			reversedStr.append(str10.charAt(i));
		}
		System.out.println(reversedStr);
		
		
		System.out.println("-----------------"+str7.indexOf(str7.charAt(2)));
	}

}
