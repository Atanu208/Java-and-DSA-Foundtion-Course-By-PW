import java.util.*;
public class Stringsbasics {
    public static void main(String[] args) {
        String str1="Molkata";
        String str2="Kolkata";
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.concat(str2));
        System.out.println(str1);
        String concatString=str1.concat(str2);
        System.out.println(concatString);
        str1 =str1+"xyz";
        System.out.println("ihu"+(12/58));
        // sub string : continues part of the string 
        System.out.println(str1.substring(0,0));
        System.out.println("Sub string : "+str1.substring(0));
    }
}