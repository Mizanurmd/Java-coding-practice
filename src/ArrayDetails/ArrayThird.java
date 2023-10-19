package ArrayDetails;

import java.util.Scanner;

public class ArrayThird {
	public static void main(String[]args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your array size = ");
		size = sc.nextInt();
		int[]marks = new int[size];
		
		// use the loop for the input of the Array
		for(int i =0; i<size; i++) {
			marks[i]= sc.nextInt();
		}
		System.out.println("======================");
		/// use this loop for the output of the Array
		for(int i = 0; i <marks.length; i++) {
			System.out.println(marks[i]);
		}
		
		
	}

}
