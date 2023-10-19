package ArrayDetails;

import java.util.Scanner;

public class Array2DTest {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows number = ");
		int rows = sc.nextInt();
		System.out.println("Enter the columns number = ");
		int cols = sc.nextInt();
		int [][]numbers = new int[rows][cols];
		
		//////// input given here ////////////
		// row controlling here //
		for(int i =0; i<rows; i++) {
			//columns controlling here//
			for(int j =0; j<cols; j++) {
				numbers[i][j]= sc.nextInt();
			}
			
		}
		
		/// output loop here 
		 
		for(int i=0; i<rows; i++) {
			for(int j = 0; j <cols; j++) {
				System.out.print(numbers[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
