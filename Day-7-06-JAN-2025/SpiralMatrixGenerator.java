import java.util.Scanner;

public class SpiralMatrixGenerator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of n : ");
        int n=sc.nextInt();
        int[][] spiralMatrix=new int[n][n];
        int rowBegin=0,rowEnd=spiralMatrix.length-1;
        int colBegin=0,colEnd=spiralMatrix[0].length-1;
        int k=1;
        while(rowBegin<=rowEnd && colBegin<=colEnd)
        {
            for (int i = colBegin; i<=colEnd ; i++) {
                spiralMatrix[rowBegin][i]=k;
                k +=1;
            }
            rowBegin++;
            for (int i = rowBegin; i<= rowEnd ; i++) {
                spiralMatrix[i][colEnd]=k;
                k +=1;
            }
            colEnd--;
            for (int i = colEnd; i>=colBegin ; i--) {
                spiralMatrix[rowEnd][i]=k;
                k +=1;
            }
            rowEnd--;
            for (int i = rowEnd; i>=rowBegin ; i--) {
                spiralMatrix[i][colBegin]=k;
                k +=1;
            }
            colBegin++;
        }

        for (int i = 0; i <spiralMatrix.length ; i++) {
            for (int j = 0; j <spiralMatrix[0].length ; j++) {
                System.out.print(spiralMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
