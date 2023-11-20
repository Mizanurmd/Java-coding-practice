package SingletonDetails;

public class LazySingleton {
	static LazySingleton instance;
	
	private LazySingleton() {
		System.out.println("Lazy Constructor is calling here");
	}
	//// Create Factory method here//
	
	public static synchronized LazySingleton getFactMethod() {
		if(instance == null) {
			instance = new LazySingleton();
		}
		
		return instance;
	}

}
