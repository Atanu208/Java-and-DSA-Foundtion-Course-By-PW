public class MoveAllNegativeElements {
    public static void main(String[] args) {
        int[] arr={0, -1, -13, 5, 6, -7, -5 };
        int left=0;//1//2//3//4
        int right=arr.length-1;//8//7//6
        while(left<right)
        {
            if(arr[left]>=0 && arr[right]<=0)
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            if(arr[left]<0)
            {
                left++;
            }
            if(arr[right]>0)
            {
                right--;
            }
        }

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        };
    }
}
