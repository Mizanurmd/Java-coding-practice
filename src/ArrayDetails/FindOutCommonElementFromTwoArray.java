package ArrayDetails;

import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

public class FindOutCommonElementFromTwoArray {
	public static void main(String[] args) {
		int[]num1 = {1,2,3,4,5,8};
		int[]num2 = {4,5,6,7,8,6}; 
		commonElement(num1, num2);
	}
	
	public static void commonElement(int[]ar1, int[]ar2) {
		List<Integer>com= Arrays.stream(ar1).filter(n->Arrays.stream(ar2).anyMatch(e-> e ==n))
				.boxed().collect(Collectors.toList());
		System.out.println("Comon element of two array : "+ com);
		
	}

}
