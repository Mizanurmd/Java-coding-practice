package predicateFunction_8;

import java.util.function.Predicate;

public class PredicateJoining {
	public static void main(String[] args) {
		/*
		 * Q. What is Pedicate? Ans: The predicate interface has an abstract method test
		 * hich gives a boolean value as a return for the specified arguments
		 */
		
		Predicate<String> checkLength = s -> s.length() >= 5;
		System.out.println("The length is greater than 5 : " + checkLength.test("Code decode"));

		Predicate<String> checkLengthEven = s -> s.length() % 2 == 0;
		System.out.println("The length is even number : " + checkLengthEven.test("Code decode"));

		// It can be joined with and
		System.out.println("After margin negate join : " + checkLength.and(checkLengthEven).test("Code decode"));

		// It can be joined with or
		System.out.println("After margin and join : " + checkLength.or(checkLengthEven).test("Code decode"));

		// It can be joined with negate
		System.out.println("After margin or join : " + checkLength.negate().test("Code decode"));

	}

}
