package predicateFunction_8;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		
		Function<Integer, Integer> square = i-> i*i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the any number : ");
		int n = s.nextInt();
		System.out.println("Square value of the Number : "+ square.apply(n));
		
		
	}

}
