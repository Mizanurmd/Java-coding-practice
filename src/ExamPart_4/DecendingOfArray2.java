package ExamPart_4;

import java.util.Arrays;
import java.util.Collections;

public class DecendingOfArray2 {
	
	static void reverseArray(String[]myArray) {
		Collections.reverse(Arrays.asList(myArray));
		System.out.println("Reverse Array = "+ Arrays.asList(myArray));
	}
	
	
	public static void main(String[] args) {
		 String [] myArray2 = {"one", "Two", "Three", "Four", "Five", "Six","Seven"};
	        System.out.println("Original Array:" + Arrays.asList(myArray2));
	        reverseArray(myArray2);
	}

}
