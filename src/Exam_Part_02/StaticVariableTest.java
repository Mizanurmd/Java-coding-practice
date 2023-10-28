package Exam_Part_02;

public class StaticVariableTest {
	
	static String sum ="Sum is = ";
	static String diff = "Diff is = ";
	
	public static void main(String[] args) {
		int a = 100;
		int b = 60;
		int c = a + b ;
		int d = a - b;
		
		System.out.println(sum + c);
		System.out.println(diff + d);
	}

}
