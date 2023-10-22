package StrackDetails;

public class Stack {
	int capacity = 3;
	int stack[]= new int[capacity];
	int top = -1;
	
	// add into stack method
	
	void push(int x) {
		if(top <capacity-1) {
			top = top +1;
			stack[top] = x;
			System.out.println("Successfully added = " + x);
		}else{
			System.out.println("Exception!: Stack is over flow.");
		}
	}
		// remove from stack
		
	int pop() {
		if(top < 0) {
			return  -1;
		}
		int val = stack[top];
		top = top -1;
		return val;
	}
		
	// peek from stack
	
	int peek() {
		if(top < 0) {
			System.out.println("Exception underflow.");
			return  -1;
		}
		return stack[top];
		
	}
		
		
		
		public static void main(String[] args) {
			Stack obj = new Stack();
			System.out.println("Peek return : "+ obj.peek());
			obj.push(10);
			obj.push(20);
			obj.push(30);
		
			System.out.println("Pop remove : "+ obj.pop());
			obj.push(40);
			System.out.println("Peek return : "+ obj.peek());
		}
		
		


}
