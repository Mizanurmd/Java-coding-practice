package Exam_Part_02;



public class MainClass {
	public static void main(String[] args) {
		OuterClass utter = new OuterClass();
		utter.heyMan();
	
		//Calling inner Class here 
		OuterClass.InnerClass inner = utter.new InnerClass();
		inner.whatsUp();
		
		// calling Static class here
		
		OuterClass.InnerClass2 inner2 = new OuterClass.InnerClass2();
		inner2.heyStaticClass();
		//Calling inner Class here 
		
		
	}

}
