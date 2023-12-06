package Exampart_03_Pattern;

public class Pattern_03 {
	public static void main(String[] args) {
		pattern3(5);
		System.out.println("Second method is calling here ");
		pattern03(5);
	}

	//Create a method here 
	
	static void pattern3(int n) {
		for(int row=n; row>=1; row--) {
			for(int col=row; col>=1; col--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	// Create another method here
	static void pattern03(int n) {
		for(int row =1; row<=n; row++) {
			for(int col =1; col<=n-row+1; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
}
