public class ReverseAString {
    public static String revString(String name)
    {
        StringBuilder stbr=new StringBuilder(name);
        // for(int i=name.length()-1;i>=0;i--)
        // {
        //     stbr.append(name.charAt(i));
        // }
        return stbr.reverse().toString();
    }
    public static void main(String[] args) {
        String name="Atanu";
        System.out.println(revString(name));
    }
}
