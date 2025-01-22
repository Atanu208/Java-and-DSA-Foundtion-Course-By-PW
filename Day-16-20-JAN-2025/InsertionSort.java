public class InsertionSort {
    public static void insertionSort(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            int key=arr[i]; // 26 // 21 //7
            int j=i-1;// 0 //1=>0//2
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key; //
        }
    }
    public static void main(String[] args) {
        int[] arr={12,26,21,7,29};
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
