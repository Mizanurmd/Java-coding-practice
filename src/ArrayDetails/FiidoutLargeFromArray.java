package ArrayDetails;

public class FiidoutLargeFromArray {
	public static void main(String[] args) {
		
		int[]num = new int[] {10,50,60,80,90,20,30,100};
		int largeNumber = num[0];
		
		for(int i =0; i<num.length; i++) {
			if(largeNumber < num[i]) {
				largeNumber = num[i];
			}
		}
		System.out.println("Large number is = "+ largeNumber);
		
	}

}
