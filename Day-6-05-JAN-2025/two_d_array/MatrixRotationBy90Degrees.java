package two_d_array;

public class MatrixRotationBy90Degrees {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 4,8},
                {3, 5, 1,7},
                {7, 9, 4,7},
                {1, 5, 9, 7}
        };
//        step 1-transpose the array
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                int temp = arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i]=temp;
            }
        }
//        step - 2 reverse the matrix
        for (int i = 0; i < arr.length; i++) {
            int k=arr.length-1;
            for (int j = 0; j <arr.length/2 ; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[i][k];
                arr[i][k]=temp;
                k--;
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
