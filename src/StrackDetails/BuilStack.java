package StrackDetails;

import java.util.Stack;

public class BuilStack {
	public static void main(String[] args) {
		
		Stack<String>name = new Stack<>();
		name.push("Bangladesh");
		name.push("Dhaka");
		
		System.out.println("Pop : "+ name.pop());
		System.out.println("Peek : "+ name.peek());
		
		
	}

}
