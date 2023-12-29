package predicateFunction;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer>checkTwo= (a , b)-> a + b >=5;
		System.out.println("Addition is greater than 5 : "+ checkTwo.test(10, 5));
	}

}
