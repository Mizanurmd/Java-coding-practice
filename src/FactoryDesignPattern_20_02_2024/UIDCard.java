package FactoryDesignPattern_20_02_2024;

public class UIDCard implements Payment{

	@Override
	public void transaction(double amount) {
		System.out.println("Transaction is initiated by UIDCard: Amount is: Tk."+amount);
		
	}

}
