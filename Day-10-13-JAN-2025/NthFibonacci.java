public class NthFibonacci {
    public static int nthFib(int num)
    {
        if(num==0 || num==1)
        {
            return num;
        }
        return nthFib(num-1)+nthFib(num-2);
    }
    public static void main(String[] args) {
        System.out.println(nthFib(3));
    }
}