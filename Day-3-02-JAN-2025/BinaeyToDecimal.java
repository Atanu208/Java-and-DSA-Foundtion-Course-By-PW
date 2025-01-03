import java.util.Scanner;

public class BinaeyToDecimal {
//    public static int pow(int exponent)
//    {
//        int pow=2;
//        if(exponent==0) return 1;
//        for (int i = 2; i <= exponent ; i++) {
//            pow *=2;
//        }
//        return pow;
//    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary number : ");
        int number=sc.nextInt();
        int pow=1;
        int decimalNum=0;
        while(number>0)
        {
            int rem=number%10;
            number=number/10;
            decimalNum += (rem*pow);
            pow *=2;
        }
        System.out.println(decimalNum);
    }
}

