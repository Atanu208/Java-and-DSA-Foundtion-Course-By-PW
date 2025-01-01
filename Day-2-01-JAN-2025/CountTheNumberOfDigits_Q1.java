import java.util.Scanner;

// Count the number of digits for a given number n.
public class CountTheNumberOfDigits_Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        int count=0;
        while(number>0)
        {
            number = number/10;
            count++;
        }
        System.out.println("Number of digit : "+count);
    }
}
