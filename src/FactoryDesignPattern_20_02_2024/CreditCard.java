package FactoryDesignPattern_20_02_2024;

public class CreditCard implements Payment{

	@Override
	public void transaction(double amount) {
		System.out.println("Transaction is initiated by Credit Card: Amount is: Tk."+amount);
		
	}

}
