package FactoryDesignPattern_20_02_2024;

public class TransactionType {
	Payment getType(String type) {
		Payment pay =null;
		if(type !=null) {
			switch (type) {
			case "Check":
				pay = new CheckTransaction();
				break;
			case "Debit":
				pay = new CheckTransaction();
				break;
			case "Credit":
				pay = new CheckTransaction();
				break;
			case "UID":
				pay = new CheckTransaction();
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + type);
			}
		}
		
		return pay;
		
	}

}
