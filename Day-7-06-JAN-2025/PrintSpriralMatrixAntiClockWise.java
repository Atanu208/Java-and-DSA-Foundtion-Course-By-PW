public class PrintSpriralMatrixAntiClockWise {
    public static void main(String[] args) {
        int[][] matrix={
                {2,3,4,5,6},
                {7,  8, 9,10,11},
                {12,13,14,15,16},
                {17,18,19,20,21},
                {22,23,24,25,26}
        };
        int rowBegin=0,rowEnd=matrix.length-1;
        int colBegin=0,colEnd=matrix[0].length-1;
        while (rowBegin<=rowEnd && colBegin<=colEnd)
        {
            for (int i = rowBegin; i <= rowEnd ; i++) {
                System.out.print(matrix[i][colBegin]+" ");
            }
            colBegin++;
            System.out.println();

            for (int i=colBegin; i<=colEnd ; i++) {
                System.out.print(matrix[rowEnd][i]+" ");
            }
            rowEnd--;
            System.out.println();

            for (int i = rowEnd; i >= rowBegin ; i--) {
                System.out.print(matrix[i][colEnd]+" ");
            }
            colEnd--;
            System.out.println();
            for (int i = colEnd; i >=colBegin ; i--) {
                System.out.print(matrix[rowBegin][i]+" ");
            }
            rowBegin++;
            System.out.println();
        }
    }
}
