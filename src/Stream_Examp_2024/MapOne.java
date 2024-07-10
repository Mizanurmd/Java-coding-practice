package Stream_Examp_2024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapOne {
	public static void main(String[] args) {
		//Q. Multiply by two each element of list
		List<Integer>list = Arrays.asList(10,15,20,36,45,50);
		
		//List<Integer>multipleElement=list.stream().map(e-> e*2).collect(Collectors.toList());
		List<Integer>multipleElement=list.stream().map(e-> e*2).toList();
		System.out.println(multipleElement);
		
	}

}
