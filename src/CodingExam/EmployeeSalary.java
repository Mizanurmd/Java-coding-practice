package CodingExam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EmployeeSalary {
	public static void main(String[]args) {
		
		List<Employee>emps = new ArrayList<>();
		emps.add(new Employee("Mizan","Java Developer",25000));
		emps.add(new Employee("Tawhid","Java Developer",30000));
		emps.add(new Employee("Mamun","Java Developer",40000));
		emps.add(new Employee("Rakib","Java Developer",25000));
		emps.add(new Employee("kabila","Java Developer",30000));
		
		System.out.println(emps);
		/////////// more than 25000 thousand Taka Salary////////////
		System.out.println(" Name of employee who get mpre than 25000 thousand taka Salary : ");
		Stream<Employee>s = emps.stream();
		s.filter(em-> em.salary >25000).map(em-> em.name)
		.forEach(em -> System.out.println(em));
		
		////////// Less than 30000 thousand taka salary ///////////
		System.out.println(" Name of employee who get less than 30000 thousand taka Salary : ");
		Stream<Employee>s1 = emps.stream();
		s1.filter(emp -> emp.salary <30000).map(emp -> emp.name)
		.forEach(emp -> System.out.println(emp));
				
		
	}

}
