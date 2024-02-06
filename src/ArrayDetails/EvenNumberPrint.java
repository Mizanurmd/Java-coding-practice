package ArrayDetails;

import java.util.HashSet;
import java.util.Set;

public class EvenNumberPrint {
	public static void main(String[] args) {
		int[]ar = {1,2,30,5,4,7,8,30,8,5,91,11,20};
	
		for(int i =0; i<ar.length;i++) {
			if(ar[i]%2!=0) {
				System.out.print(ar[i]+" ");
			}
		}
		// duplicate find here
		// Approach-1
		System.out.println();
		
		for(int i =0; i<ar.length;i++) {
			for(int j =i+1; j<ar.length; j++) {
				if(ar[i]==ar[j]) {
					System.out.print(ar[i]+",");
				}
			}
		}
	
		//Approach-2
		System.out.println("====================");
		Set<Integer>ss = new HashSet<>();
		Set<Integer>sss = new HashSet<>();
		for(int i :ar) {
			if(ss.add(i)) {
				System.out.print(i+",");
			}else {
				
				sss.add(i);
				
			}
		}
		System.out.println();
		System.out.println(ss);
		System.out.println();
		System.out.println(sss);
	}

}
