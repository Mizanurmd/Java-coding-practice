package ArrayDetails;

public class EvenNumberFromArray {
	public static void main(String[] args) {
		int[]ar = {1,2,5,4,7,8,30,91,11,20};
		
		/*	
		int[]a= new int[ar.length];
		int index =0;
	
		// logic here for even number
		for(int i =0; i<ar.length; i++) {
			if(ar[i] %2 ==0) {
				a[index] = ar[i];
				index++;
			}
		}
		// logic here for old number
				for(int i =0; i<ar.length; i++) {
					if(ar[i] %2 !=0) {
						a[index] = ar[i];
						index++;
					}
				}
		// print Array
		for(int i =0; i<a.length; i++) {
			System.out.print(a[i]+",");
		}
		*/
		
		// calling method here 
		
		evenAndOldPrint(ar);
		
	}
	
	public static void evenAndOldPrint(int[]ar) {
		int[]b = new int[ar.length];
		int index=0;
		// check for even number here
		for(int i =0; i<ar.length; i++) {
			if(ar[i]%2 == 0) {
				b[index]=ar[i];
				index++;
			}
		}
		// check for old number here
		for(int i =0; i<ar.length; i++) {
			if(ar[i]%2 != 0) {
				b[index]=ar[i];
				index++;
			}
		}
		// print array here
		for(int i = 0; i<b.length; i++) {
			System.out.print(b[i]+",");
		}
		
		
	}

}
