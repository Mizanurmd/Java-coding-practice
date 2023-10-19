package StringDetails;

public class StringBuilderTest {
	public static void main(String[]args) {
		StringBuilder sb = new StringBuilder("Mizanur");
		System.out.println(sb);
		sb.insert(0, 'S');
		System.out.println(sb);
		sb.setCharAt(3, '@');
		System.out.println(sb);
		sb.delete(3, 4);
		System.out.println(sb);
		sb.append('R');
		sb.append('a');
		sb.append('h');
		sb.append('m');
		sb.append('a');
		sb.append('n');
		
		System.out.println(sb);
	}

}
