package CodingExam;

public class RemoveAnyCharString {
	public static void main(String[]args) {
		
		String st1  = "Mizanur";
		//System.out.println(st.replaceAll("am", "a"));
		
		char ch ='a';
		removeWord(st1, ch);
		
	}
	
	
	////////// Create a method ////////////
	static void removeWord(String st1, char c) {
		int n = st1.length();
		String finalWord ="";
		for(int i = 0; i<n; i++) {
			if(st1.charAt(i) != c) {
				finalWord = finalWord + st1.charAt(i);
			}
		}
		System.out.println(finalWord); 
		
	}

}
