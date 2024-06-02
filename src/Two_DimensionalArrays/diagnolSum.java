package Two_DimensionalArrays;

import java.util.Scanner;

public class diagnolSum {
    public static int DiagnolSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            /* Primary Diagnol Sum */
            sum += matrix[i][i];
            /* Secondary Diagnol */
            if (i != matrix.length - 1 - i)
                sum += matrix[i][matrix.length - 1 - i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        System.out.print("Enter size of matrix(square matrix): ");
        size = sc.nextInt();
        int[][] matrix = new int[size][size];

        System.out.print("Enter matrix elements: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        int sum = DiagnolSum(matrix);
        System.out.println("Sum : " + sum);
        sc.close();
    }
}
