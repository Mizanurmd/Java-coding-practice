package Exampart_03_Pattern;

public class Pattern_02 {
	public static void main(String[] args) {
		pattern2(5);
	}
	
	/// Create a method here 
	
	static void pattern2(int n) {
		for(int row =1; row<=n; row++) {
			for(int col =1; col<=n; col++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}
