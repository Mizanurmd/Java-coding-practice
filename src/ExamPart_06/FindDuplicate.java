package ExamPart_06;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
public static void main(String[] args) {
	
	int[]arr = {1,2,3,4,5,6,7,2,3,4,10};
	
	Set<Integer>s = new HashSet<>();
	Set<Integer>dVal = new HashSet<>();
	
	
	for(int val : arr) {
		if(!s.add(val)) {
			dVal.add(val);
		}
	}
	System.out.println("Unique value = "+s);
	System.out.println("Duplicate value = "+dVal);
	
}
}
