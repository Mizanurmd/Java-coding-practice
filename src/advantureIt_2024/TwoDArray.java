package advantureIt_2024;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array Row= ");
		int row = sc.nextInt();
		System.out.println("Enter the array column = ");
		int col = sc.nextInt();
		int[][]arr =new int[row][col];
		//Input given here
		for(int i =0; i<row; i++) {
			for(int j =0; j<col; j++) {
				arr[i][j] =sc.nextInt();
			}
		}
		
		// print array here
		for(int  i=0; i<row; i++) {
			for(int j =0; j<col; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
