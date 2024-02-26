package StreamDetails_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PassAndFailStudent {
	public static void main(String[] args) {
		List<Integer> marks = Arrays.asList(20, 50, 35, 25, 65, 40, 15, 80, 60, 10, 30, 70, 31, 33, 32);
		System.out.println("Pass Student marks are------");
		List<Integer> passStudents = marks.stream().filter(e -> e >= 33).collect(Collectors.toList());
		System.out.println(passStudents);
		System.out.println("Fail Student marks are------");
		List<Integer> failStudents = marks.stream().filter(e -> e < 33).collect(Collectors.toList());
		System.out.println(failStudents);
		System.out.println("Pass after grace marks Student marks are------");
		List<Integer> passAfterGrace = marks.stream().filter(e -> e < 33).map(g -> g + 10).collect(Collectors.toList());
		System.out.println(passAfterGrace);
	}

}
