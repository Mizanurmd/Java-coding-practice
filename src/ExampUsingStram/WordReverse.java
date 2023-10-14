package ExampUsingStram;

public class WordReverse {

	public static void main(String[]args) {
		
		String st ="Coding is very easy in java";
		String []str =st.split(" ");
		String rev = "";
		
		for(int i =str.length-1; i>=0; i--) {
			rev = rev + str[i]+" ";
		}
		System.out.println("Word Reverse is = "+ rev);
		
	}
	
}
