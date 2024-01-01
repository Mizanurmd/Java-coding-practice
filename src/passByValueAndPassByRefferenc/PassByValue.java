package passByValueAndPassByRefferenc;

public class PassByValue {
	public static void main(String[] args) {
		int a = 10000;
		System.out.println("A = "+a);

		int b;
		b = a;
		System.out.println("B = "+b);
		b = 50000;
		System.out.println("B = "+ b);
		System.out.println("A = "+a);

	}

}
