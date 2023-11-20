package ExamPart_4;

import java.util.Arrays;

public class ArraySortingUsingLoop {
	public static void main(String[] args) {

		int[] a = { 2, 5, 6, 7, 8, 9, 2, 9, 5, 5 };
		String[] myArray2 = { "one", "Two", "Three","Ten","Eight", "Nine", "Four", "Five", "Six", "Seven" };
		Arrays.sort(myArray2);
		System.out.println("Sorting Of MyArray = "+ Arrays.asList(myArray2));
		System.out.println("Reverse of myArray2================");
		for (int i = myArray2.length - 1; i >= 0; i--) {
			System.out.print(myArray2[i] + ",");
		}

		System.out.println("\nBefor Sorting of Array =" + Arrays.toString(a));
		System.out.println("After sorting of Array: ");
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				int temp;

				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}
			System.out.print(a[i] + ",");
		}

	}

}
