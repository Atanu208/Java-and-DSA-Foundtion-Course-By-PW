//Condition for Matrix Multiplication:
//        The number of columns in the first matrix must equal the number of rows in the second matrix for multiplication to be defined.
//Resultant Matrix Dimensions:
//        The resultant matrix will have dimensions: [Number of rows of the first matrix] * [Number of columns of the second matrix]

package two_d_array;
import java.util.Scanner;
public class MatrixMultiplication {
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

        System.out.println("Enter the second row and column size : ");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        int[][] secondArray = new int[row2][col2];
        System.out.println("Enter the value by space : ");
        arrayInput(secondArray,row2,col2);

        if(firstArray[0].length != secondArray.length)
        {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }
        int[][] resultArray=new int[firstArray.length][secondArray[0].length];

        for (int i = 0; i < resultArray.length ; i++) {
            for (int j = 0; j < resultArray[0].length; j++) {
                int sum=0;
                for (int k = 0; k < firstArray[0].length ; k++) {
                    sum = firstArray[i][k]*secondArray[k][j];
                    resultArray[i][j]=sum;
                }
            }
        }

        for (int i = 0; i <resultArray.length ; i++) {
            for (int j = 0; j <resultArray[0].length ; j++) {
                System.out.print(resultArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
