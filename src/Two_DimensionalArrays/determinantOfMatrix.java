package Two_DimensionalArrays;

import java.io.*;
import java.util.*;

public class determinantOfMatrix {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Enter size of nXn matrix");
        n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter matrix elements");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("matrix[" + i + "]" + "[" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Determinant = ");
        Solution ob = new Solution();
        System.out.println(ob.determinantOfMatrix(matrix, n));
        sc.close();
    }
}

class Solution {
    int determinantOfMatrix(int[][] matrix, int n) {
        if (n == 1)
            return matrix[0][0];
        if (n == 2)
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        int det = 0;
        for (int i = 0; i < n; i++) {
            int cof = (int) Math.pow(-1, i) * matrix[0][i] * determinantOfMatrix(subMatrix(matrix, 0, i), n - 1);
            det += cof;
        }
        return det;
    }

    static int[][] subMatrix(int[][] matrix, int row, int col) {
        int n = matrix.length;
        int arr[][] = new int[n - 1][n - 1];
        int r = 0, c = 0;
        for (int i = 0; i < n; i++) {
            if (i != row) {
                for (int j = 0; j < n; j++) {
                    if (j != col) {
                        arr[r][c] = matrix[i][j];
                        c++;
                    }
                }
                c = 0;
                r++;
            }
        }
        return arr;
    }
}
