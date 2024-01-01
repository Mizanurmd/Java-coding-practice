package StreamDetails_8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayList_01 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(15);
		list.add(25);
		list.add(10);
		list.add(50);
		
		/// Show the list whose value above 10
		
		List<Integer>newlist= list.stream().filter(n -> n >10).collect(Collectors.toList());
		System.out.println(newlist);
		
		list.stream().filter(i -> i %2 ==0).forEach(s -> System.out.println(s));
		
		
	}
	

}
