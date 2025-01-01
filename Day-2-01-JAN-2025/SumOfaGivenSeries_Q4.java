import java.util.Scanner;

public class SumOfaGivenSeries_Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        int sum=0;
        for(int i=1;i<=number;i++)
        {
            if(i%2==0) sum -=i;
            else sum +=i;
        }
        System.out.println("Sum of a given series would be : "+sum);
    }
}
