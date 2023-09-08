package CodingExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDetails {
	public static void main(String[]args) {
		
		ArrayList st = new ArrayList<>();
		st.add("Banana");
		st.add("Apple");
		st.add("Papa");
		st.add("Mango");
		st.add("Orange");
		st.add("PineApple");
		
		////  sorting Array Ascending way///////////
		Collections.sort(st);
		
		////////////// Sorting Array in Descending way////////
		Collections.reverse(st);
		
		System.out.println(st);
		
		
		System.out.println("=========== Print array for using for loop here ===============");
		
		for(int i = 0; i < st.size(); i++) {
			System.out.print(st.get(i)+ ",");
		}
		
		System.out.println("\n=========== Print array for Advance for loop here ===============");
		
		for(Object obj : st) {
			System.out.print(obj + ",");
		}
		
		System.out.println("\n=========== Print array for using Iterator here  ===============");
		
		Iterator iter = st.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+",");
		}
		
	}
	
	

}
