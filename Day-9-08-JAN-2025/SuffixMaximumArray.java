public class SuffixMaximumArray {
    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 7, 2};
        int[] suffixMax=new int[nums.length];

        suffixMax[suffixMax.length-1]=nums[nums.length-1];//suffixMax=[7, 7, 7, 7, 2]
        for (int i = nums.length-2; i>=0 ; i--) {
            suffixMax[i]= nums[i]>suffixMax[i+1] ? nums[i] : suffixMax[i+1];
        }
        for (int i:suffixMax) {
            System.out.print(i+" ");
        }
    }
}
