package array;

import java.util.Scanner;

public class ArrayIsSortedOrNot {
    public static boolean checkSortedArray(int[] arr)
    {
        int cheack=0;
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i]<=arr[i+1]) cheack++;
            else return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={10,20,30,50,70};
        boolean cheack=false;
        boolean res=checkSortedArray(arr);
        System.out.println(res);
    }
}
