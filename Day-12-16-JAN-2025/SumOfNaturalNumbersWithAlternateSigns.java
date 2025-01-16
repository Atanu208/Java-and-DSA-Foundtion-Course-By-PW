public class SumOfNaturalNumbersWithAlternateSigns {
    public static int sumOfNaturalNumber(int n)
    {
        if(n==0)
        {
           return 0;
        }
        if(n%2==0)
        {
            return sumOfNaturalNumber(n-1)-n;
        }
        else {
            return sumOfNaturalNumber(n-1)+n;
        }
    }

    public static void main(String[] args) {
        System.out.println(sumOfNaturalNumber(4));
    }
}
