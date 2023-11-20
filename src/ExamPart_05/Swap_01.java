package ExamPart_05;

public class Swap_01 {
	public static void main(String[] args) {
		
	//Q #3) Write a Java Program to swap two numbers using the third variable.
		
		int x =50;
		int y = 100;
		int temp;
		System.out.println("Before Swap of X = "+x +"\nBefore Swap of Y = "+y);
		temp = x + y;
		x = temp -x;
		y = temp -y;
		System.out.println("===========================================");
		System.out.println("After Swap of X = "+x +"\nAfter Swap of Y = "+y);
	}

}
