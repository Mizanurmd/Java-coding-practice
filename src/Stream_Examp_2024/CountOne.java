package Stream_Examp_2024;

import java.util.Arrays;
import java.util.List;

public class CountOne {
	public static void main(String[] args) {
		//Q. Count the pass student from this.
		
		List<Integer>marks = Arrays.asList(30,33,35,54,40,80,50,32,29);
		long numberOfPassStudent = marks.stream().filter(e->e>=33).count();
		System.out.println("Total number of Pass Student: "+ numberOfPassStudent);
		long numberOfFailStudent = marks.stream().filter(e->e<33).count();
		System.out.println("Total number of Fail Student: "+ numberOfFailStudent);
		
		
	}

}
