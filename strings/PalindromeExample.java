public class PalindromeExample {
    public static void main(String[] args) {
        String str = "madam"; // Try changing this
        String reversed = ""; 

        // Build the reversed version of the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        //test8
        // Check if original and reversed strings are the same
        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is NOT a palindrome.");
        }
    }
}

