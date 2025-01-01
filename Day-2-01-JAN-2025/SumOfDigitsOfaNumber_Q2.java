
import java.util.Scanner;

public class SumOfDigitsOfaNumber_Q2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        int sum=0;
        while(number>0)
        {
            int rem=number%10;
            number = number/10;
            sum +=rem;
        }
        System.out.println("Sum Of the digit of the number is : "+sum);
    }
}
