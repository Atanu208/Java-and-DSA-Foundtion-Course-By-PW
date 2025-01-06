public class SuffixSum {
    public static void main(String[] args) {
        int[] arr={2,5,6,1,3};
        for (int i = arr.length-2; i>=0 ; i--) {
            arr[i] = arr[i]+arr[i+1];
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] +" ");
        };
    }
}
