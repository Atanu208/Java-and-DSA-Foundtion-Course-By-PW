import java.util.Scanner;

public class HollowTrianglePattern_Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of row : ");
        int row=sc.nextInt();
        int space=row-1;
        int star=1;
        for (int i = 1; i <=row ; i++) {
            for (int j = i; j<= row ; j++) {
                System.out.print(" ");
            }
            for (int l = 1; l <=2*i-1 ; l++) {
                if(l==1 || l==2*i-1 || i==row)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            star +=2;
            space--;
            System.out.println();
        }
    }
}