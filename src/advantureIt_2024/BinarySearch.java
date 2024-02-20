package advantureIt_2024;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Terget number of array: ");
		int[] num = { 10, 20, 30, 2, 5, 60, 80, 1, 90, 100 };
		Arrays.sort(num);
		int tergetNumber = sc.nextInt();
		int lef = 0, right = num.length, mid;

		while (lef < right) {
			mid = (lef + right) / 2;
			if (num[mid] == tergetNumber) {
				System.out.println("Number index is found : " + mid);
				return;
			} else if (num[mid] < tergetNumber) {
				lef = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		
	}

}
