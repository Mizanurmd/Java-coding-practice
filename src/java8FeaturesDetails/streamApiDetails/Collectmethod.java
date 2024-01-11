package java8FeaturesDetails.streamApiDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Collectmethod {
	public static void main(String[] args) {
		List<String>lst = new ArrayList<>();
		lst.add("A");
		lst.add("B");
		lst.add("F");
		lst.add("D");
		lst.add("A");
		lst.add("C");
		lst.add("E");
		List<String>ls= lst.stream().distinct().collect(Collectors.toList());
		System.out.println(ls);
		
		
	}

}
