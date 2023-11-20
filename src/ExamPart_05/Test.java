package ExamPart_05;

import java.util.HashMap;

public class Test {
	public static void main(String[] args) {
		
		String name = "I am A good AA am java Developer.";
		String[]sp = name.split(" ");
		int c;
		HashMap<String, Integer>map = new HashMap<>();
		
		for(int i =0; i<sp.length; i++) {
			if(map.containsKey(sp[i])) {
				c = map.get(sp[i]);
				map.put(sp[i], c+1);
			}else {
				map.put(sp[i], 1);
			}
			
		}
		
		System.out.println(map);
	}

}
