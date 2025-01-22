public class ReverseOfaString {
    public static String reverseOfaString(String str,int index)
    {
        StringBuilder stbr=new StringBuilder("");
        if(str.length()==index)
        {
            return stbr.toString();
        }
        String result=reverseOfaString(str, index+1);
        stbr.append(result);
        stbr.append(str.charAt(index));
        return stbr.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseOfaString("atanu", 0));
    }
}
