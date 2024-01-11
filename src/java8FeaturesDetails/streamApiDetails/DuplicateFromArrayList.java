package java8FeaturesDetails.streamApiDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateFromArrayList {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		List<String> uniqueList = new ArrayList<>();
		lst.add("A");
		lst.add("B");
		lst.add("C");
		lst.add("D");
		lst.add("A");
		lst.add("C");
		//========== before Stream API===============
		for(String s : lst) {
			if(!uniqueList.contains(s)) {
				uniqueList.add(s);
			}
		}
		System.out.println(uniqueList);
		
		//========== using Stream API, remove duplicate==========
		List<String>newList= lst.stream().distinct().collect(Collectors.toList());
		System.out.println(newList);
		
		
		
	}

}
