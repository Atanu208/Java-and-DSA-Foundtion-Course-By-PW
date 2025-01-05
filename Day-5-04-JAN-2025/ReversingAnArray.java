public class ReversingAnArray {
    public static void swap(int[] arr,int i ,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr={12,45,16,51,24,48};
        int lastIndex=arr.length-1;
        int i=0;
        int j=arr.length-1;
        while (i<j)
        {
            swap(arr,i,j);
            i++;
            j--;
        }
//        for (int i = 0; i <arr.length/2 ; i++) {
//            int temp=arr[i];
//            arr[i]=arr[lastIndex];
//            arr[lastIndex]=temp;
//            lastIndex--;
//        }
        System.out.println("After reversing the value would be : ");
        for (int k = 0; k <arr.length ; k++) {
            System.out.print(arr[k]+" ");
        }
    }
}
