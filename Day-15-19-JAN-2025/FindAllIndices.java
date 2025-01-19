import java.util.ArrayList;

public class FindAllIndices {
    public static ArrayList<Integer> findAllIndices(int[] arr,int index,int target)
    {
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length)
        {
            return list;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
        ArrayList<Integer> ans=findAllIndices(arr,index+1,target);
        list.addAll(ans);
        return list;
    }
    public static void main(String[] args) {
        int[] arr={31,24,31,61,26,31,81};
        System.out.println(findAllIndices(arr,0,31));
    }
}
