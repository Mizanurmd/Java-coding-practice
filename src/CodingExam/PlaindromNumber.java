package CodingExam;

public class PlaindromNumber {

	public static void main(String[] args) {
		
		String st ="NOON", rev="";
		int len = st.length();
		
		for(int i = len -1; i >= 0; i --) {
			rev = rev + st.charAt(i);
		}
		System.out.println("\n Reverse is = "+ rev);
		
		if(st.equals(rev)) {
			System.out.println("Plaindrom");
		}else {
			System.out.println("Not Plaindrom");
		}
	}

}
