package CodingExam;

import java.util.StringJoiner;

public class StringJoinerTest {

	public static void main(String[] args) {
		StringJoiner st = new StringJoiner(",", "[", "]");
		
		st.add("A").add("B").add("C");
		System.out.println(st);
		
		StringJoiner st1 = new StringJoiner(":");
		st1.add("P").add("Q");
		System.out.println(st1);
		
		System.out.println(st +","+ st1);
		System.out.println("StringJoiner Merge here ======================");
		 st.merge(st1);
		 System.out.println(st);

	}

}
