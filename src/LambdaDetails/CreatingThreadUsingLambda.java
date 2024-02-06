package LambdaDetails;

public class CreatingThreadUsingLambda {
	public static void main(String[] args) {

		// Normal Thread created here

		Runnable t1 = new Runnable() {
			@Override
			public void run() {

				for (int i = 0; i <= 10; i++) {
					System.out.println();
					System.out.print(i+",");
					
				}

			}
		};
		Thread tt = new Thread(t1);
		tt.start();
		try {
			tt.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Create a thread using  Lambda
		
		Runnable r1 =()->{
			for (int i = 0; i <= 10; i++) {
				System.out.print(i+",");
			};
		};
		Thread tr = new Thread(r1);
		tr.start();
	

	}

}
