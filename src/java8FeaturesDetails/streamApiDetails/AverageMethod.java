package java8FeaturesDetails.streamApiDetails;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AverageMethod {
public static void main(String[] args) {
	int[]a = {2,3,4,5,20,2,3,4,5};
	int sum =0;
	
	for(int i =0; i<a.length; i++) {
		sum =sum + a[i];
	}
	System.out.println("Beofore Stream Api total Sum :"+ sum);
	System.out.println("Beofore Stream Api total Average :"+sum/a.length);
	
	System.out.println("==========using stream API ==============");
	 OptionalDouble av=Arrays.stream(a).average();
	 System.out.println(" Average :"+ av);
	
}
	
}
