package LeetCodeTest;

import java.util.Arrays;

public class RemoveDuplicate {
	public static void main(String[] args) {
		 int[] nums = {1, 1, 2, 2, 3, 4, 4, 4, 5};

	        // Call the removeDuplicates method
	        int newLength = removeDuplicates(nums);

	        // Print the modified array and its new length
	        System.out.println("Modified Array: " + Arrays.toString(nums));
	        System.out.println("New Length: " + newLength);
	}
	 public static int removeDuplicates(int[] nums) {
	        if (nums.length == 0) {
	            return 0; // If the array is empty, no duplicates to remove
	        }

	        int i = 0; // Pointer for the current index

	        // Iterate through the array
	        for (int j = 1; j < nums.length; j++) {
	            // If the current element is different from the previous one
	            if (nums[j] != nums[i]) {
	                // Update the array in-place by copying the non-duplicate element to the next index
	                i++;
	                nums[i] = nums[j];
	            }
	        }

	        // The value of 'i' represents the new length of the modified array without duplicates
	        return i + 1;
	    }
	
}
