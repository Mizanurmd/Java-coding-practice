package LeetCodeTest;

import java.util.Scanner;

public class RecusionFactorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any ineteger number : ");
		int num = sc.nextInt();

		System.out.println(recuFact(num));
	}

	// Create a recursion method for Factorial

	public static int recuFact(int n) {
		 if(n ==0) {
			 return 1;
			 
		 }else {
			 return n * recuFact(n-1);
		 }

	}

}
