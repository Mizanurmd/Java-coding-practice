package predicateFunction_8;

import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {

		Consumer<Integer> num = m -> System.out.println("Taking a input and Square value is : "+m * m);
		num.accept(5);

		Consumer<Integer> dubNum = m -> System.out.println("Taking a input and double value is : "+m * 2);
		dubNum.accept(5);
		
		num.andThen(dubNum).accept(5);

	}

}
