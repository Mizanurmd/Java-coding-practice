package advantureIt_2024;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Terget number of array: ");
		
		int[]num = {10,20,30,2,5,60,80,1,90,100};
		int tergetNumber =sc.nextInt();
		
		
	linearSearch(num, tergetNumber);
	
		
	}
	
	public static int linearSearch(int[]arr, int t) {
		for(int i =0; i<=arr.length; i++) {
			if(arr[i] == t) {
				System.out.println("Terget Number is "+t+ " and index = "+ i);
				return i;
			}
		}
		return -1;
	}

}
