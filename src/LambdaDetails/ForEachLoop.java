package LambdaDetails;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("ankit");
		list.add("mayank");
		list.add("irfan");
		list.add("jai");
		//System.out.println(list);
		list.forEach(n->{System.out.println(n);});
		
	}

}
