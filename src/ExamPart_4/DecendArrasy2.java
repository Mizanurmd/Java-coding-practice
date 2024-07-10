package ExamPart_4;

import java.util.Iterator;

public class DecendArrasy2 {
	public static void main(String[] args) {
		int[]a = {2,5,6,7,8,9,2,9,5,5};
		
		for(int i=0; i<a.length; i++) {
			int temp;
			for(int j =i+1; j<a.length; j++) {
				if( a[i]< a[j]) {
					temp = a[i];
					a[i]= a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+",");
		}
		
		
		
	}

}
