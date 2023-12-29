package ExamPart_CalByValue;

public class RecursionMethod {
	int c =0;
	void recusionM() {
		c++;
		if(c <= 5) {
			System.out.println("Hello=========");
			recusionM();
		}
		
		
	}
	
	public static void main(String[] args) {
	RecursionMethod r = new RecursionMethod();
	r.recusionM();
	}

}
