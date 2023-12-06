package Exam_StreamDetails;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistrinctArrays {
	public static void main(String[] args) {
		List<String>name = Arrays.asList("Bus", "Car","Bus","Cicle","Car","Paraod");
		
		// Distinct
		List<String>distincts= name.stream().distinct().collect(Collectors.toList());
		System.out.println(distincts);
		//count
		Long c= name.stream().distinct().count();
		System.out.println(c);
		
		// limit
	name.stream().limit(3).forEach(n->System.out.println(n));
	
	
	/// sorting as ascending ordered here/
	
	List<String>asecnding= name.stream().sorted().collect(Collectors.toList());
	System.out.println(asecnding);	
	
	/// sorting as ascending ordered here/
	
		List<String>dsecnding= name.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(dsecnding);	
	
	
	
	
	}

}
