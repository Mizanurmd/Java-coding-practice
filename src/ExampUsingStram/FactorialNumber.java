package ExampUsingStram;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[]args) {
		
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number = ");
		n = s.nextInt();
		
		int result = fact(n);
		System.out.println("Factorial Value of "+ n +" = "+ result);
		
	}
	
	////////// create a method for factorial////////
	
	public static int fact(int n) {
		if(n==1) {
			return 1;
		}
		
		return n*fact(n-1); // 5*4*3*2*1=120
		
	}
	

}
