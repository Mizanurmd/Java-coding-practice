package ArrayDetails;

import java.util.Arrays;
import java.util.OptionalInt;

public class SecondSmallestEmlement {
	public static void main(String[] args) {
		int[]num = {5,2,3,4,1,1};
		secodSmallValue(num);
	}

	public static void secodSmallValue(int[]arr) {
		OptionalInt secodElement = Arrays.stream(arr).distinct().sorted()
				.skip(1).findFirst();
				//.orElseThrow(()->new IllegalArgumentException("Not found!!!!!!"));
		System.out.println("Second smallest element ="+ secodElement);
	}
}
