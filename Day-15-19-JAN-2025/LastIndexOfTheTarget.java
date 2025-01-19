public class LastIndexOfTheTarget {
    public static int lastIndexOfTheTarget(int[] arr,int i,int target)
    {
        if(i==-1)
        {
            return -1;
        }
        if(arr[i]==target)
        {
            return i;
        }
        return lastIndexOfTheTarget(arr,i-1,target);
    }
    public static void main(String[] args) {
        int[] arr={12,42,24,42,78,34,19,34};
        System.out.println(lastIndexOfTheTarget(arr,arr.length-1,24));
    }
}
