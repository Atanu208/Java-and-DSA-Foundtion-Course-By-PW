public class InsertaCharacterIntoCertainPosition {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int[] chars={2,4,7};
        StringBuilder strb=new StringBuilder();
        int j=0;
        for (int i = 0; i < str.length(); i++) {
            if(j<chars.length && i==chars[j])
            {
                strb.append("*");
                j++;
            }
            strb.append(str.charAt(i));
        }   
        String resString=strb.toString();
        System.out.println(resString);
    }
}
