//        12121212
//        12121212
//        12121212
//        12121212
//        12121212
//        12121212

import java.util.Scanner;
public class NumberPattern_Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of row : ");
        int row=sc.nextInt();
        int first=1;
        int second=2;
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <row+2 ; j++) {
                System.out.print(first);
                int temp=first;
                first=second;
                second=temp;
            }
            System.out.println();
        }
    }
}
