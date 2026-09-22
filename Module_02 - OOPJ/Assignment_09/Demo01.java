package in.cdac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//Using existing (pre-defined) Functional Interfaces in Java write,
//
//1. Lambda expression to sort a string array in alphabetical order ✔️
//2. Lambda expression to find the largest number in an integer array. ✔️
//3. Lambda expression to find the smallest number in an integer array.
//4. Lambda expression to generate a 3 digit random number
//5. Lambda expression that takes an integer array and returns the reverse integer array
//6. Lambda expression to print the current date
//7. Lambda expression to evaluate if a number entered is a Prime number
//8. Lambda expression to accept 2 strings and return the concatenated value of the same

public class Demo01 {

	public static void main(String[] args) {
		
		// Q1
		String[] list = {"Sayka", "Nammo", "Shahid", "Pillu"};
		
		Arrays.sort(list,(o1,o2)->o1.compareTo(o2));
		System.out.print("[list] = ");
		for(String ele:list) {
			System.out.print(ele+"  ");
		}
		System.out.println();
		
		// Q2
		Integer arr[]= {23,52,43,99,172};
		Function<Integer[],Integer> findLargest=array->{
			int largest=array[0];
			for(Integer n:array) {
				if(n<largest)
					largest=n;
			}
			return largest;
		};
		System.out.println("Largest = "+findLargest.apply(arr));
		
		// Q3
		Function<Integer[],Integer> findSmallest=array->{
			int smallest=array[0];
			for(int iTemp=0;iTemp<array.length;iTemp++) {	
				if(array[iTemp]<smallest)
					smallest=array[iTemp];
				else
					continue;
			}
			return smallest;
		};
		System.out.println("Smallest = "+findSmallest.apply(arr));
		
		// Q4
		Supplier<Integer> list1=()->{
			return (int) (Math.random()*900)+100;
		};
		System.out.println("Random Number = "+list1.get()+"  "+list1.get()+"  "+list1.get());
		
		// Q5

		Integer arr1[]= {23,52,43,99,172,200};
		Function<Integer[],Integer[]> arr2=reverse->{
			for(int iTemp=reverse.length-1,jTemp=0;jTemp<iTemp;iTemp--,jTemp++) {
				int temp=reverse[iTemp];
				reverse[iTemp]=reverse[jTemp];
				reverse[jTemp]=temp;
			}
			return reverse;
		};
		Integer arr3[]=arr2.apply(arr1);
		for(int iTemp=0;iTemp<arr3.length;iTemp++) {	
			System.out.print(arr3[iTemp]+"  ");
		}
		System.out.println();
		
		// Q6
		
		// Q7
		Predicate<Integer> prime=num->{
			for(int iTemp=2;iTemp<num;iTemp++) {
				if(num%iTemp==0)
					return false;
			}
			return true;
		};
		System.out.println("Prime ? "+prime.test(25));
		
		// Q8
		BiFunction<String,String,String> concat=(str1,str2)->{
			return str1+" "+str2;
		};
		System.out.println("Contactenated String = "+concat.apply("Sayka", "Arab"));
	}
}
