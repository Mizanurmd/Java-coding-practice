package Exam_Collection_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {

		List l = new ArrayList<>();

		l.add(0,10); // index based data store
		l.add(1,10);
		l.add(10);
		l.add(10); // duplicate is allow
		l.add(null);
		l.add(null);// multiple null value allow
		
		System.out.println(l);
		
		/// using iterator//
		System.out.println("============Using iterator================");
		Iterator it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
