package Exam_Part_02;

public class CountString {
	static  int x;

	public static void main(String[] args) {
		x =12;
		String st = "Mizanur Rahman";
		int count  =0;
		
		for(int i = 0 ; i <st.length(); i++) {
			if(st.charAt(i) !=' ') {
				count ++;
			}
		}
		System.out.println("Count fo character of the String = "+ count);
		
		
		for(int i = 0 ; i <st.length(); i++) {
			
				count ++;
			
		}
		System.out.println("Count fo character of the String = "+ count);
	
	}

}
