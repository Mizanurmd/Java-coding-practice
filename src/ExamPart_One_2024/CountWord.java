package ExamPart_One_2024;

import java.util.HashMap;
import java.util.Map;

public class CountWord {
	public static void main(String[] args) {
		// Q #5) Write a Java Program to count the number of words in a string using
		// HashMap.

		String st = "Java progamming very a is very is easy";
		//String st = "This this is is done by Saket Saket";
		String[] word = st.split(" ");
		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < word.length; i++) {
			if (map.containsKey(word[i])) {
				int count = map.get(word[i]);
				map.put(word[i], count+1);
			} else {
				map.put(word[i], 1);
			}
		}
		System.out.println(map);
	}

}
