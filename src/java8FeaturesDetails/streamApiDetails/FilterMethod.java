package java8FeaturesDetails.streamApiDetails;

import java.util.ArrayList;
import java.util.List;

public class FilterMethod {
	public static void main(String[] args) {
		List<String>lst = new ArrayList<>();
		lst.add("A");
		lst.add("B");
		lst.add("F");
		lst.add("D");
		lst.add("A");
		lst.add("C");
		lst.add("E");
		lst.add(null);
		
		lst.stream().filter(e->e!=null).map(e->e.toLowerCase()).distinct().sorted().forEach(System.out::println);
	}

}
