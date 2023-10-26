package CodingExam;

public class LinearSerchAlgorithom {
	public static void main(String[]args) {
		
		int []nums = {10,20,30,4,0,1,6,40,80,300,70,100};
		 int searchNumber = 80;
		 
		 int left =0, right =nums.length-1, mid;
		 
		 
		 while(left < right) {
			 mid = (left +right)/2;
			 if(nums[mid]==searchNumber) {
				 System.out.println("Number is founded. Index = "+ mid);
				 return;
			 }else if(nums[mid] < searchNumber) {
				 left = mid +1;
			 }else {
				 right = mid -1;
			 }
			
			 
		 }
		 
		
		
	}

}
