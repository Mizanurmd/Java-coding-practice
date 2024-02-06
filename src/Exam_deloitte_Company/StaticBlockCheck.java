package Exam_deloitte_Company;

public class StaticBlockCheck {
	  public static void main(String[] args) {  
		  StaticBlockCheck obj = new StaticBlockCheck(n); 
		  
		float a =(float) (35.5/0);
		System.out.println(a);
		  
	 }  
	 static int a = 10;  
	 static int n;  
	 int b = 5;  
	 int c;  
	 public StaticBlockCheck(int m) {  
	       System.out.println(a + ", " + b + ", " + c + ", " + n + ", " + m);  
	   }  
	// Instance Block  
	  {  
	     b = 30;  
	     n = 20;  
	  }   
	// Static Block  
	  static   
	{  
	          a = 60;  
	     }   
	
	
}
