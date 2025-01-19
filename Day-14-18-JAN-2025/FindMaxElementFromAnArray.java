public class FindMaxElementFromAnArray {
    public static int findMax(int[] arr,int i)
    {
        if(i==arr.length-1)
        {
            return arr[i];
        }
        int itr=findMax(arr,i+1);
        return Math.max(arr[i],itr);
    }
    public static void main(String[] args) {
        int[] arr={12,43,25,29,40,83};
        System.out.println(findMax(arr,0));
    }
}
