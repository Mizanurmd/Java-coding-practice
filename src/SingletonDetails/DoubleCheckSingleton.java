package SingletonDetails;

public class DoubleCheckSingleton {
	public static void main(String[] args) {
		DBConection d = DBConection.getInstace();
		DBConection d2 = DBConection.getInstace();
		if(d ==d2) {
			System.out.println("true");
		}
	}

}
