public class ReverseWords {
    public static void main(String[] args) {
        String s = " i like this program very much ";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        // Trim leading and trailing spaces
        s = s.trim();

        // Split the string by one or more spaces
        String[] words = s.split("\\s+");

        // Reverse the array of words
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }
}
