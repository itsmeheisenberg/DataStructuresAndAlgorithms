package Two_DimensionalArrays;

public class searchInSortedMatrix {
    public static void staircaseSearch(int[][] matrix, int key) {
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Found key at (" + row + "," + col + ")");
                return;
            }

            else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Key not found.");
    }

    public static void main(String[] args) {
        int[][] matrix = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        int key = 33;
        staircaseSearch(matrix, key);

    }
}
/* Staircase Search Approach */

/*
 * n: rows , m: columns
 * for (n-1,0) cell :
 * if key < cell value then move top
 * if key > cell value then move right
 * 
 * for(0,m-1) cell :
 * if key < cell value then move left
 * if key > cell value then move bottom
 */