package Core_Java.Array;

public class Jagged_Array {
    
    public static void main(String[] args) {
        // Creating a jagged array (array of arrays)
        int[][] jaggedArray = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};

        // Displaying the jagged array
        System.out.println("Jagged Array:");
        for (int[] row : jaggedArray) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

