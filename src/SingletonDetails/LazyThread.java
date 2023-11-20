package SingletonDetails;

public class LazyThread {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				LazySingleton obj = LazySingleton.getFactMethod();

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				LazySingleton obj2 = LazySingleton.getFactMethod();

			}
		});
		
		t1.start();
		t2.start();

	}

}
