package java8FeaturesDetails.streamApiDetails;

import java.util.Arrays;

public class IteratorWayPrint {
public static void main(String[] args) {
	int[]a = {2,3,4,5,20};
	System.out.println("===========Before Stream API=============");
	for(Integer i : a) {
		System.out.println(i);
	}
	System.out.println("===========Using Stream API=============");
	Arrays.stream(a).forEach(e->{
		System.out.println(e);
	});
}
}
