public class PrintAllNaturalNumber {
    public static void printNaturalNum(int n)
    {
        if(n==1) //step -1 define a base case
        {
            System.out.print(n+" ");
            return;
        }
        printNaturalNum(n-1); //step-3 do recursive work -> (smaller task)
        System.out.print(n+" "); //step-2 do self work
    }
    public static void main(String[] args) {
        printNaturalNum(10);
    }
}
