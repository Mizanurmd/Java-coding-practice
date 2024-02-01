package ComparableVsComaparator;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {
	public static void main(String[] args) {
		ArrayList<Employee>em = new ArrayList<>();
		em.add(new Employee(1, "KML", "Adabor-11", "Barisal", 30));
		em.add(new Employee(2, "LML", "Adabor-5", "Shylet", 35));
		em.add(new Employee(3, "ABC", "Adabor-03", "Rajshahi", 29));
		em.add(new Employee(4, "JKM", "Adabor-02", "Khulna", 38));
		em.add(new Employee(5, "KML", "Adabor-08", "Dhaka", 31));
		
		System.out.println(em);
		// Comparable
		Collections.sort(em);
		System.out.println(em);
		
		// Comparator
		
		Collections.sort(em, new ComaratorTest());
		System.out.println(em);
		
	}

}
