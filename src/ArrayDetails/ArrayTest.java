package ArrayDetails;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number rows =");
		int rows = s.nextInt();
		System.out.println("Enter the number of colls =");
		int cols = s.nextInt();
		int [][]num = new int[rows][cols];
		
		/////// input taking loop
		for(int i =0; i<rows; i++) {
			////// inner loop
			for(int j =0; j<cols; j++) {
				num[i][j] = s.nextInt();
			}
		}
		
		////// Print loop///
		for(int i =0; i<rows; i++) {
			/// inner loop
			for(int j = 0; j<cols; j++) {
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}

}
