//        1 2 3 4 5 6 7
//        2 3 4 5 6 7 1
//        3 4 5 6 7 1 2
//        4 5 6 7 1 2 3
//        5 6 7 1 2 3 4
//        6 7 1 2 3 4 5
//        7 1 2 3 4 5 6

import java.util.Scanner;
public class NumericalRectangularPattern_Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of row : ");
        int row=sc.nextInt();
        int col=row;
        for (int i = 1; i <= row ; i++) {
            for (int j = i; j <=row ; j++) {
                System.out.print(j+ " ");
            }
            for (int k = 1; i>k ; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
