package LambdaDetails;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductTest {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product(1, "HP Laptop", 25000f));
		list.add(new Product(3, "Keyboard", 3500f));
		list.add(new Product(2, "Dell Mouse", 1550f));
		list.add(new Product(5, "HP Laptop", 25000f));
		list.add(new Product(10, "Keyboard", 3000f));
		list.add(new Product(6, "Dell Mouse", 1150f));
		System.out.println("Sorted basic to the name-----------");
		// sorting lambda Expression here
		Collections.sort(list,(p1,p2)->{
			return p1.getName().compareTo(p2.getName());
		});
		for(Product p :list) {
			System.out.println(p);
		}

	}

}
