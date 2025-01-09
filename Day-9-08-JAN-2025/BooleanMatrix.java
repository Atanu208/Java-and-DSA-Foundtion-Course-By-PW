public class BooleanMatrix {
    public static void main(String[] args) {
        int[][] arr={
                {1, 0, 0},
                {1, 0, 0},
                {1, 0, 0},
                {0, 0, 0}
        };
        int[] row=new int[arr.length]; //[1,1,1,0]
        int[] col=new int[arr[0].length]; //[1,0,0]
        for(int i=0;i<arr.length;i++)
        {
            for (int j = 0; j <arr[0].length ; j++) {
                if(arr[i][j]==1) {
                    row[i] = 1;
                    col[j]=1;
                }
            }
        }
        for (int i = 0; i <row.length ; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                if(row[i]==1)
                {
                    arr[i][j]=1;
                }
            }
        }
        for (int i = 0; i <col.length; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if(col[i]==1)
                {
                    arr[j][i]=1;
                }
            }
        }

    }
}
