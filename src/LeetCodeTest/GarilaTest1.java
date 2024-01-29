package LeetCodeTest;

public class GarilaTest1 {

	public static void main(String[] args) {
		String st ="Helow2 is5 very3";
		

	System.out.println(GarilaTest1.decryption(st));
		
	}
	
	
		public static String decryption( String input ) {
			//Insert your code here
		
		String[]stp = input.split(" ");
		char[]ch=stp.toString().toCharArray();
		int c =0;
		for(int i=0; i<ch.length; i++){
			if(Character.isDigit(ch[i])){
				c = c + i;
			}
		}
	System.out.print(c);
	return input;

		
		}
}

//public class TestTaker {
//	public static String decryption( String input ) {
//		//Insert your code here
//
//	String[]stp = input.split(" ");
//	char[]ch=input.toString().toCharArray();
//	int c =0;
//	for(int i=0; i<ch.length; i++){
//		if(Character.isDigit(ch[i])){
//			c = c + i;
//		}
//	}
//System.out.print(c);
//return input;
//	}
//}
