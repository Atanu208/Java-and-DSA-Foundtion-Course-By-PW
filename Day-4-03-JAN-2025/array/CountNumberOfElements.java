package array;

import java.util.Scanner;

public class CountNumberOfElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements one by one : ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter an element that you want to count : ");
        int number=sc.nextInt();
        int count=0;
        for(int i=0;i<size;i++)
        {
            if(arr[i]>number)
            {
                count++;
            }
        }
        System.out.println("Count : "+count);
    }
}
