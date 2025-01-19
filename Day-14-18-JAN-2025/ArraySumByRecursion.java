public class ArraySumByRecursion {
    public static int sumArray(int[] arr,int i)
    {
        if(i==arr.length-1)
        {
            return arr[i];
        }
        return arr[i++]+ sumArray(arr,i);
    }
    public static void main(String[] args) {
        int[] arr={12};
        System.out.println(sumArray(arr,0));
    }
}
