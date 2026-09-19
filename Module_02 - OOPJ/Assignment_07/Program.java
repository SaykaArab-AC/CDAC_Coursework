package in.cdac;

import java.util.ArrayList;
import java.util.Iterator;

public class Program {

	public static void main(String[] args) {
		ArrayList<String> colors=new ArrayList<String>();
		
		colors.add("Purple");
		colors.add("Red");
		colors.add("Green");
		colors.add("Fushia Pink");
		colors.add("Teal");
		
		// 1.
		System.out.println(colors);	
		System.out.println(colors.getFirst());
		
		// 2.
		for(int iTemp=0;iTemp<colors.size();iTemp++) {
			System.out.println(colors.get(iTemp));
		}
		
		
		colors.addFirst("Maroon");

		// 3.
		Iterator<String> itr=colors.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+"  ");
		}
		
		System.out.println("\nElement at Index 3 = "+colors.get(3));
		
		colors.set(2, "Biege");
		System.out.println(colors);
		
		System.out.println("Removed element at index 3 -> "+colors.remove(3));
		System.out.println(colors);
		
		System.out.println("List contains 'Purple' color ? "+colors.contains("Purple"));
	}

}
