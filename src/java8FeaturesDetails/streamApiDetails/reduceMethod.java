package java8FeaturesDetails.streamApiDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class reduceMethod {
	public static void main(String[] args) {
		List<Integer>lst = new ArrayList<>();
		lst.add(10);
		lst.add(20);
		lst.add(30);
		lst.add(40);
		lst.add(50);
		lst.add(60);
		
		Integer add=lst.stream().reduce((a,b)-> a +b ).get();
		System.out.println(add);
		
		Integer max=lst.stream().max((v1,v2)->v1.compareTo(v2)).get();
		System.out.println("Max value is :"+ max);
		
	}

}
