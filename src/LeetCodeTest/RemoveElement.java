package LeetCodeTest;

import java.util.Arrays;

public class RemoveElement {
public static void main(String[] args) {
	 Solution solution = new Solution();

     // Example array
     int[] nums = {3, 2, 2, 3};
     System.out.println(nums.length);
     int val = 3;

     // Call the removeElement method
     int newLength = removeElement(nums, val);

     // Print the modified array and its new length
     System.out.println("Modified Array: " + Arrays.toString(nums));
     System.out.println("New Length: " + newLength);
}
public  static int removeElement(int[] nums, int val) {
    int i = 0; // Pointer for the current index

    // Iterate through the array
    for (int j = 0; j < nums.length; j++) {
        // If the current element is not equal to the specified value
        if (nums[j] != val) {
            // Update the array in-place by copying the non-matching element to the current index
            nums[i] = nums[j];
            // Move the pointer to the next index
            i++;
        }
    }

    // The value of 'i' represents the new length of the modified array
    return i;
}

}
