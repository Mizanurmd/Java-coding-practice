package CodingExam;

public class StringPool {
	public static void main(String[]args) {
		String st = "Book";
		
		//==
		 String st2 = "Book";
		 String st3 = new String("Book");
		 String st4 = new String("Book");
		 System.out.println(st2==st4);
		 
		 System.out.println(st3.equals(st4));
		 
		 for(int i =10; i>=0; i--) {
			 System.out.print(i+",");
		 }
		 System.out.println("\n while loop =============");
		 int a=10;
		 while(a >=0) {
			 System.out.print(a+ ",");
			 a--;
		 }
		 
		 int b=0;
		 System.out.println("\n do while loop =============");
		 do {
			 System.out.print(a+ ",");
			 b--;
		 }
		while(b<=10);		
	}

}
