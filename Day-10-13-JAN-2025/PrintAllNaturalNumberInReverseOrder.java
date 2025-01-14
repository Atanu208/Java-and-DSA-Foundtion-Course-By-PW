public class PrintAllNaturalNumberInReverseOrder {
    public static void printAllNaturalNumbers(int n)
    {
        if(n==1)                                            //step -1 define a base case
        {
            System.out.print(1+" ");
            return;
        }
        System.out.print(n+" ");                            //step-2 do self work
        printAllNaturalNumbers(n-1);                     //step-3 do recursive work -> (smaller task)
    }
    public static void main(String[] args) {
        printAllNaturalNumbers(10);
    }
}
