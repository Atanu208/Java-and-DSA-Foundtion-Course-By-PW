public class SwapTwoNumber {

    public static void main(String[] args) {
        int num1=10;
        int num2=20;
        System.out.println("Before Swaping first number value was : "+num1);
        System.out.println("Before Swaping second number value was : "+num2);

        // using temporary variable
        // int temp=num1;
        // num1=num2;
        // num2=temp;

        // without using temporary variable
        num1=num1+num2; //12+24=36
        num2=num1-num2; //36-24=12
        num1=num1-num2; //36-12=24
        System.out.println("After Swaping first number value is : "+num1);
        System.out.println("After Swaping second number value is : "+num2);

    }
}
