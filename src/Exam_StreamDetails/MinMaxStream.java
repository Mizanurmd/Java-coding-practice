package Exam_StreamDetails;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;





public class MinMaxStream {
	public static void main(String[] args) {
		
		List<Integer>numbers = Arrays.asList(1,2,3,4,5,67,7,8,5,45,20);
		
		//Distinct
		
		List<Integer>dis=numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(dis);
		// count
		
	Long co	=numbers.stream().count();
		System.out.println(co);
		//// limit
		numbers.stream().limit(3).forEach(n->System.out.println(n));
		
		// min
	Optional<Integer>m= numbers.stream().min((v1,v2)->{
			return v1.compareTo(v2);
		});
	System.out.println("Minmum number is = "+ m);
	
	// Max
	Optional<Integer>ma= numbers.stream().max((v1,v2)->{
		return v1.compareTo(v2);
	});
	System.out.println("Maximun numbers is = "+ ma);
	
	}

}
