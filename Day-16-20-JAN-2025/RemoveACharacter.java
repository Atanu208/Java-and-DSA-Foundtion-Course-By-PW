public class RemoveACharacter {
    public static String removeCharacter(String str,int pos)
    {
        StringBuilder stbr=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(i!=pos)
            {
                stbr.append(str.charAt(i));
            }
        }
        return stbr.toString();
    }
    public static void main(String[] args) {
        String value="KeyVauePair";
        char ch='K';
        System.out.println(value.replace(String.valueOf(ch),""));
    }

}
