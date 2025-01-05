import java.util.Scanner;

public class ChekIfNumberIsPresent {
    public static void main(String[] args) {
        int[] arr={21,16,34,61,24};
        Scanner sc=new Scanner(System.in);

        int[] freqArray=new int[(int)Math.pow(10,5)];
        for (int i = 0; i <arr.length ; i++) {
            freqArray[arr[i]]++;
        }
        System.out.println("How many time you want to search : ");
        int count=sc.nextInt();
        for (int i = 0; i <count ; i++) {
            System.out.println("Enter the value that you want to search in to the array : ");
            int item=sc.nextInt();
            if(freqArray[item]>0) System.out.println("Yes");
            else System.out.println("No");
        }

    }
}
