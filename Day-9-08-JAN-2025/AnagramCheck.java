import java.util.Scanner;

public class AnagramCheck {

    public static boolean validAnagram(String s, String t) {
        // If lengths are not equal, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Create an array to store the frequency of characters
        int[] charCounts = new int[26]; // For lowercase letters 'a' to 'z'

        // Process the first string
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++; // Increment for s
            charCounts[t.charAt(i) - 'a']--; // Decrement for t
        }

        // Check if all counts are zero
        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }

        return true; // If all counts are zero, they are anagrams
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input strings
        System.out.println("Enter the first string:");
        String s = scanner.nextLine();

        System.out.println("Enter the second string:");
        String t = scanner.nextLine();

        // Check if the strings are anagrams and print the result
        if (validAnagram(s, t)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        scanner.close();
    }
}
