package ArrayDetails;

import java.util.Arrays;

public class ArraySum {
	public static void main(String[] args) {
		int[]num = {1,2,3,4,5,6,7,8,9,10};
		//int sum =0;
		
		// Using for loop
//		for(int i =0; i<num.length; i++) {
//			sum = sum +num[i];
//		}
//		System.out.println("Total Sum :"+ sum);
//		System.out.println("Avarge  :"+ sum/num.length);
		
		// using Advance Loop
//		for(int i : num) {
//			sum = sum +i;
//		}
//		System.out.println("Total Sum :"+ sum);
//		System.out.println("Avarge  :"+ sum/num.length);
		
		// using Advance Loop
		double sum=Arrays.stream(num).sum();
			System.out.println("Total Sum :"+ sum);
				System.out.println("Avarge  :"+ sum/num.length);
		
	}

}
