package Exampart_03_Pattern;

public class Pattern_05 {
	public static void main(String[] args) {
		pattern5(5);
		
	}
	
	///Create a method here
	static void pattern5(int n) {
		for(int row =1; row<=n*2; row++) {
			int totatlRows = row >n ? n*2-row :row;
			for(int col=1; col<=totatlRows; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
