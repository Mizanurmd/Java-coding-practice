package StringDetails;

public class CharRemoveFromString {
	public static void main(String[] args) {
		String st = "CloudTeCh";
		// Using in build function
		//System.out.println(st.replace("C", ""));
		
		// calling here custom method
		removeChar(st, 'C');
	}

	// Customer in build function
	public static void removeChar(String st, char c) {
		String strinFianl = "";
		for(int i =0; i<st.length(); i++) {
			if(st.charAt(i) != c) {
				strinFianl = strinFianl+st.charAt(i);
			}
		}
		System.out.println("String After remove C character : "+ strinFianl);
	}
	
}
