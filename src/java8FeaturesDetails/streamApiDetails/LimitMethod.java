package java8FeaturesDetails.streamApiDetails;

import java.util.ArrayList;
import java.util.List;

public class LimitMethod {
	public static void main(String[] args) {
		List<String>lst = new ArrayList<>();
		lst.add("A");
		lst.add("B");
		lst.add("F");
		lst.add("D");
		lst.add("A");
		lst.add("C");
		lst.add("E");
		lst.stream().limit(5).skip(2).forEach(e->{
			System.out.println(e);
		});
	}

}
