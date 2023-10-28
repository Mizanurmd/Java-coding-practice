package ExamPart_4;

public class DuplicateValueOfArray {
	public static void main(String[] args) {
		// find out duplicate value form array
		int[]a = {2,5,6,7,8,9,2,9,5,5};
		
		for(int i =0; i<a.length; i++) {
			for(int j =0; j<i; j++) {
				if(a[i] == a[j]) {
					System.out.println("Duplicate value of Array = "+ a[j]);
				}
			}
		}
		
		
	}

}
