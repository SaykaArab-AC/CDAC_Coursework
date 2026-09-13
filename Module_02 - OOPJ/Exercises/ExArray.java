public class ExArray{
	
	public static void sortArray(int[] iArray){
		for(int iTemp1=0;iTemp1<iArray.length-1;iTemp1++){
			for(int iTemp2=0;iTemp2<iArray.length-1-iTemp1;iTemp2++){
				if(iArray[iTemp2]>iArray[iTemp2+1]){
					int iTemp3=iArray[iTemp2];
					iArray[iTemp2]=iArray[iTemp2+1];
					iArray[iTemp2+1]=iTemp3;
				}
			}
		}
	}
	
	public static int sumArray(int[] iArray){
		int sum=0;
		for(int iTemp1=0;iTemp1<iArray.length;iTemp1++)
		{
			sum=sum+iArray[iTemp1];
		}
		return sum;
	}
	
	public static double averageArray(int[] iArray){
		int sum=sumArray(iArray);
		double dAverage=(double)sum/iArray.length;
	
		return dAverage;
	}
	
	public static int[] copyArray(int[] iArray)
	{
		int[] copiedArray=new int[iArray.length];
	
		for(int iTemp1=0;iTemp1<iArray.length;iTemp1++)
		{
			copiedArray[iTemp1]=iArray[iTemp1];
		}
	
		return copiedArray;
	}
	
	public static int findMaximum(int[] iArray){
		int maximum=iArray[0];
		for(int iTemp1=1;iTemp1<iArray.length;iTemp1++)
		{
			if(iArray[iTemp1]>maximum)
			{
				maximum=iArray[iTemp1];
			}
		}
	
		return maximum;
	}
	
	public static int findMinimum(int[] iArray){
		int minimum=iArray[0];
		for(int iTemp1=1;iTemp1<iArray.length;iTemp1++)
		{
			if(iArray[iTemp1]<minimum)
			{
				minimum=iArray[iTemp1];
			}
		}
		return minimum;
	}
	
	public static void reverseArray(int[] iArray){
		int iTemp1=0;
		int iTemp2=iArray.length-1;
		
		while(iTemp1<iTemp2)
		{
			int iTemp3=iArray[iTemp1];
			iArray[iTemp1]=iArray[iTemp2];
			iArray[iTemp2]=iTemp3;
	
			iTemp1++;
			iTemp2--;
		}
	}
	
	public static void findDuplicate(int[] iArray){
		System.out.print("Duplicate Values : ");
		
	
		System.out.println();
	}
	
	public static void main(String[] args){
		System.out.print("Enter size of Array : ");
		int iSize=ConsoleInput.getInt();
	
		int[] iArray=new int[iSize];
	
		System.out.println("Enter elements of array : ");
	
		for(int iTemp1=0;iTemp1<iArray.length;iTemp1++)
		{
			iArray[iTemp1]=ConsoleInput.getInt();
		}
	
		//Q2
		sortArray(iArray);
		System.out.print("Sorted Array : ");
		for(int iTemp1=0;iTemp1<iArray.length;iTemp1++)
		{
			System.out.print(iArray[iTemp1]+"  ");
		}
	
		System.out.println();
	
		//Q3
		int iSum=sumArray(iArray);
		System.out.println("Sum of Elements = "+iSum);

		//Q4
		double dAverage=averageArray(iArray);	
		System.out.println("Average of Elements = "+dAverage);
	
		//Q5
		int[] iCopiedArray=copyArray(iArray);
		System.out.print("Copied Array : ");
		for(int iTemp1=0;iTemp1<iCopiedArray.length;iTemp1++)
		{
			System.out.print(iCopiedArray[iTemp1]+"  ");
		}
	
		System.out.println();
	
		//Q6
		int iMaximum=findMaximum(iArray);
		int iMinimum=findMinimum(iArray);
	
		System.out.println("Max Element = "+iMaximum);
		System.out.println("Min Element = "+iMinimum);
	
	
		//Q7
		reverseArray(iArray);
	
		System.out.print("Reversed Array : ");
	
		for(int iTemp1=0;iTemp1<iArray.length;iTemp1++)
		{
			System.out.print(iArray[iTemp1]+"  ");
		}
	
		System.out.println();
	}
}
