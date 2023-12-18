package ArrayDetails;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FIndMatchWord {
	public static void main(String[] args) {
		List<String>name = Arrays.asList("Apple","Banana","Guava","Watermilon");
		
		Optional<String> result= name.stream().filter(n-> n.startsWith("B")).findFirst();
		
		System.out.println(result);
		
	}

}
