package StreamDetails_8;

import java.util.ArrayList;
import java.util.List;

public class StrampMap {
	public static void main(String[] args) {
	
			List<String>languages = new ArrayList<>();
			languages.add("English");
			languages.add("German");
			languages.add("French");
			languages.add("Bangla");
			languages.add("Arabic");
			System.out.println("==========Upper case all objects=========");
			languages.stream().map(la-> la.toUpperCase()).forEach(System.out::println);
			System.out.println("==========Lower case all objects=========");
			languages.stream().map(la-> la.toLowerCase()).forEach(System.out::println);
	}

}
