package CodingExampStreamApi;



public class DigitNumberSequence {

	public static void main(String[] args) {

	Runnable letterTask = new Runnable() {
		
		@Override
		public void run() {

			for(char c ='A'; c<='Z'; c++) {
				System.out.print(c+" ");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	};
	
Runnable numberTask = new Runnable() {
		
		@Override
		public void run() {

			for(int i =1; i<=26; i++) {
				System.out.print(i+" ");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	};
	
	Thread t1 = new Thread(letterTask);
	Thread t2 = new Thread(numberTask);
	
	t1.start();
	t2.start();
	
	
	

	}

}
