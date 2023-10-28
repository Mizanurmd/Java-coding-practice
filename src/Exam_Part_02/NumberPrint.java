package Exam_Part_02;

public class NumberPrint {
	static int x;
	static public void main(String[] args) {
		x =10;
		x = 20;
		System.out.println(x);
		
		for(int i =10; i < 100; i++) {
		
			if(i > 50) {
				if(i%3 ==0) {
					System.out.print(i+" ");
				}
			}
			
		}
		
	}

}
