package HackerRank_2024;

import java.util.Scanner;

public class HackerRankTest_01 {

	public static void main(String[] args) {
		 /* Enter your code here. Read input from STDIN.
		  *  Print output to STDOUT. Your class should be named Solution. */

		Scanner sc = new Scanner(System.in);
		int lineNumber= 1;
		
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(lineNumber +" "+ line);
			lineNumber++;
		}
		sc.close();
		
		
	}

}
