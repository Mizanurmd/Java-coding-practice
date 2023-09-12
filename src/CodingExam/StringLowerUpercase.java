package CodingExam;

public class StringLowerUpercase {
	public static void main(String[]agrs) {
		///////// String  fifty percent upperCase and fifty percent lowerCase ///
		String st ="This is coding practice This is coding practice";
		
		int mid = st.length()/2;
		String lowerCase = "";
		String uperCase = "";
		
		for(int i = 0; i < st.length(); i++) {
			if(i <mid) {
				lowerCase = lowerCase + Character.toLowerCase(st.charAt(i));
			}else {
				uperCase = uperCase + Character.toUpperCase(st.charAt(i));
			}
		}
		
		System.out.println(lowerCase + uperCase);
	}

}
