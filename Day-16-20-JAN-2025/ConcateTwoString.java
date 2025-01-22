public class ConcateTwoString {
    public static void main(String[] args) {
        String str1="name1";
        String str2="name2";
        StringBuilder stb=new StringBuilder(str1);
        stb.append(str2);
        System.out.println(stb);
    }
}
