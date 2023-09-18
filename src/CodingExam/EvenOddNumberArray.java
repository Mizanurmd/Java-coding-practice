package CodingExam;

import java.util.Arrays;
import java.util.Collections;


public class EvenOddNumberArray {
	public static void main(String[] args) {

		int[] arr = { 1, 2,50,21, 5, 4, 7, 8, 11, 20 };
		
		Arrays.sort(arr);
		
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Reversed Array:");
		
		
		
		for(int i=arr.length-1; i>=0; i--) {
			
				System.out.print(arr[i]+",");
			
		}

		
		
		
		System.out.println("\n Print Even Number : ");
		
		for(int i = 0 ; i<arr.length; i++) {
			if(arr[i] % 2 ==0) {
				System.out.print(arr[i]+",");
			}
		}

		System.out.println("\n Print Odd number here : =");
		for(int i = 0 ; i<arr.length; i++) {
			if(arr[i] % 2 !=0) {
				System.out.print(arr[i]+",");
			}
		}
		
		
	}
	
	

}
