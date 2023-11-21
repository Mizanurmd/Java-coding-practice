package Exam_StreamDetails;


import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class Salary {
	public static void main(String[] args) {
		List<Integer> salary = new ArrayList<>();
	
		salary.add(3000);
		salary.add(6000);
		salary.add(8000);
		salary.add(7000);
		salary.add(9501);
		salary.add(2500);
		System.out.println(salary);
		
		/*
		 * int c =0; for(Integer co : salary) { if(co >3000) { c++; } }
		 * System.out.println("Total Count = "+ c);
		 */	

	//============= using Stremp Api===============
		
		long con = salary.stream().filter((Integer s)-> s>3000).count();
		System.out.println(con);
		
	
	

	List<Integer> sum = salary.stream().sorted().collect(Collectors.toList());
	System.out.println(sum);

	}

}
