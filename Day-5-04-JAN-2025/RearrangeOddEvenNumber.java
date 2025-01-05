public class RearrangeOddEvenNumber {
    public static void twoPointerApproach(int[] arr)
    {
        int left=0;
        int right=arr.length-1;
        while (left<right)
        {
            if(arr[left]%2!=0 && arr[right]%2==0)
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            if(arr[left]%2==0) left++;
            if(arr[right]%2!=0) right--;
        }
    }
    public static void main(String[] args) {
        int[] arr={11,12,16,21,30,18,16,7};
        twoPointerApproach(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
