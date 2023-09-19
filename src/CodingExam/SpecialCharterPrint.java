package CodingExam;

public class SpecialCharterPrint {
	public static void main(String[] args) {

		String st = "Miz@nu*r#!";

		int len = st.length();
		int c = 0;
		
		String specialCharRemove ="";
		
		int i;
		for (i = 0; i < len; i++) {
			if (!Character.isDigit(st.charAt(i)) && !Character.isLetter(st.charAt(i))
					&& !Character.isWhitespace(st.charAt(i))) {
				c++;
			}else {
				specialCharRemove = specialCharRemove +st.charAt(i);
			}

		}
		if (c == 0) {
			System.out.println("Special Character is not found.");
		} else {
			System.out.println("Special Character is founded = " + c);
		}

		System.out.println("Remove special character then print String = "+ specialCharRemove);
	}

}
