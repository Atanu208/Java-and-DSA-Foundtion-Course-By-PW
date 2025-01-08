import java.util.Scanner;

public class SumOfRectangle {
    public static void main(String[] args) {
        int[][] matrix={
                {2,3,5,6},
                {4,6,2,1},
                {3,9,4,2},//(15)
                {5,3,2,8},//(13)
        };
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of l1");
        int rowBegin=sc.nextInt(); // l1
        System.out.println("Enter the value of r1");
        int colBegin=sc.nextInt(); // r1
        System.out.println("Enter the value of l2");
        int rowEnd=sc.nextInt(); // l2
        System.out.println("Enter the value of r2");
        int colEnd=sc.nextInt(); // r2

        //row wise prefix sum
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 1; j <matrix[i].length ; j++) {
                matrix[i][j]=matrix[i][j-1] + matrix[i][j];
            }
        }

        //column wise prefix sum
        for (int j = 0; j <matrix.length; j++) {
            for (int i = 1; i<matrix[j].length ; i++) {
                matrix[i][j]=matrix[i-1][j] + matrix[i][j];
            }
        }

        int up=0,left=0,leftUp=0;
        if(rowBegin>=1) up=matrix[rowBegin-1][colEnd];//(l1-1,r2)
        if(colBegin>=1) left=matrix[rowEnd][colBegin-1];//(l2,r1-1)
        if(rowBegin>=1 && colBegin>=1) leftUp=matrix[rowBegin-1][colBegin-1];//(l1-1,r1-1)
        int sum=matrix[rowEnd][colEnd]-left-up+leftUp;
        System.out.println("Sum "+sum);
    }
}
