package Exam_StreamDetails;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filterdemo1 {
	public static void main(String[] args) {
		List<String>names =Arrays.asList("Book", "jon", null," Threater", "Tawhidul");
		
		List<String>na= names.stream().filter(n-> n !=null).collect(Collectors.toList());
		
		System.out.println(na);
		
	}

}
