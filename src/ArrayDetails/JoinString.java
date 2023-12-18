package ArrayDetails;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinString {
	public static void main(String[] args) {
		// input list: ["Hello", " ", "World", "!"]
		// output : Hello World!
		List<String> st = Arrays.asList("Hello", " " ,"World","!");
		
		String result= st.stream().collect(Collectors.joining());
		System.out.println("Concating string is  : "+ result);
		// calling method here
		equalCheck();
		
	}
	
	public static void equalCheck() {
		String st = new String("cloudtech");
		String st2 = new String("cloudtech");
		
		if(st == st2) 
			System.out.println("st == st2");
		else
			System.out.println("st != st2");
		
		if(st.equals(st2))
			System.out.println("Both strings are equal");
		else
			System.out.println("Both strings are different");
		
	}

}
