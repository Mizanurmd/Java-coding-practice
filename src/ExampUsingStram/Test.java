package ExampUsingStram;

public class Test {
	public static void main(String[]args) {
		
		int n = 6;
		System.out.println(fact(n));
		System.out.println("=================Findout facterial number using for loop ==========================");
		int a = 5;
		int facterial =1;
		for(int i =1; i<=a; i++) {
			facterial =  facterial *i;
		}
	System.out.println(facterial);
		
	}
	
	public static int fact(int n) {
		if(n == 1) {
			return 1;
		}
		return n * fact(n-1); // 5*4*3*2*1 = 120
	}

}
