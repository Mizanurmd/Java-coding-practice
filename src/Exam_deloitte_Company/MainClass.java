package Exam_deloitte_Company;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class MainClass {
	public static void main(String[] args) {
		//Q. Give a employee list, sort employee based on their salaried descending order
		//Q. Fetch top three salaries employees details
		//Q. fetch all employee having salary less 3rd highest salary.
		
		List<Employee>emp = new ArrayList<>();
		emp.add(new Employee(1, 500));
		emp.add(new Employee(2, 1000));
		emp.add(new Employee(3, 1500));
		emp.add(new Employee(4, 2000));
		emp.add(new Employee(5, 2500));
		emp.add(new Employee(6, 3000));
		emp.add(new Employee(7, 3500));
	//	System.out.println(emp);
		System.out.println("======Q1:sorted employee based on their salaried descending order=====");
		List<Employee>decendingOrder=emp.stream().sorted((a, b)->b.getSalary()-a.getSalary())
		.collect(Collectors.toList());
		System.out.println(decendingOrder);
		
//		System.out.println(emp);
			System.out.println("======Q2:Fetch top three salaries employees details=====");
			List<Employee>topThree=emp.stream().sorted((a, b)->b.getSalary()-a.getSalary()).limit(3)
			.collect(Collectors.toList());
			System.out.println(topThree);
			
			System.out.println("======Q3:fetch all employee having salary less 3rd highest salary=====");
			List<Employee>lessThirdSalary=emp.stream().sorted((a, b)->b.getSalary()-a.getSalary()).skip(3)
			.collect(Collectors.toList());
			System.out.println(lessThirdSalary);
		
		
		
		
	}

}
