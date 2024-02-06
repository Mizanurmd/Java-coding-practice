package SEBPO_05_02_2024;

import java.util.Arrays;

public class Progrma11 {
	public static void main(String[] args) {
		Object[]myObject = {
				new Integer(12),
				new String("foo"),
				new Integer(12),
				new Boolean(true)
		};
		Arrays.sort(myObject);
		for(int i =0; i<myObject.length; i++) {
			System.out.println(myObject[i].toString());
			System.out.print(" "); // C (ClassCastException)
		}
		
	}

}
