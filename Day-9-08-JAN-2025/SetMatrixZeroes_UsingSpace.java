public class SetMatrixZeroes_UsingSpace {
    public static void main(String[] args) {
        int[][] mat = {
                {1, -1, 1,1},
                {-1, 0, 1,0},
                {1, -1, 1,1}
        };
        int[] row=new int[mat.length];//[0,1,0],
        int[] col=new int[mat[0].length]; //[0,1,0,1]
        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j <mat[0].length ; j++) {
                if(mat[i][j]==0)
                {
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for (int i = 0; i <row.length ; i++) {
            for (int j = 0; j <mat[0].length ; j++) {
                if(row[i]==1)
                {
                    mat[i][j]=0;
                }
            }
        }
        for (int i = 0; i <col.length ; i++) {
            for (int j = 0; j < mat.length ; j++) {
                if(col[i]==1)
                {
                    mat[j][i]=0;
                }
            }
        }

        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j < mat[i].length ; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
