package HashSetDetails;


import java.util.HashSet;
import java.util.Iterator;

public class HashOne {
	public static void main(String[] args) {
		HashSet<String>name = new HashSet<>();
		name.add("Mizanur");
		name.add("Sizan");
		name.add("Refayet");
		System.out.println(name);
		
		//search
		
		if(name.contains("Mizanur")) {
			System.out.println("Yes");
		}else {
			System.out.println("Not");
		}
		
		// use iterator
		System.out.println("=======Using while loop for print of hashSet=========== ");
		Iterator it = name.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// use for loop
		System.out.println("=======Using advance for loop for print of hashSet=========== ");
		
		for(String s : name) {
			System.out.println(s);
		}
		
		
	}

}
