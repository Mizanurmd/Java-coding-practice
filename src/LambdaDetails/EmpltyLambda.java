package LambdaDetails;

public class EmpltyLambda {
	public static void main(String[] args) {
		
		Drawing d2 =(w)->{
			System.out.println("Width :: "+w);
		};
		d2.draw(200);
		d2.draw(500);
		d2.draw(1000);
	}

}
