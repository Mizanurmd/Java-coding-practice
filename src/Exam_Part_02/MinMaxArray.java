package Exam_Part_02;

public class MinMaxArray {
	public static void main(String[] args) {

		int[] arr = { 10, 5, 12, 50, 100, 500 };
		
		int sum =0;
		for(int i =0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Total sum is = "+ sum);

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];

			}
		}
		System.out.println("Max number is = " + max);
		System.out.println("MaxValue number is = " + (sum - max));

		System.out.println("==========Find out minimum number ================");
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];

			}
		}
		System.out.println("Min number is = " + min);
		System.out.println("MinValue number is = " + (sum - min));

	}

}
