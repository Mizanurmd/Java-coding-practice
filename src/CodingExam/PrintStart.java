package CodingExam;

public class PrintStart {
public static void main(String[]args) {
	
	int n = 5;
	
	for(int i =1; i<=n; i++) {
		for(int j =1; j <=i; j++) {
			System.out.print(i);
		}
		System.out.println();
	}
	
	System.out.println("=============Oposite print start====================");
	
	for(int i =1; i<=n; i++) {
		for(int j =i; j <=n; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	
System.out.println("=============Oposite print start====================");
	
	for(int i =1; i<=n; i++) {
		for(int j =i; j <=n; j++) {
			System.out.print(" ");
		}
		for(int j =1; j <=i; j++) {
			System.out.print("*");
		}
		
		System.out.println();
	}
System.out.println("=============Oposite print start====================");
	
	for(int i =1; i<=n; i++) {
		for(int j =i; j <=n; j++) {
			System.out.print("*");
		}
		for(int j =1; j <=i; j++) {
			System.out.print(" ");
		}
		System.out.println();
	}
	
	
}
}
