public class PrintSumOfAllSubset {
    static void printSubset(int[] arr,int index,int sum)
    {
        if(arr.length==index)
        {
            System.out.print(sum+" ");
            return;
        }
        printSubset(arr, index+1,sum+arr[index]);
        printSubset(arr, index+1, sum);
    }
    public static void main(String[] args) {
        int[] arr={2,4,5};
        printSubset(arr, 0, 0);
    }
}
