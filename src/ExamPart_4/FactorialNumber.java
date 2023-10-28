package ExamPart_4;

public class FactorialNumber {
	public static void  main(String[] args) {
		
		// 5! = 5*4*3*2*1 = 120
		// 5 = 1 * 2* 3* 4* 5 =120 
		int fact = 1;
		for(int i =5; i>=1; i--) {
			fact = fact * i;
		}			
		System.out.println("Factorial of 5 = "+ fact);
		
		
		StringBuilder fname =new StringBuilder("Mizanur");
		String lname = " Rahman";
		fname.append('R');
	
		System.out.println("Full name is = "+fname);
		
		FactorialNumber f = new FactorialNumber();
	System.out.println("Method is calling = "+f.mmm(lname));	
		
		
	}
	
	void mx(int a) {
		
	}

	int mmm(String a) {
		return 56;
	}
}
