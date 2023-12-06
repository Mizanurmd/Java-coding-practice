package Exampart_03_Pattern;

public class Pattern_04 {
	public static void main(String[] args) {
		pattern4(5);
	}

	//create a method here
	
	static void pattern4(int n) {
		for(int row =1; row<=n; row++) {
			for(int col =1; col<=row; col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	
}
