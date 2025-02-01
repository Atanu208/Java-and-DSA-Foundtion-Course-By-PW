public class MoveAll0sToEnd {
 public static void main(String[] args) {
    int[] arr={0,3,0,0,6,0,7,9,0,4,0,1};
    // {3,0,0,6,0,0,7,9,0,4,0,1};
    for (int i = 0; i < arr.length-1; i++) {
        for (int j = 0; j < arr.length-i-1; j++) {
            if(arr[j]==0 && arr[j+1] !=0)
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    for (int i : arr) {
        System.out.print(i+" ");
    }
 }   
}
