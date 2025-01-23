class PrintSubSequence {
    static void printSubSequence(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans+" ");
            return;
        }
        char current = str.charAt(0);
        printSubSequence(str.substring(1), ans + current);
        printSubSequence(str.substring(1), ans);
    }

    public static void main(String[] args) {
        String str = "abc";
        printSubSequence(str, "");
    }
}