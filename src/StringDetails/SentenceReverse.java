package StringDetails;

public class SentenceReverse {
	public static void main(String[] args) {
		String st ="Welcome to CloudTech";
		String[]st2 =st.split(" ");
		String reveSentence ="";
		for(int i=st2.length-1; i>=0; i--) {
			reveSentence = reveSentence+st2[i]+" ";
		}
		System.out.println(reveSentence);
		
		//Calling method for Reverse Sentence here
		String re =reSeten(st);
		System.out.println(re);
	}

	// Create a method for Reverse Sentence
	public static String reSeten(String orSent) {
		String[]spl =orSent.split(" ");
		String reSentence ="";
		for(int i =spl.length-1; i>=0; i--) {
			reSentence = reSentence +spl[i]+" ";
		}
		return reSentence;
		
	}
	
	
}
