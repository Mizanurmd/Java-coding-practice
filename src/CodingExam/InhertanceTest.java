package CodingExam;

public class InhertanceTest {
	public static void main(String[]args) {
		AAA a = new AAA();
		a.add();
		BBB b = new BBB();
		b.add2();
		
		for(int i =10; i>=0; i--) {
			System.out.print(i+",");
		}
		
		
	}

}

//////// Create a Class here //////////////

class AAA{
	public void add() {
		int a = 10;
		int b = 20;
		int z =  a + b ;
		System.out.println("Total sum is = " +z);
	}
}

//////// create another class here /////////

class BBB extends AAA{
	public void add2() {
		int c =20;
		System.out.println(c);
	}
	
}
