package ExamPart_05;

public class ReverseString3 {
	public static void main(String[] args) {
		//Q #2) Write a Java Program to reverse a string  using String inbuilt function reverse().
		String st = "Mizanur";
		StringBuilder stt = new StringBuilder();
		stt.append(st);
		stt.reverse();
		System.out.println("Reverese = "+ stt);
		
		
	}

}
