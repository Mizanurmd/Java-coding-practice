package LeetCodeTest;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter th row of 2D Array:");
		int row = sc.nextInt();
		System.out.println("Enter th col of 2D Array:");
		int col = sc.nextInt();
		int[][] arr = new int[row][col];

		// input from user
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();

			}
		}

		// Print output of 2D Array
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
