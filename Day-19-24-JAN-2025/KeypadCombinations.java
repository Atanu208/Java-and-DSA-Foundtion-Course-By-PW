public class KeypadCombinations {
    static void keypadCombinations(String str,String[] key,String res)
    {
        if(str.length()==0)
        {
            System.out.println(res);
            return;
        }
        int digit=str.charAt(0)-'0';
        String code=key[digit];
        for(int i=0;i<code.length();i++)
        {
            keypadCombinations(str.substring(1), key, res+code.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str="23";
        String[] key={" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        keypadCombinations(str,key,"");
    }
}