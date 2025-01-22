public class CheckPalindrome {
    public static boolean checkPalindrome(String str){
        return str.equals(reverseString(str,0));
    }
    static String reverseString(String str,int index)
    {
        StringBuilder stbr=new StringBuilder("");
        if(str.length()==index)
        {
            return stbr.toString();
        }
        String result=reverseString(str, index+1);
        stbr.append(result);
        stbr.append(str.charAt(index));
        return stbr.toString();
    }

    public static void main(String[] args) {
        String str="madam";
        System.out.println(checkPalindrome(str));
    }
}
