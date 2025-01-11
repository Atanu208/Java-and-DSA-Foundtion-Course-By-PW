public class SuffixMaximumArray {
    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 7, 2};
        int[] suffixMax=new int[nums.length];
        int rightOfNums=nums.length-2;//3/2/1
        suffixMax[suffixMax.length-1]=nums[nums.length-1];//suffixMax=[7, 7, 7, 7, 2]
        for (int i = suffixMax.length-1; i>0 ; i--) {
            if(nums[rightOfNums]>suffixMax[i])
            {
                suffixMax[i-1]=nums[rightOfNums];
            }else{
                suffixMax[i-1]=suffixMax[i];
            }
            rightOfNums--;
        }
        for (int i:suffixMax) {
            System.out.print(i+" ");
        }
    }
}
