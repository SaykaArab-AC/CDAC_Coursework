package in.cdac;

import java.util.function.Function;

public class Demo02 {

	public static void main(String[] args) {
		
		Character vowels[]= {'a','e','i','o','u'};
		Function<Character[],String>otp=vowel->{
			char ch=vowels[(int) (Math.random()*5)];
			int num=(int) (Math.random()*10000);
			
			return ch+""+num;
		};
		System.out.println("Random OTP = "+otp.apply(vowels));
	}

}
