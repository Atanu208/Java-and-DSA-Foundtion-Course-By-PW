public class FindSecondMinimum {
    public static int findMinimum(int[] arr)
    {
        int min=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr={-1,0,-3,-2,-2,-4,-5};
        int min=findMinimum(arr);
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==min) arr[i]=Integer.MAX_VALUE;
        }
        int secondMinimum=findMinimum(arr);
        System.out.println(secondMinimum);
    }
}
