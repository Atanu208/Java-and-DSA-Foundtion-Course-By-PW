package array;

import java.util.Scanner;

public class FindLastOccurrenceOfAnElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter a number that you want to get the last occurrence index : ");
        int number=sc.nextInt();
        int index=-1;
        for(int i=0;i<size;i++)
        {
            if(arr[i]==number) index=i;
        }
        System.out.println("Last occurrence of the "+number+" is at index "+index);
    }
}
