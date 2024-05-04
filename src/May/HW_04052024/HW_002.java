package May.HW_04052024;

public class HW_002 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int target = 8;
        boolean found = false;

        // Iterate through the 2D array
        for (int[] row : arr) {
            for (int value : row) {
                if (value == target) {
                    found = true;
                    break; // Break the inner loop if target is found
                }
            }
            if (found) {
                break; // Break the outer loop if target is found
            }
        }

        System.out.println("Element " + target + " exists in the 2D array: " + found);
    }
}
