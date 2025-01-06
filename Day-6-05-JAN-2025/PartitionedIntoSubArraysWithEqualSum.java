public class PartitionedIntoSubArraysWithEqualSum {
    public static boolean subArraysWithEqualSum(int[] arr)
    {
        int sum=0;
        for (int i = 1; i <arr.length ; i++) {
            arr[i]=arr[i]+arr[i-1];
        }
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==arr[arr.length-1]-arr[i])
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={5,3,2,6,3,1};
        System.out.println(subArraysWithEqualSum(arr));
    }
}
