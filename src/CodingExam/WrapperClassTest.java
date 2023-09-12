package CodingExam;

public class WrapperClassTest {

	public static void main(String[] args) {
		/////////// Auto boxing in Wrapper Class //////////
		///// primitive data convert to Object //////////
		
		int a = 10;
		 Integer aa = Integer.valueOf(a);
		 Integer b = a;
		 System.out.println(a);
		 System.out.println(aa);
		 System.out.println(b);
		 System.out.println("============== Unboxing Objects convert to primitive data.");
///////////  Unboxing in Wrapper Class //////////
		///// Objects convert to primitive data //////////
		Double d = new Double(50.20);
		 double dd = d.doubleValue();
		 System.out.println(d);
		 System.out.println(dd);
		 
		 String st = Double.toString(dd);
		 System.out.println(st);
		 
		 String s = "100";
		 int y = 50;
		 int inn = Integer.parseInt(s);
		 int z = inn + y;
		 System.out.println(inn);
		 System.out.println("Sum = " + z);

	}

}
