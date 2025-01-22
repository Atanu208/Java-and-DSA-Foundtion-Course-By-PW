public class SearchACharacter {
    public static void main(String[] args) {
        String str="Name";
        char ch='a';
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==ch)
            {
                System.out.println("True");
                return;
            }
        }
    }
}
