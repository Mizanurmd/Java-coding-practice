package ExamPart_05;

import java.util.Iterator;

public class ReverseString {
	public static void main(String[] args) {
		//Q #1) Write a Java Program to reverse a string  using for loop String inbuilt function.
		
		String st = "Bnagladesh", rev ="";
		String[]token = st.split("");
		for(int i =st.length()-1; i>=0; i--) {
			rev = rev + st.charAt(i);
		}
		System.out.println("Reverse String = "+ rev);
			
	}

}
