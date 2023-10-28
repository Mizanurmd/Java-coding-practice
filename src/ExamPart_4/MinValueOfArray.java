package ExamPart_4;

public class MinValueOfArray {
	public static void main(String[] args) {
		int[]a = {2,5,6,7,8,9,2,9,5,5};
		
		int min = a[0];
		 for(int i =0; i<a.length; i++) {
			 if(a[i] < min) {
				 min = a[i];
			 }
		 }
		
		System.out.println("Minimum Value of Array = " + min);
		
	}

}
