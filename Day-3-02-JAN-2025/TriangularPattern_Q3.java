//        *
//        **
//        ***
//        ****
//        *****

import java.util.Scanner;
public class TriangularPattern_Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of row : ");
        int row=sc.nextInt();
        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
