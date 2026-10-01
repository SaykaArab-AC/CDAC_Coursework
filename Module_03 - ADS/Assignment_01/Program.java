package practice.assignment1;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
			int arr[]= {12,5,8,20,15,20,7};
			int arr1[]= {1, 5,2, 3, 8, 0, 2};
			minMax(arr);
			secondLargest(arr);
			moveZeros(arr1);
	}
	
	static void minMax(int arr[]) {
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
		}
		
		System.out.println("Min = "+min);
		System.out.println("Max = "+max);
	}

	static void secondLargest(int arr[]) {
		int first=arr[0];
		int second=first;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>first) {
				second=first;
				first=arr[i];
			}
			if(arr[i]>second && arr[i]!=first)
				second=arr[i];
		}
		if(second==first) {
			System.out.println("All elements are same");
		}
		else
			System.out.println("Second Largest = "+second+"  "+"Largest = "+first);
	}
	
	static void moveZeros(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				continue;
			}
			else {
				int temp=arr[count];
				arr[count]=arr[i];
				arr[i]=temp;
				count++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
