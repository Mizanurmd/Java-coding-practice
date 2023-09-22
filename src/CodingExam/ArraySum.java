package CodingExam;

public class ArraySum {
	public static void main(String[] args) {

		///// Find out missing number from array///////
		int ar[] = new int[] { 1, 2, 3, 5, 4, 6, 7, 8, 10 };

		int actualSum = (10 * 11) / 2;


		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum = sum + ar[i];
		}
		System.out.println("Missing Number is  = " + (actualSum - sum));
		System.out.println(actualSum);
	}

}
