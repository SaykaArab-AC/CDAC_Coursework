
public class ForLoops {

	public static void main(String[] args) {
		oddNumber();
		evenNumber();
		print();
		pattern1();
		pattern2();
		pattern3();
		pattern4();
		pattern5();
	}
	
	static void oddNumber() {
		System.out.println("Odd Numbers : ");
		for(int iTemp=1;iTemp<1000;iTemp++) {
			if(iTemp%2!=0) {
				System.out.print(iTemp+"  ");
			}
		}
		System.out.println("\n");
	}

	static void evenNumber() {
		System.out.println("Even Numbers : ");
		for(int iTemp=1;iTemp<500;iTemp++) {
			if(iTemp%2==0) {
				System.out.print(iTemp+"  ");
			}
		}
		System.out.println("\n");
	}
	
	static void print() {
		System.out.println("Multiples of 7 : ");
		for(int iTemp=1;iTemp<=200;iTemp++) {
			if(iTemp%7==0) {
				System.out.print(iTemp+"  ");
			}
		}
		System.out.println("\n");
	}
	
	static void pattern1() {
		for(int iTemp=1;iTemp<=5;iTemp++) {
			for(int iTemp1=1;iTemp1<=iTemp;iTemp1++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
	
	static void pattern2() {
		for(int iTemp=5;iTemp>=1;iTemp--) {
			for(int iTemp1=1;iTemp1<=iTemp;iTemp1++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
	
	static void pattern3() {
		int iTemp2=1;
		for(int iTemp=1;iTemp<=4;iTemp++) {
			for(int iTemp1=1;iTemp1<=iTemp;iTemp1++) {
				System.out.print(iTemp2+"  ");
				iTemp2++;
			}
		System.out.println();
		}
	}
	
	static void pattern4() {
		for(int iTemp=1;iTemp<=6;iTemp++) {
			for(int iTemp1=1;iTemp1<=iTemp;iTemp1++) {
				System.out.print(iTemp1+"  ");
			}
		System.out.println();
		}
	}
	
	static void pattern5() {
		for(int iTemp=6;iTemp>=1;iTemp--) {
			for(int iTemp1=1;iTemp1<=iTemp;iTemp1++) {
				System.out.print(iTemp1+"  ");
			}
		System.out.println();
		}
	}
}
