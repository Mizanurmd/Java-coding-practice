package java8FeaturesDetails.streamApiDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindAndMatchAllMethod {
	public static void main(String[] args) {
		List<String>name =new ArrayList<>();
		name.add("Bangladesh");
		name.add("Butan");
		name.add("Nepal");
		name.add("Malaysia");
		name.add("Saudia Arab");
		name.add("Pakistan");
		String st=name.stream().findFirst().get();
		System.out.println(st);
		Optional<String> st2=name.stream().findAny();
		System.out.println(st2);
		boolean st3= name.stream().anyMatch(e->e.startsWith("S"));
		System.out.println(st3);
		boolean st4= name.stream().allMatch(e->e.equalsIgnoreCase("B"));
		System.out.println(st4);
		
	}

} 
