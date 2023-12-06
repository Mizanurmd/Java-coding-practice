package Exam_Collection_01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set l = new HashSet<>();
		
		l.add(10); // Not index based data store. hascode base data store
		l.add(11);
		l.add(10);
		l.add(10); // duplicate is not allow
		l.add(null);
		l.add(null);// multiple null value not allow
		
		System.out.println(l);
		
		System.out.println("=======Using iterator ===========");

		Iterator it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		}

}
