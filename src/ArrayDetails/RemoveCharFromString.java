package ArrayDetails;

public class RemoveCharFromString {
	public static void main(String[] args) {
		String st = "CloudteCh";
		//String st1= st.replace("C", "");
		//System.out.println(st1);
		
		removeString(st, 'C');
	}
	
	// create a method for removing C from String
	public static void removeString(String st, char ch) {
		
		String fSt ="";
		
		for(int i =0; i <st.length(); i++) {
			if(st.charAt(i) != ch) {
				fSt = fSt + st.charAt(i);
			}
		}
		System.out.println("Finla String : "+ fSt);
		
	}

}
