package Two_DimensionalArrays;

public class TransposeMatrix {
    public static void transposeOfMatrix(int[][] matrix, int rows, int col, int[][] transpose) {
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < rows; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Matrix after transpose");
        printArr(transpose);
    }

    public static void printArr(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        int rows = matrix.length;
        int col = matrix[0].length;
        int transpose[][] = new int[col][rows];

        transposeOfMatrix(matrix, rows, col, transpose);
    }
}