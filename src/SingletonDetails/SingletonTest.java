package SingletonDetails;

public class SingletonTest {
public static void main(String[] args) {
	
	EarlySingleton obj =EarlySingleton.getFactoryMethod();
	obj.printMessage();
}
	
}
