import java.util.HashMap;
import java.util.PriorityQueue;

public class TwoSumClosestProblem {
    public static void twoSumClosestProblem(int[] arr,int target)
    {
        HashMap<Integer,Integer> hashMap=new HashMap<>();

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                int sum=arr[i]+arr[j];
                if(sum<target)
                {
                    hashMap.put(arr[i],arr[j]);
                }
            }
        }
        System.out.println(hashMap);
    }
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5};
        twoSumClosestProblem(arr,7);
    }
}
