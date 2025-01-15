public class SumOfDigit {
    public static int sumOfDigit(int num)
    {
        if(num>=0 && num<=9 )
        {
            return num;
        }
        return num%10 + sumOfDigit(num/10);
    }
    public static void main(String[] args) {
//        sumOfDigit(5);
        System.out.println(sumOfDigit(657));
    }

}
