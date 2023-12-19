package ArrayDetails;

public class IntegerReverse {
	public static void main(String[] args) {
		int number = 1234;
		int reve;
	StringBuilder st = new StringBuilder(String.valueOf(number));
	reve = Integer.valueOf(st.reverse().toString());
	System.out.println("Integer Number is reverse : "+ reve);
	}

}
