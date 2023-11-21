package Exam_StreamDetails;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class NameString {
	public static void main(String[] args) {
		
		List<String>names =Arrays.asList("Mizanur", "jon", "Kamalye","jiniffer", "Tawhidul");
		
		List<String>name2= names.stream().filter(st -> st.length()>6 && st.length()<8).collect(Collectors.toList());
		
		System.out.println(name2);
		
		// Another way Print here 
		//names.stream().filter(st ->st.length()>6 && st.length()<8).forEach(System.out::println);
		
		//names.stream().filter(st ->st.length()>6 && st.length()<8).forEach(st -> System.out.println(st));
		
		
	}
}
