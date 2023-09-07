package CodingExam;

import java.util.Scanner;

public class StringReverseInbuild {
	public static void main(String[]args) {
		
		//Q #1) Write a Java Program to reverse a string without using String inbuilt function.
		//String name = "Mizanur";
		System.out.println("================String Reverse using In build function ================");
		String name;
		Scanner n = new Scanner(System.in);
		System.out.println("Enter any String here := ");
		name = n.nextLine();
		StringBuilder st = new StringBuilder();
		st.append(name);
		st.reverse();
		System.out.println(st);
		
		// Q #2) Write a Java Program to reverse a string without using String inbuilt function reverse().
		System.out.println("================String Reverse using no In build function ================");
		
		
		char[]c = name.toCharArray();
		for(int i = c.length-1; i >= 0; i--) {
			System.out.print(c[i]);
		}
		
		System.out.println("\n================String Reverse using no In build function ================");
		
		String[]token = name.split("");
		for(int i = token.length-1; i >=0; i--) {
			System.out.print(token[i]);
		}
		
		System.out.println("\n================String Reverse using another way no In build function ================");
		String rev ="";
		int len = name.length();
		for(int i = len-1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);
	}

}
