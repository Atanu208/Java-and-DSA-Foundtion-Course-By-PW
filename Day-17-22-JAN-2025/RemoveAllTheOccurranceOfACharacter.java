public class RemoveAllTheOccurranceOfACharacter {
    public static String removeAllTheOccurranceOfACharacter(String str,char chr)
    {
        String res="";
        if(str.isEmpty())
        {
            return res;
        }
        if(str.charAt(0)!=chr)
        {
            res +=String.valueOf(str.charAt(0));
        }
        String result=removeAllTheOccurranceOfACharacter(str.substring(1),chr);
        res +=result;
        return res;
    }
    public static void main(String[] args) {
    String str="eeeeeeeeeeeeeeeee";
    System.out.println(removeAllTheOccurranceOfACharacter(str, 'e'));
}
}