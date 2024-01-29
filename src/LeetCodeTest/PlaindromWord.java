package LeetCodeTest;

public class PlaindromWord {
	public static void main(String[] args) {
		 Solution solution = new Solution();

	        // Example strings
	        String palindromeString = "A man, a plan, a canal, Panama";
	        String nonPalindromeString = "Hello, World!";

	        // Call the isPalindrome method
	        boolean isPalindrome1 = isPalindrome(palindromeString);
	        boolean isPalindrome2 = isPalindrome(nonPalindromeString);

	        // Print the results
	        System.out.println("\"" + palindromeString + "\" is a palindrome: " + isPalindrome1);
	        System.out.println("\"" + nonPalindromeString + "\" is a palindrome: " + isPalindrome2);
	}

	public static boolean isPalindrome(String s) {
        // Convert the string to lowercase and remove non-alphanumeric characters
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Use two pointers to check if the cleaned string is a palindrome
        int left = 0;
        int right = cleanedString.length() - 1;

        while (left < right) {
            if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
                return false; // Characters don't match, not a palindrome
            }
            left++;
            right--;
        }

        return true; // All characters matched, it is a palindrome
	
	}
	
}
