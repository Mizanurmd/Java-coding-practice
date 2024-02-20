package FactoryDesignPattern_20_02_2024;

public class DebitCard implements Payment{

	@Override
	public void transaction(double amount) {
		System.out.println("Transaction is initiated by Debit Card: Amount is: Tk."+amount);
		
	}

}
