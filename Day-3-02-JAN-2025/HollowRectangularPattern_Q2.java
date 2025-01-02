//        **********
//        *        *
//        *        *
//        *        *
//        **********
import java.util.Scanner;
public class HollowRectangularPattern_Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of row : ");
        int row=sc.nextInt();

        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <= row*2 ; j++) {
                if(i==1 || i==row || j==1 || j==row*2) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
