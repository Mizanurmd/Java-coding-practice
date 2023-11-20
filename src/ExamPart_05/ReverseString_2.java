package ExamPart_05;



public class ReverseString_2 {
	public static void main(String[] args) {
		//Q #2) Write a Java Program to reverse a string without using String inbuilt function.
		
		String st = "Bangladesh";
		char[]c = st.toCharArray();
		
		for(int i =c.length-1; i>=0; i--) {
			System.out.print(c[i]);
		}
		
	}

}
