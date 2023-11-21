package StringDetails;

public class StringRevese {
	public static void main(String[] args) {
		String st = "NOO7N$#";
		
	char[]c = st.toCharArray();
	String s ="";
	for(int i =c.length-1; i>=0; i--) {
		if(!Character.isLetter(c[i])) {
			s = s +c[i];
		}
	}
		System.out.println(s);
		
		
		
	}
	

}
