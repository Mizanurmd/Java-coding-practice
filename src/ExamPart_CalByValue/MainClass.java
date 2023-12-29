package ExamPart_CalByValue;

public class MainClass {
	public static void main(String[] args) {
		
		CallingValue cv = new CallingValue();
		System.out.println("Before change : "+ cv.data);
		cv.change(500);
		System.out.println("After change : "+ cv.data);
		
	}

}
