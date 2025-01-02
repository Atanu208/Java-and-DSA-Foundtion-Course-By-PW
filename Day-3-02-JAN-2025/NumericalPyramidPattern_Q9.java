import java.util.Scanner;
public class NumericalPyramidPattern_Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of row : ");
        int row=sc.nextInt();
        int star=1;
        int space=row-1;
        int rev=1;

        for (int i = 1; i <=row; i++) {
            rev=i-1;
            for (int j = 1; j <=space ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star ; j++) {
                if(j>i)
                {
                    System.out.print(rev);
                    rev--;
                }
                else System.out.print(j);
            }
            space--;
            star +=2;
            System.out.println();
        }
    }
}
