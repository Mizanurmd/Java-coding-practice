package StringDetails;

public class StringTest {
	public static void main(String[] args) {
		String st = "   Java coding is    very easy.   ";
		String st2 = st.format(" Language : %s", st);
		System.out.println("Using Length method = "+ st.length());
		System.out.println("Using char method : "+ st.charAt(23));
		System.out.println("Using format method : "+ st2);
		System.out.println("Using subString method : "+ st.substring(4));
		if(st.contains("J")) {
			System.out.println("Using conatins method: "+ st);
		}else {
			System.out.println("Contains char is not found in String");
		}
		
		System.out.println("Using concat method : "+ st.concat(st2));
		System.out.println("Using replace method : "+st.replace("Java", "Python"));
		System.out.println("Using replace method2 : "+ st.replace(" ", ""));
		System.out.println("Using lowerCase mehtod : "+ st.toLowerCase());
		System.out.println("Using upperCase method : "+ st.toUpperCase());
		System.out.println("Using trim method : "+ st.trim());
		
		 int a = 120;
		
		System.out.println("Using valueOf method : "+ String.valueOf(a));
		System.out.println("=========Using split method ============ ");
		
		String[]b = st.split(" ");
		for(String tem :b) {
			System.out.print(tem+" ");
		}
		
		
	}

}
