package ExamPart_06;

public class SpecialCharacter {
	public static void main(String[] args) {
		
		String st = "mizanur021991@gmail.com";
		
		char[]c = st.toCharArray();
		String s ="";
		for(int i =0; i<c.length; i++ ) {
			if(!Character.isLetter(c[i]) && !Character.isDigit(c[i])) {
				s = s+c[i];
			}
			
		}
		System.out.println(s);
		
	}

}
