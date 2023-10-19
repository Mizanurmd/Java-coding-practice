package ArrayDetails;

import java.util.Scanner;

public class Array2DSearch {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows number = ");
		int rows = sc.nextInt();
		System.out.println("Enter the columns number = ");
		int cols = sc.nextInt();
		int[][]numbers = new int[rows][cols];
		////////////// this loop is used for input//////
		for(int i =0; i<rows; i++) {
			for(int j =0; j<cols; j++) {
				numbers[i][j] = sc.nextInt();
			}
		}
		
		///////// search for x //
		int x = sc.nextInt();
		
		//// loop for output here //
		for(int i =0; i<rows; i++) {
			for(int j =0; j<cols; j++) {
				if(numbers[i][j] == x) {
					System.out.println("Search index = ("+ i+ ","+ j+ ")");
				}
			}
		}
		
		
		
	}

}
