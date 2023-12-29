package predicateFunction;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierTest {
	public static void main(String[] args) {
		
		Supplier<Date>currentDate = ()-> new Date();
		System.out.println("Current Date is : "+currentDate.get() );
		
	}

}
