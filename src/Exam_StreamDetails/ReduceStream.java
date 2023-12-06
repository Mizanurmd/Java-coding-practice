package Exam_StreamDetails;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReduceStream {
	public static void main(String[] args) {
		List<String>st =Arrays.asList("A","B","C", "1","2","3");
		
		List<Integer>num = Arrays.asList(1,5,2,6,7,2,9,22,44,66,500,80,90);
		//reduce
		
		Optional<String>re= st.stream().reduce((v,comVa)->{
			return comVa+v;
		});
		
		System.out.println(re.get());
		
		// sorted list of Ascending ordered
		
		List<Integer>sortedList=num.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		// sorted list of Dscending ordered
		
				List<Integer>sortedList2=num.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
				System.out.println(sortedList2);
		
	}

}
