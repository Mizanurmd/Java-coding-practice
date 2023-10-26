package LeadingExam_1;

public class RecusionTest {
	// Create a function here ////
	public static void printNumber(int n) {
//		if(n == 0) {
//			return;
//		}
		
		if(n == 6) {
			return;
		}
		
		System.out.print(n+",");
		//printNumber(n-1);
		printNumber(n +1);
	}
	
	public static void main(String[] args) {
		
		//int n =5;
		int n =1;
		printNumber(n);
		System.out.println("\n=========Another way print==============");
		for(int i=5; i>0; i--) {
			System.out.print(i+",");
		}
	}

}
