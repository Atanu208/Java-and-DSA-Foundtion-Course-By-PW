public class LCM {
    public static int gcd(int x,int y)
    {
        if(y==0)
            return x;
        return gcd(y,x%y);
    }
    public static void main(String[] args) {
        int x=12;
        int y=15;
        int gcd=gcd(x,y);
        int lcm=(x*y)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
