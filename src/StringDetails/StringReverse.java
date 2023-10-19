package StringDetails;

public class StringReverse {
	public static void main(String[]args) {
		String st ="Mizanur", rev ="";
		String[]token = st.split("");
		
		for(int i = token.length-1; i>=0; i--) {
			rev = rev + token[i];
		}
		System.out.println(rev);
	}

}
