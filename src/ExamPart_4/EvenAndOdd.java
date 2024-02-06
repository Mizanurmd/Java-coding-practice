package ExamPart_4;

import java.util.Scanner;

public class EvenAndOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any integer number here: ");
		int n = sc.nextInt();
		System.out.println(evenOdd(n));
	}

	// Create a method for check even or odd number
	
	public static String evenOdd(int n) {
		return (n%2==0)? "Even":"Odd";
	}
	
}
