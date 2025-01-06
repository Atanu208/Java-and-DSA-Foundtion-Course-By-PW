package two_d_array;

public class ReverseEachRow {
    public static void main(String[] args) {
        int[][] arr={
                {12,34,16},
                {31,16,14},
                {12,16,27},
                {15,16,34},
                {24,16,18}
                };

        for (int i = 0;i <arr.length ; i++) {
            int len=arr[i].length-1;//3
            for (int j = 0; j <arr[i].length/2 ; j++) {
                int temp=arr[i][j];//16//12
                arr[i][j]=arr[i][len]; //34//
                arr[i][len]=temp; //16
                len--;
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
