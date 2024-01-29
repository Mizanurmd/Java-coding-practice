package Exampart_03;

public class RecusionMethod {
	public static void main(String[] args) {
		System.out.println("Sum of Recusion :"+ recusionFuntion(10));
	}

	public static int recusionFuntion(int n) {
		if(n >0) {
			return n + recusionFuntion(n -1);
		}else {
			return 0;
		}
	}
}
