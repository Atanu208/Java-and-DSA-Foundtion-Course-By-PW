package array;

import java.util.Arrays;

public class KthSmallest {
    public static void ascendingOrder(int[] arr,int kth)
    {
        Arrays.sort(arr);
//        12 15 18 24 35 42
        System.out.println(arr[kth-1]);
    }
    public static void main(String[] args) {
        int[] arr={12,42,15,35,18,24};
        ascendingOrder(arr,6);
    }
}
