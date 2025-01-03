import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary number : ");
        int decimalNum=sc.nextInt();
        int pow=1;
        int biaryNum=0;
        while(decimalNum >0)
        {
            int rem=decimalNum%2;
            decimalNum=decimalNum/2;
            biaryNum += rem*pow;
            pow *=10;
        }
        System.out.println(biaryNum);
    }
}
