package ExampUsingStram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
//Q.1  How many male and female employees in the organization
//Q.2 Print the name all department of the organization

public class EmployeeTest {
	public static void main(String[] args) {
		List<Employee> em = getAllEmployess();
		System.out.println(em);
		System.out.println("All Employees of this company ==================");
		int a = (int) em.stream().count();
		System.out.println("Total Employees = " + a);
		Map<String, Long> collect = em.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		System.out.println(collect);

		//////// Q.2
		System.out.println("==========Print all Departments of the organization with duplicate=============");
		List<String> departs = em.stream().map(e -> e.getDepartment()).collect(Collectors.toList());
		System.out.println(departs);

		System.out.println("==========Print all Departments of the organization avoid duplicate =============");
		Set<String> depart2 = em.stream().map(e -> e.getDepartment()).collect(Collectors.toSet());
		System.out.println(depart2);

		System.out.println("==========Print all Salary of the organization avoid duplicate =============");

		List<Employee> salary = em.stream().filter(e -> e.getSalary() > 15000).collect(Collectors.toList());
		System.out.println(salary);
		System.out.println("==========Print all only Salary of the organization avoid duplicate =============");

		List<Double> salary2 = em.stream().filter(e -> e.getSalary() > 15000).map(e -> e.getSalary())
				.collect(Collectors.toList());

		System.out.println(salary2);
		System.out.println(
				"==========Print Employee name who get Salary 15000 more of the organization avoid duplicate =============");

		List<String> name = em.stream().filter(e -> e.getSalary() > 15000 && e.getYearOfjoining() > 2020)
				.map(e -> e.getName()).collect(Collectors.toList());

		System.out.println(name);
		
		System.out.println("==================Test Stream Api ==================");
		List names = Arrays.asList("Reflection","Collection","Stream");
		List result = (List) names.stream().sorted().collect(Collectors.toList());
		System.out.println(result);

	}

	
	// Create a method for employee list here ////
	public static List<Employee> getAllEmployess() {
		List<Employee> empLists = new ArrayList<>();
		empLists.add(new Employee(101, "Mizan", 32, "Male", "Software", 2022, 15000.));
		empLists.add(new Employee(101, "Sizan", 32, "Male", "HR", 2022, 25000.));
		empLists.add(new Employee(101, "Mim", 32, "Female", "Merketing", 2023, 15000.));
		empLists.add(new Employee(101, "Sakila", 32, "Female", "HR", 2021, 15000.));
		empLists.add(new Employee(101, "Tawhidul", 32, "Male", "Software", 2022, 20000.));
		empLists.add(new Employee(101, "Rakib", 32, "Male", "Software", 2022, 15000.));
		empLists.add(new Employee(101, "Sabnur", 32, "Female", "Store", 2022, 15000.));
		empLists.add(new Employee(101, "Ria", 32, "Female", "Sales department", 2022, 15000.));
		empLists.add(new Employee(101, "Sorforaz", 32, "Male", "Software", 2021, 25000.));
		empLists.add(new Employee(101, "Kabila", 32, "Male", "Product deparment", 2020, 35000.));
		empLists.add(new Employee(101, "Rajib", 32, "Male", "Software", 2012, 25000.));
		empLists.add(new Employee(101, "Lima", 32, "Female", "Sales department", 2015, 35000.));

		return empLists;

	}

}
