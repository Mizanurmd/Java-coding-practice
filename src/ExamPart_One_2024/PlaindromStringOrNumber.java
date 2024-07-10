package ExamPart_One_2024;

import java.util.Scanner;

public class PlaindromStringOrNumber {
	public static void main(String[] args) {
		// Q #8) Write a Java Program to find whether a string or number is palindrome
		// or not.
		String org, rev = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String or Integer : ");
		org = sc.nextLine();
		for(int i =org.length()-1; i>=0; i--) {
			rev = rev + org.charAt(i);
		}
		System.out.println("Reverse is = "+rev);
		if(rev.equals(org)) {
			System.out.println("Plaindrom");
		}else {
			System.out.println("Not Palindrom");
		}

	}

}
