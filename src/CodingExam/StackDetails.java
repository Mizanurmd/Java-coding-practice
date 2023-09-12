package CodingExam;

public class StackDetails {
	int capacity = 4;
	int []stack = new int[capacity];
	
	int top = -1;
	//////// create push method ////////////
	
	void push(int x) {
		if(top < capacity -1) {
		top = top + 1;
		stack[top]= x;
		System.out.println("Successfully added !!! "+ x);
		}else {
			System.out.println("Exception: Stack overflow.");
		}
	}
/// create pop method//////////
	
	int pop() {
		return -1;
	}
	
	//////////// Create a peel method/////
	int peek() {
		
		return -1;
	}
	
	//////////////// create main method here /////////
	public static void main(String[] args) {
		StackDetails obj = new StackDetails();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.push(40);
		obj.push(40);
	}
	
}
