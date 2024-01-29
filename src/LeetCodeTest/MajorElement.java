package LeetCodeTest;

public class MajorElement {
	public static void main(String[] args) {
		 // Example array
        int[] nums = {3, 3, 4,2,2,2, 2, 4, 4, 2, 4, 4};

        // Call the majorityElement method
        int majorityElement = majorityElement(nums);

        // Print the majority element
        System.out.println("Majority Element: " + majorityElement);
	}
	
	 public static int majorityElement(int[] nums) {
	        int candidate = 0;
	        int count = 0;

	        // Moore's Voting Algorithm
	        for (int num : nums) {
	            if (count == 0) {
	                candidate = num;
	            }

	            count += (num == candidate) ? 1 : -1;
	        }

	        return candidate;
	    }
	

}
