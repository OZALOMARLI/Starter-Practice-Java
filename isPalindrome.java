//Program of prints whether the entered word is a palindrome or not;
import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        // Check if it is a palindrome
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        scanner.close();
    }

    // Method to check if the string is a palindrome
    public static boolean isPalindrome(String str) {
        // Reverse the string
        String reversed = new StringBuilder(str).reverse().toString();
        // Compare the original string with the reversed string
        return str.equals(reversed);
    }
}
