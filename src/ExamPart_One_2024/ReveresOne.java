package ExamPart_One_2024;

public class ReveresOne {
	public static void main(String[] args) {
		String st = "Java is very easy learning Language";
		String[]stt =st.split(" ");
		for(int i =stt.length-1; i>=0;i--) {
			System.out.print(stt[i]+" ");
		}
		
	}

}
