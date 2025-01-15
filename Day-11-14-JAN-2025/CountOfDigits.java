public class CountOfDigits {
    public static int countOfDigit(int num)
    {
        if(num >= 0 && num <=9)
        {
            return 1;
        }
        return 1 + countOfDigit(num/10);
    }
    public static void main(String[] args) {
        System.out.println(countOfDigit(5683));
    }
}
