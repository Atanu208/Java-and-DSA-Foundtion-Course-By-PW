public class SquareOfNonDecreasingOrder {
    public static void DecreasingOrder(int[] arr)
    {
        int[] newArray=new int[arr.length];
        int left=0;
        int right=arr.length-1;
        int i=0;
        while (left<=right)
        {
            int leftItem=Math.abs(arr[left]);
            int rightItem=Math.abs(arr[right]);
            leftItem *=leftItem;
            rightItem *=rightItem;

            if(leftItem>rightItem)
            {
                newArray[i]=leftItem;
                i++;
                left++;
            }
            else {
                newArray[i]=rightItem;
                i++;
                right--;
            }
        }
        for (int j=newArray.length-1,k=0; j>=0  ; j--,k++) {
            arr[k]=newArray[j];
        }
    }

    public static void main(String[] args) {
        int[] arr={-10,-3,-2,1,4,5};
        DecreasingOrder(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
