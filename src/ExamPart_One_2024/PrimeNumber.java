package ExamPart_One_2024;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		//Q #7) Write a Java Program to find whether a number is prime or not.
		int num, temp;
		boolean isPrime =true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any interger number: ");
		num = sc.nextInt();
		sc.close();
		for(int i=2; i<=num/2; i++) {
			temp = num%i;
			if(temp==0) {
				isPrime = false;
				break;
			}
			
		}
		if(isPrime) {
			System.out.println("Prime");
		}else {
			System.out.println("Not prime");
		}
	}

}
