package CodingExam;

public class LinearSerchAlgorithom {
	public static void main(String[]args) {
		
		int []nums = {10,20,30,4,0,1,6,40,80,300,70,100};
		 int searchNumber = 80;
		 /// time complexity = 0(N)
		 /// space complexity = 0(1)
		 
		 for(int i =0; i < nums.length; i++) {
			 if(nums[i] == searchNumber) {
				 System.out.println("Item index is = "+ i +" Value is = "+ nums[i]);
				 return;
			 }
		 }
		 System.out.println("Item is not founded.");
		
		
	}

}
