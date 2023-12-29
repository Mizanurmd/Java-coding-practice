package ExamPart_CalByValue;

import java.util.Scanner;

public class RecusionFactorial {
	
	static int fact(int n) {
		if(n ==1) {
			return 1;
		}else {
			return n * fact(n-1);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the factorial number : ");
		int n =s.nextInt();
		
		System.out.println("Factorial number of "+fact(n));
	}
	
}
