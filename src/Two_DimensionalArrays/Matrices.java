package Two_DimensionalArrays;

import java.util.*;

public class Matrices {

    public static void search(int[][] matrix, int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Found at index (" + i + "," + j + ")");
                    return;
                }
            }
        }
        System.out.println("key not found");
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix elements: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print matrix
        System.out.println("Matrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 13);

        sc.close();
    }
}

/*
 * for row length : int n = matrix.length;
 * for column length : int m = matrix[0].length;
 */