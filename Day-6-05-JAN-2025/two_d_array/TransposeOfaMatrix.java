package two_d_array;

public class TransposeOfaMatrix {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,7},
                {4,5,6,1},
                {8,6,9,3},
                {2,5,6,5}
        };
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = i+1; j <arr[i].length; j++) {
                        int temp=arr[i][j]; //2 //3 //5//6 //6
                        arr[i][j]=arr[j][i]; // 4 //8 //5 //6 //
                        arr[j][i]=temp; //2//3//5//6

            }
        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
