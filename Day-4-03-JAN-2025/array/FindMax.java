package array;

import java.util.Arrays;

public class FindMax {
    public static void main(String[] args) {
        int[] arr={1,14,7,10};
        int[] shallowCopyArray=arr; // creation of shallow copy
        int[] deepCopyArray1=arr.clone(); // creation of deep copy
        int[] deepCopyArray2= Arrays.copyOf(arr,arr.length); // creation of deep copy
          int[] deepCopyArray3=Arrays.copyOfRange(arr,0,arr.length);
//        int max=arr[0];
//        for (int i = 1; i <arr.length ; i++) {
//            if(max<arr[i]) max=arr[i];
//        }
        for (int i = 0; i <deepCopyArray1.length ; i++) {
            System.out.print(deepCopyArray1[i] +" ");
        }
        for (int i = 0; i <deepCopyArray2.length ; i++) {
            System.out.print(deepCopyArray2[i] +" ");
        }
        for (int i = 0; i <deepCopyArray3.length ; i++) {
            System.out.print(deepCopyArray3[i] +" ");
        }
    }
}
