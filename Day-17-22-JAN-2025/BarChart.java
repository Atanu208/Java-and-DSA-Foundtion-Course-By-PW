public class BarChart {
    static int max(int[] arr)
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr={3, 1, 0, 7, 5};
        int maxElement = max(arr);
        for (int i = maxElement; i >= 1; i--) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
