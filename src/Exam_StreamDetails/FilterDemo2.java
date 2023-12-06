package Exam_StreamDetails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
	public static void main(String[] args) {
		List<Product>p = new ArrayList<>();
		
		p.add(new Product(1, "Book",250.5));
		p.add(new Product(2, "history",150.5));
		p.add(new Product(3, "JBook",250.5));
		p.add(new Product(4, "Kide",350.5));
		p.add(new Product(5, "Novel",1200.5));
		p.add(new Product(6, "Ancient Book",2500.5));
		
		//// Another way //////////
		List<Product>pp = Arrays.asList(
				new Product(10,"Test",120.20),
				new Product(10,"Test1",520.20),
				new Product(10,"Test2",720.20),
				new Product(10,"Test3",820.20),
				new Product(10,"Test4",820.20),
				new Product(10,"Test5",320.20),
				new Product(10,"Test6",920.20),
				new Product(10,"Test7",620.20)
				);
		
		//System.out.println(pp);
		
		p.stream().filter(e ->e.getPrice()>350.50).forEach(e -> System.out.print(e));
		
		////Another test///
		List<Product> test= pp.stream().filter(e->e.getPrice()>320).collect(Collectors.toList());
		System.out.println("\n==================================");
		
		System.out.println(test);
		
		System.out.println("========== Combination fillter and map=============");
		
		List<Double> m = pp.stream()
		.map(e->e.getPrice()+200).collect(Collectors.toList());
		
		System.out.println(m);
		
	}

}
