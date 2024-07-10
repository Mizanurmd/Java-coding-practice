package ExamPart_4;

import java.util.Arrays;
import java.util.stream.IntStream;


public class MaxValArray2 {
	public static void main(String[] args) {
		int[]a = {2,1,100,5,6,7,8,9,2,9,50,5};

		
		int max =a[0];
		for(int i = 0; i<a.length; i++) {
			if(a[i]> max) {
				max =a[i];
			}
		}
		
		System.out.println(max);
		
		
		
	}

}
