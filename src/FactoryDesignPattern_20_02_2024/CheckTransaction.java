package FactoryDesignPattern_20_02_2024;

public class CheckTransaction implements Payment{

	@Override
	public void transaction(double amount) {
		System.out.println("Transaction is initiated by Check: Amount is: Tk."+amount);
		
	}

}
