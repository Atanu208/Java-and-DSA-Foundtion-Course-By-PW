public class PrefixOrRunningSum {
    public static void prefixSum(int[] arr)
    {
        for (int i = 1; i <arr.length ; i++) {
            arr[i]=arr[i-1] + arr[i];
        }
    }
    public static void main(String[] args) {
        int[] arr={5,7,4,1,2,7,9};
        prefixSum(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
