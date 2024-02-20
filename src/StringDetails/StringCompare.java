package StringDetails;

public class StringCompare {
	public static void main(String[] args) {
		
		String s ="Welcome to String";
		System.out.println(s);
		System.out.println(s.charAt(1));
		System.out.println();
		String st ="Learning";
		String st2 = new String("learning");
		String st3 = new String("Java tutorial");
		System.out.println(st.compareToIgnoreCase(st2));
		System.out.println(st.compareTo(st2));
		System.out.println(st.compareTo(st3));
		
		
	}

}
