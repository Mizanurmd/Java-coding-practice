package LeadingExam_1;

import java.util.HashMap;
import java.util.Map;

public class ArrayTest {
	 public static void main(String[]args){
		 int[] nums = {2, 7, 11, 15};
		 int target = 18;
		 int[] result = twoSum(nums, target);
		 System.out.println(result[0] + " " + result[1]);  
		 // Output will be "0 1" because nums[0] + nums[1] = 2 + 7 = 9
		
	    
	 }
		// Example usage:



	 public static int[] twoSum(int[] nums, int target) {
	     Map<Integer, Integer> numMap = new HashMap<>();
	     
	     for (int i = 0; i < nums.length; i++) {
	         int complement = target - nums[i];
	         
	         // Check if the complement is already in the map
	         if (numMap.containsKey(complement)) {
	             // Return the indices of the two numbers
	             return new int[] {numMap.get(complement), i};
	         }
	         
	         // If the complement is not in the map, store the current number and its index
	         numMap.put(nums[i], i);
	     }
	     
	     // If no solution is found, return an empty array
	     return new int[0];
	 }

	 // Example usage:
	 








	 


}
