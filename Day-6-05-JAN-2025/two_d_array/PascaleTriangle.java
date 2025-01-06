package two_d_array;

import java.util.Scanner;

public class PascaleTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of triangle");
        int size=sc.nextInt();
        int[][] pascleArray=new int[size][];

        for (int i = 0; i <size ; i++) {
            pascleArray[i]=new int[i+1];
            pascleArray[i][0]=pascleArray[i][i]=1;
            for (int j = 1; j <i ; j++) {
                pascleArray[i][j]=pascleArray[i-1][j-1]+pascleArray[i-1][j];
            }
        }
        for (int i = 0; i <pascleArray.length ; i++) {
            for (int j = 0; j <pascleArray[i].length ; j++) {
                System.out.print(pascleArray[i][j]+" ");
            }
            System.out.println();
        }

    }
}
