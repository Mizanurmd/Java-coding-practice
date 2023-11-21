package ExamPart_06;

import java.util.HashSet;
import java.util.Set;

public class FindOutUniqueValue {
	public static void main(String[] args) {
		
		int[]arr = {1,2,3,4,6,74,8,2,1,3,10};
		
		Set<Integer> uVal = new HashSet<>();
		
		for(int val: arr) {
			uVal.add(val);
		}
		
		System.out.println("Unique Value is = "+ uVal);
		
	}

}
