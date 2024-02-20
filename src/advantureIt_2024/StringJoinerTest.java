package advantureIt_2024;

import java.util.StringJoiner;

public class StringJoinerTest {
	public static void main(String[] args) {
		// Print A, B, C
		StringJoiner st = new StringJoiner(",","[","]");
		st.add("A").add("B").add("C");
		System.out.println(st);
		
		// print P: Q
		StringJoiner st2 = new StringJoiner(":");
		st2.add("P").add("Q");
		System.out.println(st2);
		// Print [A,B,C,P:Q]
	
		System.out.println(st.merge(st2));
	}
	
	

}
