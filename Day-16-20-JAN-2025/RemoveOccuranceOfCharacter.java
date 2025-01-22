public class RemoveOccuranceOfCharacter { 
    public static void main(String[] args) {
        String str="nameingVula";
        char ch='a';
        str.replace(String.valueOf(ch), "");
        System.out.println(str.replace(String.valueOf(ch), ""));
    }
}
