package Core_Java.Array;

public class Jagged_Array {
    
    public static void main(String[] args) {
        // Creating a jagged array (array of arrays)
        int[][] jaggedArray = new int[3][];
        // (int arr[][] and int[][] arr are equivalent in Java, both declare a 2D array. The former is an older syntax, while the latter is more modern and preferred for clarity.)
        
        jaggedArray[0] = new int[3]; // First row with 3 elements
        jaggedArray[1] = new int[2]; // Second row with 2 elements
        jaggedArray[2] = new int[4]; // Third row with 4 elements

        // Initializing the rows with different lengths
        jaggedArray[0] = new int[]{1, 2, 3};
        jaggedArray[1] = new int[]{4, 5};
        jaggedArray[2] = new int[]{6, 7, 8, 9};

        // Displaying the jagged array
        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
