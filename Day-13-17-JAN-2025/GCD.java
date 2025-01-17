public class GCD {
//    public static int gcd(int num1,int num2)
//    {
//        int gcd=0;
//        int biggest = num1 > num2 ? num1 : num2;
//        int smallest=num1 < num2? num1:num2;
//
//        while (biggest%smallest!=0)
//        {
//            int rem=biggest%smallest;
//            biggest=smallest;
//            smallest=rem;
//        }
//        return smallest;
//    }
    public static int gcd(int num1,int num2)
    {
        if(num2==0) //gcd(num1,0)=num1 or gcd(0,num2)=num2
        {
            return num1;
        }
            return gcd(num2,num1%num2); //gcd(num1,num2)=gcd(num1,num1%num2)
    }
    public static void main(String[] args) {
        System.out.println(gcd(36,60));
    }
}
