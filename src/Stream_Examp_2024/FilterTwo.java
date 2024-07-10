package Stream_Examp_2024;

import java.util.Arrays;
import java.util.List;

public class FilterTwo {
	public static void main(String[] args) {
		List<Integer>marks = Arrays.asList(30,33,35,54,40,80,50,32,29);
		List<Integer>passed = marks.stream().filter(e->e<33).map(i-> i+5).toList();
		System.out.println(passed);
		
		
	}

}
