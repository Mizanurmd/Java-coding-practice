package ExampUsingStram;

public class NotRepeatedCharacter {
	public static void main(String[]args) {
		// Q #14) Write a java progam to find  a character that is not first repeated in string.
		// Input : Stress;
		// Output : t
		
		String st ="stress";
		boolean status = false;
		for(int i =0; i <st.length(); i++) {
			status = false;
			
			for(int j = i+1; j<st.length(); j++) {
				if(st.charAt(i)== st.charAt(j)) {
					status = true;
					break;
				}
			}
			
			if(!status) {
				System.out.println(st.charAt(i));
				break;
			}
			
		}
		
		
		
	}

}
