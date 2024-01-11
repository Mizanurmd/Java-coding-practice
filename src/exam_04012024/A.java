package exam_04012024;

public class A{
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.calculator(10);
		t.calculator(10.50);
		t.calculator(10L);
	
	}
	
}
 class Test2<T>{
		
		public void calculator(T a) {
			System.out.println("Calculate integer = "+ a);
		}
//		public void calculator(double a) {
//			System.out.println("Calculate integer = "+ a);
//		}
//		public void calculator(long a) {
//			System.out.println("Calculate integer = "+ a);
//		}
	}


