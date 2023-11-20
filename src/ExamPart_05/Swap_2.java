package ExamPart_05;

public class Swap_2 {
	public static void main(String[] args) {
		//Q #4) Write a Java Program to swap two numbers without using the third variable.
		
		int a =100;
		int b =500;
		
		System.out.println("Before swap of A = "+a +"\nBefore swap of B = "+ b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("==========================");
		System.out.println("After swap of A = "+a +"\nAfter swap of B = "+ b);
		
		
		
	}

}
