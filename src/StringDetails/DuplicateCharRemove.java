package StringDetails;

import java.util.Arrays;

import java.util.stream.Collectors;

public class DuplicateCharRemove {
	public static void main(String[] args) {
		String st ="aaabbbcccaddkjdglm";
		//Approach-1
		//Arrays.stream(st.split("")).collect(Collectors.toSet()).forEach(e->System.out.println(e));
		//Arrays.stream(st.split("")).collect(Collectors.toSet()).forEach(System.out::print);
		
		// Approach-2
		st.chars().mapToObj(item->(char)item).collect(Collectors.toSet()).forEach(System.out::print);
		
		
	}

}
