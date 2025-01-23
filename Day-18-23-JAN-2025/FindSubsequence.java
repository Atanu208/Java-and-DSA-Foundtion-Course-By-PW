import java.util.ArrayList;

public class FindSubsequence {
        static ArrayList<String> findSubsequence(String str) {
            ArrayList<String> ans=new ArrayList<>();
            if(str.length()==0)
            {
                ans.add("");
                return ans;
            }
            char curr=str.charAt(0);
            ArrayList<String> res=findSubsequence(str.substring(1));
            for (String character : res) {
                ans.add(character);
                ans.add(curr+character);
            }
            return ans;
        }
    public static void main(String[] args) {
        String str="abc";
        System.out.println(findSubsequence(str));
    }
}

