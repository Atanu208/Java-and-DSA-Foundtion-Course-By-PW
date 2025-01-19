public class LinearSearch {
    public static int linearSearch(int[] arr,int index,int target)
    {
        if(index==arr.length)
        {
            return -1;
        }
        if(arr[index]==target)
        {
            return index;
        }
        return linearSearch(arr,index+1,target);
    }
    public static void main(String[] args) {
        int[] arr={12,42,34,16,49,27};
        System.out.println(linearSearch(arr,0,1));
    }
}
