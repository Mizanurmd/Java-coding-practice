package predicateFunction_8;

import java.util.function.BiFunction;

public class BiFunctionDemo {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> multiplBoth = (a, b) -> a * b;
		System.out.println("Multiple of A and B is = "+ multiplBoth.apply(10, 20));

	}

}
