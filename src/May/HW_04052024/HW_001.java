package May.HW_04052024;

public class HW_001 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int max = Integer.MIN_VALUE; // Initialize max to the smallest possible integer value

        // Iterate through the 2D array
        for (int[] row : arr) {
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }

        System.out.println("Maximum value in the 2D array: " + max);
    }
}
