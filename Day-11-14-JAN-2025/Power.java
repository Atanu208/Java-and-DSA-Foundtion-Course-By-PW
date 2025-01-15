public class Power {
    public static int pow(int p,int q)
    {
        // Base case: any number to the power of 0 is 1
        if(q==0)
        {
            return 1;
        }
        // Recursive step: p^q = p * p^(q-1)
        return p * pow(p,q-1);
    }
    public static void main(String[] args) {
        System.out.println(pow(5,4));
        int p=2;
        int q=10;
        if(q%10==0)
        {

        }
    }
}
