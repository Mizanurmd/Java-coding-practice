package ExamPart_06;

import java.util.HashMap;
import java.util.Map;

public class DoubleCharacterCount {
	public static void main(String[] args) {
		//input ="aaabbccd"
		// output = a3b2c2d1
		
		String st ="aaabbaccd";
		
		Map<Character, Integer>map = new HashMap<>();
		
		for(int i =0; i<st.length(); i++) {
			char ch = st.charAt(i);
	
		
			if(map.containsKey(ch)) {
				int c =map.get(ch);
				c++;
				map.replace(ch, c);
			}else {
				map.put(ch, 1);
			}
		}
		
		for(Character key : map.keySet()) {
			System.out.print(key +"= "+map.get(key)+" ");
		}
		
	}
	
	
	

}
