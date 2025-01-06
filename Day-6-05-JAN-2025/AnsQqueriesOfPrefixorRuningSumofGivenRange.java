import java.util.Scanner;

public class AnsQqueriesOfPrefixorRuningSumofGivenRange {
    public static void main(String[] args) {
        int[] arr={2,5,8,9,5,3};
        for (int i = 1; i <arr.length ; i++) {
            arr[i]=arr[i-1]+arr[i];
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("How many queries you have : ");
        int number=sc.nextInt();
        for (int i = 0; i <number ; i++) {
            System.out.println("Enter the value of l: ");
            int l=sc.nextInt();
            System.out.println("Enter the value of r: ");
            int r=sc.nextInt();
            int item =0;
            if(l==1) item=0;
            else item=arr[l-2];
            System.out.println(arr[r-1]-item);
        }
    }
}
