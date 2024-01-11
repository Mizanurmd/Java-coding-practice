package java8FeaturesDetails.streamApiDetails;

import java.util.ArrayList;
import java.util.List;

public class MaxMinfromArrayListMethod {
	public static void main(String[] args) {
		List<Integer>lst = new ArrayList<>();
		lst.add(10);
		lst.add(20);
		lst.add(30);
		lst.add(40);
		lst.add(50);
		lst.add(60);
	
		Integer max=lst.stream().max((v1,v2)->v1.compareTo(v2)).get();
		System.out.println("Max value is :"+ max);
		Integer min=lst.stream().min((v1,v2)->v1.compareTo(v2)).get();
		System.out.println("Min value is :"+ min);
		
		
	}

}
