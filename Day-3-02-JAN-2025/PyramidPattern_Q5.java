//        *
//       ***
//      *****
//     *******
//    *********

import java.util.Scanner;
public class PyramidPattern_Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of row : ");
        int row=sc.nextInt();
        int space= row-1;
        int star=1;
        for (int i = 1; i <= row ; i++) {
            for (int j = 0; j <space ; j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=star ; k++) {
                System.out.print("*");
            }
            space--;
            star +=2;
            System.out.println();
        }
    }
}
