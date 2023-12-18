package ArrayDetails;

public class ExamTest2 {
	public static void main(String[] args) {
		// print 1 to 100 without loop
		String st = 1 + 2 + "ONE" + 1 + 2 + "TWO";
		System.out.println(st);
		printNumber(1);
	}

	public static void printNumber(int x) {
		if (x <= 100) {
			System.out.println(x);
			printNumber(x + 1);
		}

	}

}
