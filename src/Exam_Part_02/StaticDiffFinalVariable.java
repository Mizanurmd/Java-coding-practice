package Exam_Part_02;



public class StaticDiffFinalVariable {
	
	public static void main(String[] args) {
	A a = new A();
	a.max();
	
	System.out.println("A = "+ a.A);
	
	}
}
	class A{
	final int A= 10;
		
	void max() {
			final int x = 100;
			System.out.println("X = "+x);
		}
	
}
