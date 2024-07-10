package Stream_Examp_2024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterOne {
	public static void main(String[] args) {
		//Q. Finter the even number from Arraylist using stream API?
		
		List<Integer>list = Arrays.asList(10,15,20,36,45,50);
		//List<Integer>even=list.stream().filter(e-> e%2==0).collect(Collectors.toList());
		List<Integer>even=list.stream().filter(e-> e%2==0).toList();
		System.out.println(even);
		
	}

}
