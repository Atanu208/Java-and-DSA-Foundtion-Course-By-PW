public class PrintKMultiplesofNums {
    public static void printKmultiplesofNums(int num,int k)
    {
        if(k==0)
        {
            return;
        }
        printKmultiplesofNums(num,k-1);
        System.out.print(num*k+" ");
    }
    public static void main(String[] args) {
        printKmultiplesofNums(12,6);
    }
}
