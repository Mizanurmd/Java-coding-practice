package ExampUsingStram;

public class FuntionalInterface {
	public static void main(String[] args) {

		int a = 5;
		FunctionInterfaceTest s = (int x) -> x * x;

		int ans = s.calculate(a);
		System.out.println(" 5 Square = " + ans);

	}

}

interface FunctionInterfaceTest {
	int calculate(int x);
}