package ComparatorAndComparableExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorMain {
	public static void main(String[] args) {
		List<Employee>empList = new ArrayList<>();
		empList.add(new Employee(1, "Mizanur Rahman", 2, 30000,32));
		empList.add(new Employee(2, "Mamun Rahman", 2, 4000,30));
		empList.add(new Employee(3, "Rajib Rahman", 4, 30000,35));
		empList.add(new Employee(4, "Tawhidul Islam", 6, 3000,31));
		empList.add(new Employee(5, "Rakibul Hasan", 2, 50000,33));
		empList.add(new Employee(6, "Kabila ", 3, 33000,40));
		System.out.println("======= Sort based on Experienc using comparator=================");
		Collections.sort(empList, new SortToExperinec());
		empList.forEach(e-> {
			System.out.println(e);
		});
	}

}
