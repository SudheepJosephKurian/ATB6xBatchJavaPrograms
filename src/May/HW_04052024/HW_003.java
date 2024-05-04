package May.HW_04052024;

public class HW_003 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        // Create a new 2D array to store the transposed matrix
        int[][] transposed = new int[cols][rows];

        // Transpose the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = arr[i][j];
            }
        }

        // Print the transposed matrix
        System.out.println("Original Matrix:");
        printMatrix(arr);
        System.out.println("\nTransposed Matrix:");
        printMatrix(transposed);
    }

    // Utility method to print a 2D array
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
