//Given 2 numbers a and b.Find a raised to the power b
import java.util.Scanner;

public class FindingARaisedToPowerB_Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("a : ");
        int a=sc.nextInt();
        System.out.println("b : ");
        int b=sc.nextInt();
        int ans=1;
        for (int i=1;i<=b;i++)
        {
            ans *=a;
        }
        System.out.println(ans);
    }
}
