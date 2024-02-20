package FactoryDesignPattern_20_02_2024;

import java.util.Scanner;

public class PaymentMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Transaction type: ");
		String type =sc.nextLine();
		TransactionType t = new TransactionType();
		Payment tp = t.getType(type);
		System.out.println("Enter the Transaction Amount: ");
		int amount =sc.nextInt();
		tp.transaction(amount);
		
		
	}

}
