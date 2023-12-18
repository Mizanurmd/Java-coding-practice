package ArrayDetails;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberOfArray {
	public static void main(String[] args) {
		List<Integer>num = Arrays.asList(1,2,3,4,5);
		
		boolean result= num.stream().allMatch(n->n%2==0);
		
		
		if(result) {
			System.out.println("All are even number");
		}else {
			System.out.println("All are not even number");
		}
		
		num.stream().filter(e->e%2==0).forEach(n-> System.out.println(n));
		List<Integer>odd= num.stream().filter(e->e%2 !=0).collect(Collectors.toList());
		System.out.println(odd);
	}

}
