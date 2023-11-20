package SingletonDetails;

public class LazyTest {
	public static void main(String[] args) {
		LazySingleton obj = LazySingleton.getFactMethod();
		LazySingleton obj2 = LazySingleton.getFactMethod();
		
		if(obj == obj2) {
			System.out.println("Both objects are same");
		}else {
			System.out.println("Not same");
		}
		
		
	}

}
