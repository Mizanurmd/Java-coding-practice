package ExamPart_One_2024;

import java.util.Scanner;

public class FibonacciNumber {
	public static void main(String[] args) {
		// Q #9) Write a Java Program for the Fibonacci series.
		int num, a = 0, b = 0, c = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fibonacci series: ");
		num = sc.nextInt();

		for (int i = 0; i <= num; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.print(a+",");
		}

	}

}
