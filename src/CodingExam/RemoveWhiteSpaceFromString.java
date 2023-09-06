package CodingExam;

public class RemoveWhiteSpaceFromString {
	public static void main(String[]args) {
		String sent ="Saket Saurav        is a QualityAna    list";
		//////////  using replaceAll() method///////////////
		
		String rep = sent.replaceAll("\\s", "");
		System.out.println(rep);
		
		
	}

}
