package LeetCodeTest;

class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();

        // Example arrays
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        // Call the merge method
        solution.merge(nums1, m, nums2, n);

        // Print the merged array
        System.out.print("Merged Array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
				
	}
    public  void merge(int[] nums1, int m, int[] nums2, int n) {
        // Initialize pointers for nums1 and nums2
        int i = m - 1;
        int j = n - 1;

        // Initialize pointer for the merged array (nums1)
        int k = m + n - 1;

        // Merge arrays in reverse order
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If there are remaining elements in nums2, copy them to nums1
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}