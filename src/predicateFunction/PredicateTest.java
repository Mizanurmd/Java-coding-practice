package predicateFunction;

import java.util.function.Predicate;

public class PredicateTest {
	public static void main(String[] args) {
		Predicate<String>check = s -> s.length() >=5;
		System.out.println("The lenght of String greater than 5  :"+ check.test("code decode"));
	}
	
	

}
