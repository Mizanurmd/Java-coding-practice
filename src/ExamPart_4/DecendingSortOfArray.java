package ExamPart_4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



public class DecendingSortOfArray {
	public static void main(String[] args) {
		int[]a = {2,5,6,7,8,9,2,9,5,5};
		Set<Integer>duSet = new HashSet<>();
		
		for(int aa : a) {
			duSet.add(aa);
		}
	System.out.println(duSet);
		System.out.println("Befor Sort of Array = "+Arrays.toString(a));
		System.out.println("After Sort of Array :");
		
		for(int i = 0; i <a.length; i++) {
			int temp;
			for(int j =i +1; j<a.length; j++) {
				if(a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
			System.out.print(a[i]+",");
		}
		
		
	}

}
