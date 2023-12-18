package ArrayDetails;

import java.util.StringJoiner;

public class StringJoingerTest {
	public static void main(String[] args) {
		// Output : A, B, C
		//			P : Q
		//			A, B, C, P : Q
		
		//StringJoiner stj = new StringJoiner(",");
		StringJoiner stj = new StringJoiner(",", "[", "]"); // prefix and suffix
		stj.add("A").add("B").add("C");
		System.out.println(stj);
		StringJoiner stj2 = new StringJoiner(":");
		stj2.add("P").add("Q");
		System.out.println(stj2);
		
		stj.merge(stj2);
		System.out.println(stj);
		
	}

}
