public class Factorial {
    public static int factorial(int num)
    {
      if(num==1) return num;
      return num * factorial(num-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
}
//5*4*3*2*1