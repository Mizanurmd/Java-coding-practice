package SingletonDetails;

public class EarlySingleton {
	
 private static EarlySingleton instance = new EarlySingleton();
	
	private EarlySingleton() {
		System.out.println("Singleton Constructor is calling.");
	}

	/////// Create static factory method //////
	public static EarlySingleton getFactoryMethod() {
		return instance;
	}
	
	// another method
	public void printMessage() {
		System.out.println("It is a message.");
	}
}
