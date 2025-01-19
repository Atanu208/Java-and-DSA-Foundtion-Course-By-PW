public class PrintArrayRecursively {
    public static void printArray(int[] arr,int i)
    {
        if(arr.length==i)
            return;
        System.out.print(arr[i++]+" ");
        printArray(arr,i);
    }
    public static void main(String[] args) {
        int[] arr={12,42,61,61,14,37};
        printArray(arr,0);
    }
}
