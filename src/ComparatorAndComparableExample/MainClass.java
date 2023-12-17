package ComparatorAndComparableExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		
		List<Employee>empList = new ArrayList<>();
		empList.add(new Employee(1, "Mizanur Rahman", 2, 30000,32));
		empList.add(new Employee(2, "Mamun Rahman", 2, 4000,30));
		empList.add(new Employee(3, "Rajib Rahman", 4, 30000,35));
		empList.add(new Employee(4, "Tawhidul Islam", 6, 3000,31));
		empList.add(new Employee(5, "Rakibul Hasan", 2, 50000,33));
		empList.add(new Employee(6, "Kabila ", 3, 33000,40));
		
		System.out.println("======== before sort=========");
		empList.forEach(e ->{
			System.out.println(e);
		});
		System.out.println("======== sort by Exprience, Salary and Age of Employee =========");
		
		Collections.sort(empList);
		empList.forEach(e ->{
			System.out.println(e);
		});
		
		
		
		/*
		 * List<Integer>list = new ArrayList<>(); list.add(10); list.add(15);
		 * list.add(2); list.add(80); list.add(1);
		 * System.out.println("===========Before sort============");
		 * System.out.println(list);
		 * System.out.println("===========After sort============");
		 * Collections.sort(list); System.out.println(list);
		 */
		
	}

}
