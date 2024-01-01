package StrackDetails;

import java.util.Stack;

public class BuilStack {
	public static void main(String[] args) {
		
		Stack<String>name = new Stack<>();
		name.push("Bangladesh");
		name.push("North Dhaka");
		name.push("South Dhaka");
		name.push("Khulna");
		name.push("Barishal");
		name.push("Raungpur");
		name.push("Shylet");
		name.push("Chittagaong");
		name.push("Rajshahi");
		name.push("Maymonsingho");
		System.out.println("Stack size is : "+ name.size());
		System.out.println("Print all Stack value : "+ name);
		System.out.println("Remove from Stack : "+ name.pop());
		System.out.println("Peek from Stack : "+ name.peek());
		System.out.println("Search from Stack : "+ name.search("Shylet"));
		
		
	}

}
