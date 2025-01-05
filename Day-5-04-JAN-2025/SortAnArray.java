public class SortAnArray {
    public static void twoPointerTechnique(int[] arr) // {0,0,0,1,1,1,1};
    {
        int left=0; // 0//1/2
        int right=arr.length-1; // 6/5/4/3
        while (left<right)
        {
            if(arr[left]==1 && arr[right]==0)
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            if (arr[left]==0) {
                left++;
            }
            if (arr[right]==1) {
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,1,0,0,1,0,1};
//        int zeroCount=0;
//        for (int i = 0; i <arr.length ; i++) {
//            if(arr[i]==0) zeroCount++;
//        }
//        for (int i = 0; i <arr.length ; i++) {
//            if(i<zeroCount) arr[i]=0;
//            else arr[i]=1;
//        }
        twoPointerTechnique(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
