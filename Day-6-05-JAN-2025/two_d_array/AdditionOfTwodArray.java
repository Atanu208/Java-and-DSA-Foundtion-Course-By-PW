package two_d_array;
import java.util.Scanner;

public class AdditionOfTwodArray {
    public static void arrayInput(int[][] array,int row,int col)
    {
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = sc.nextInt();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first array row and column size : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] firstArray = new int[row][col];
        System.out.println("Enter the value by space : ");
        arrayInput(firstArray,row,col);


        int[][] seconArray=new int[row][col];
        arrayInput(seconArray,row,col);

        int[][] resultArray=new int[row][col];
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                resultArray[i][j]=firstArray[i][j]+seconArray[i][j];
            }
        }
        for (int i = 0; i <resultArray.length ; i++) {
            for (int j = 0; j <resultArray[i].length ; j++) {
                System.out.print (resultArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}