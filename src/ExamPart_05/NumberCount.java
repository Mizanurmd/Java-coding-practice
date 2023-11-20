package ExamPart_05;

import java.util.HashMap;

public class NumberCount {
public static void main(String[] args) {
	//Q #5) Write a Java Program to count the number of words in a string using HashMap.
	
	String st = "This this is is done by Saket Saket";
	int c ;
	String[]token = st.split(" ");
	
	HashMap<String, Integer>map = new HashMap<>();
	
	for(int i =0; i< token.length; i++) {
		if(map.containsKey(token[i])) {
			c = map.get(token[i]);
			map.put(token[i], c+1);
		}else {
			map.put(token[i], 1);
		}
		
	}
	System.out.println(map);
	
}
}
