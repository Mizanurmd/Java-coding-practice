package LeadingExam_1;

public class Test {
	public static void printNumber(int n) {
		
		if(n==0) {
			return;
		}
		System.out.print(n +",");
		printNumber(n -1);
		
	}
	
	
	public static void main(String[] args) {
		int n =10;
		printNumber(n);
		
		
		////////loop/////////
		System.out.println("\n ====================Print loop ==================");
		for(int i =10; i>0; i--) {
			System.out.print(i +",");
		}
		
	}

}
