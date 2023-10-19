package ExampUsingStram;

public class FibonacciArray {
	public static void main(String[]args) {
	int n =10;
	long[]ff = generateFibo(n);
	for(int i =0; i<n; i++) {
		System.out.print(Long.toUnsignedString(ff[i])+",");
	}
		
		
	}
	
	
	
	
	
	public static long[]generateFibo(int n){
		long[] f = new long[n];
		f[0] =1;
		f[1] = 1;	
	for(int i =2; i< n; i++) {
		f[i] = f[i -2] + f[i-1];
	}
	return f;
	
	}

}
