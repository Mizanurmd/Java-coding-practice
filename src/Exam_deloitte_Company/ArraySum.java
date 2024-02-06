package Exam_deloitte_Company;

import java.util.Arrays;

public class ArraySum {
	public static void main(String[] args) {
		int[]num = {2,3,4,5,7};
		
//		int sum =0;
//		for(int i =0; i<num.length; i++) {
//			sum = sum +num[i];
//		}
//		System.out.println("Total Array Sum : "+sum);
		
		//Q. Sum using stream API
		
		long totalSum= Arrays.stream(num).sum();
		System.out.println("Array Total Sum : "+ totalSum);
		
		
	}

}
