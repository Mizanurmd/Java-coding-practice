package Exam_StreamDetails;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyStream {
	public static void main(String[] args) {
		
		List<String>num = Arrays.asList("One","Two", "Three", "Four");
		
		/// anyMatch() 
		/// findAny
		
		Optional<String>f=num.stream().findAny();
		System.out.println(f.get());
		//findAll
		Optional<String>f2=num.stream().findFirst();
		System.out.println(f2.get());
		
		
	}

}
