package CodingExam;

public class HighestSecondhighestNumbner {
	public static void main(String[]args) {
		int[] num = { 100, 14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
		
		int hig =0, secHi =0;
		for(int i =0; i <num.length; i++) {
			if(num[i] > hig) {
				secHi = hig;
				hig = num[i];
			}else if(num[i] > secHi) {
				secHi = num[i];
			}
			
		}
		System.out.println("Higest Number is = "+ hig);
		System.out.println("Second Highest Number is = "+ secHi);
		
	}

}
