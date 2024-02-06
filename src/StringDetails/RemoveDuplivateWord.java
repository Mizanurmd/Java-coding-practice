package StringDetails;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplivateWord {
	public static void main(String[] args) {
		String st ="Java is is learned by by Mizanur Rahman";
//		String[]sp = st.split(" ");
//		Set<String>s = new HashSet<>();
//		for(String ss: sp) {
//			s.add(ss);
//			}
//		System.out.println(s);
		
		String s= Arrays.stream(st.split(" ")).distinct()
				.collect(Collectors.joining(" "));
		System.out.println(s);
		
	
	}
		

}
