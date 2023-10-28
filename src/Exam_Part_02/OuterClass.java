package Exam_Part_02;

public class OuterClass {
	public int a = 10;
	
	public void heyMan() {
		System.out.println("hey man.");
	}
	
	//// Create inner public class here 
	public class InnerClass{
		public int  b = 20;
		
		public void whatsUp() {
			System.out.println("Whats up?");
		}
	}
	//// Create inner public static class
	
	public static class InnerClass2{
		int num = 30;
		public void heyStaticClass() {
			System.out.println("This is static class here.");
		}
		
	}
	
	private class InnerClass3{
		public void testInner() {
			System.out.println("Calling testInner method here");
		}
		
	}
	

}
