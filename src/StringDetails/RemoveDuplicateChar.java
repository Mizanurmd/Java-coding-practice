package StringDetails;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateChar {
	public static void main(String[] args) {
		String st ="PriivaEEccy";
		String sss ="";
		// Approach-1
		Set<Character>s = new LinkedHashSet<>();
		for(int i =0; i<st.length(); i++) {
			if(!s.add(st.charAt(i))) {
				sss = sss + st.charAt(i);
			}else {
				s.add(st.charAt(i));
			}
		}
		System.out.println("Duplicate Character Print:"+sss);
		System.out.println("===========================");
		
		for(char c: s) {
			System.out.print(c);
		}
		
		System.out.println("\n====================");
		// Approach-2
		String stt= Arrays.stream(st.split("")).distinct()
		.collect(Collectors.joining());
		System.out.println(stt);
	}

}
