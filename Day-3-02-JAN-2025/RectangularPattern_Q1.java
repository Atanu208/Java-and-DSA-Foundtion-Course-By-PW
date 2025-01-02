//        *****
//        *****
//        *****

import java.util.Scanner;
public class RectangularPattern_Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of row : ");
        int row=sc.nextInt();

        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <row*2 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
