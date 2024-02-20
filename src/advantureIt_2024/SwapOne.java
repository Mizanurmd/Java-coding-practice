package advantureIt_2024;

public class SwapOne {
	public static void main(String[] args) {
		int a, b, temp;
		a =500;
		b =600;
		System.out.println("Before Swap A = "+ a +"\nBeofre Swap B = "+ b);
		temp = a + b;
		a = temp - a;
		b = temp - a;
		System.out.println("==================***************===============");
		System.out.println("After Swap A = "+ a +"\nAfter Swap B = "+ b);
		
	}

}
