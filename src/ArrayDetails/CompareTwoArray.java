package ArrayDetails;

import java.util.Arrays;

public class CompareTwoArray {
	public static void main(String[] args) {
		int[]ar1 = {3,2,4,5,6,7,50};
		int[]ar2 = {3,4,2,6,5,7};
		if(equalArrayCheck(ar1, ar2)) {
			System.out.println("Both array are equal.");
		}else {
			System.out.println("Both array are not equal.");
		}
		
	}

	// create a method here
	public static boolean equalArrayCheck(int[]ar1, int[]ar2) {
		int n = ar1.length;
		int m = ar2.length;
		if(n != m){
			return false;
		}
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		for(int i =0; i<n; i++) {
			if(ar1[i] != ar2[i]) {
				return false;
			}
		}
		
		return true;
		
	}
	
}
