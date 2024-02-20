package advantureIt_2024;

public class StringReverse {
	public static void main(String[] args) {
		String st = "Java is very eassy programming language";
		// Reverse method is called here
		reverseSenetece(st);
	}
	
	/////// Create a method for Reverse Sentence
	public static void reverseSenetece(String st2) {
		String[] st3 =st2.split(" ");
		String rev ="";
		for(int i =st3.length-1; i>=0; i--) {
			rev =rev +st3[i]+" ";
		}
		System.out.println("Reverse Senetence = "+ rev);
		
	}

}
