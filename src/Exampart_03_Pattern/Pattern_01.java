package Exampart_03_Pattern;

public class Pattern_01 {
	public static void main(String[] args) {
		pattern1(5);
	}

	// Create a method here//
	
	public static void pattern1(int n) {
		 
		for(int row =1; row<=n; row++ ) {
			for(int col =1; col<=row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}
