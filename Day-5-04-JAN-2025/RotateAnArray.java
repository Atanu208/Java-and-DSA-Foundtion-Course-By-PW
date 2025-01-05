public class RotateAnArray {
    public static void reverse(int[] arr,int start,int end)
    {
        while (start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr={21,16,34,61,24};
//        int[] arr={34,61,24,21,16};
        int kth=3;
        kth=kth%arr.length;
        reverse(arr,0, arr.length-kth-1);
        reverse(arr,arr.length-kth,arr.length-1);
        reverse(arr,0,arr.length-1);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
