package advantureIt_2024;

public class SwapTwo {
	public static void main(String[] args) {
		int a, b;
		a = 200;
		b = 300;
		System.out.println("Before Swap A = "+a + "\nBefore Swap B = "+ b);
		System.out.println("===============******************=================");
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swap A = "+a + "\nAfter Swap B = "+ b);
		
		
		
	}

}
