package ArrayListDetails;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_One {
	public static void main(String[]args) {
		
		ArrayList<Integer>list = new ArrayList<Integer>();
		// add to ArrayList
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(list);
		
		// get element from ArrayList
		
		int element = list.get(0);
		System.out.println(element);
		
		// add element between ArrayList
		list.add(1,5);
		System.out.println(list);
		
		// exchange element of ArrayList
		list.set(0, 7);
		System.out.println(list);
		
		// remove element from ArrayList
		list.remove(1);
		System.out.println(list);
		
		// get ArrayList Size
		int s = list.size();
		System.out.println(s);
		
		// print ArrayList using loop
		for(int i =0; i<list.size(); i++) {
			System.out.print(list.get(i)+",");
		}
		
		// sort of ArrayList
		System.out.println("\n ================Sort ArrayList here =================");
		Collections.sort(list);
		System.out.println(list);
		
	}

}
