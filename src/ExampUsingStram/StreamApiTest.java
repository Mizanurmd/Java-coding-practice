package ExampUsingStram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiTest {

	public static void main(String[] args) {
		// create a list of Integer square here
		List<Integer> name = Arrays.asList(2, 3, 4, 5);

		List<Integer> re = (List<Integer>) name.stream().map(x -> x * x).collect(Collectors.toList());

		System.out.println(re);
		System.out.println("============== String Square using each loop  here ====================");

		name.stream().map(n -> n * n).forEach(y-> System.out.println(y));
		
		// create a list of String for sorting
		System.out.println("============== String sorting here ====================");
		List<String> names = Arrays.asList("Reflection", "Collection", "Stream");

		List<String> sor = names.stream().sorted().collect(Collectors.toList());
		System.out.println(sor);

		System.out.println("============== String Filtering  here ====================");
		List<String> nam = Arrays.asList("Reflection", "Collection", "Stream");

		List<String> fil = nam.stream().filter(x -> x.startsWith("S")).collect(Collectors.toList());

		System.out.println(fil);

	}

}
