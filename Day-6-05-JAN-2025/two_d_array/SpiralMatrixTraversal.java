package two_d_array;

public class SpiralMatrixTraversal {
    public static void main(String[] args) {
        int[][] matrix={
                {12,25,34,16},
                {23,35,19,26},
                {41,19,25,74},
                {10,22,42,21}
        };
        int rowBegin=0,rowEnd=matrix.length-1;
        int colBegin=0,colEnd=matrix[0].length-1;

        while(rowBegin<=rowEnd && colBegin<=colEnd)
        {
            for (int i = colBegin; i <=colEnd ; i++) {
                System.out.print(matrix[rowBegin][i]+" ");
            }
            rowBegin++;
            System.out.println();
            for (int i = rowBegin; i <= rowEnd ; i++) {
                System.out.print(matrix[i][colEnd]+" ");
            }
            colEnd--;
            System.out.println();
            for (int i = colEnd; i>=colBegin ; i--) {
                System.out.print(matrix[rowEnd][i]+" ");
            }
            rowEnd--;
            System.out.println();
            for (int j = rowEnd; j>colBegin; j--) {
                System.out.print(matrix[j][colBegin]+" ");
            }
            colBegin++;
            System.out.println();
        }
    }
}
