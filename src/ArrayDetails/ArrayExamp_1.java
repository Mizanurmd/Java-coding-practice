package ArrayDetails;

import java.util.Scanner;

public class ArrayExamp_1 {
	public static void main(String[]args) {
		
		//Qs. Take an array as input from the user. 
		//    Search for a given number x and print he index at which it occurs.
		
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your array size here = ");
		size = sc.nextInt();
		int[]num = new int[size];
		
		//input taking from user
		for(int i =0; i<size; i++) {
			num[i]= sc.nextInt();
		}
		
		// target index//
		int x =sc.nextInt();
		System.out.println("X= "+x);
		// output of Array
		
		for(int i =0; i< num.length; i++) {
			if(num[i] == x) {
				System.out.println("Array length index = "+ i);
				
			}
		}
		
	}

}
