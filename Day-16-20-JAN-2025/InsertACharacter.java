
import java.util.*;
public class InsertACharacter {
    public static String insertACharater(String str,char val,int pos)
    {
        StringBuilder stbr=new StringBuilder(str);
        stbr.insert(pos,val);
        return stbr.toString();
    }
    public static void main(String[] args) {
        System.out.println(insertACharater("HelloWorld", ' ', 5));
    }
}
