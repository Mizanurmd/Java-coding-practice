package StringDetails;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCount {
	public static void main(String[] args) {
		//Approach-1
		String st = "This is a good boy this a bad boy.";
		//char[] ch =st.toCharArray();
		//Map<Character, Integer>map = new HashMap<>();
	
//		for(char c : ch) {
//			if(!map.containsKey(c)) {
//				map.put(c, 1);
//			}else {
//				int count = map.get(c);
//				map.put(c, count+1);
//			}
//		}
//		System.out.println(map);
		
		
		//Approach-2
		
		Map<String, Long>map= Arrays.stream(st.split(""))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(map);
		
	}

}
