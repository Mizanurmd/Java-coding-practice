package CharacterDetails;

public class HasToCharValue {
	public static void main(String[] args) {
		System.out.println("==========Capital Letters (A-Z) ASCII Value===============");
		for(char i ='A'; i<='Z'; i++) {
			System.out.print(i+" = "+(int)i+",");
		}
		System.out.println("\n==========Small Letters (a-z) ASCII Value===============");
		for(char i ='a'; i<='z'; i++) {
			System.out.print(i+" = "+(int)i+",");
		}
		
	}

}
