public class FindSecondMaximum {
    public static int findMax(int[] arr)
    {
        int max=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(max<arr[i]) max=arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={-2,0,-1,-1,-9,-14,-12,-4};
        int max=findMax(arr);
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==max) arr[i]=Integer.MIN_VALUE;
        }
        max=findMax(arr);
        System.out.println(max);
    }
}
