package Core_Java.Array;

public class Arr_2d {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}};

        System.out.println("Elements of the 2D array:");
        for (int[] row : numbers) {
            for (int number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    //another way to declare and initialize a 2D array
    //int arr[][] = {{1, 2, 3}, {4, 5, 6}};

    // How address of 2D array is stored in memory
    // In Java, 2D arrays are also objects, and when you create a
// 2D array, it is allocated on the heap memory. The variable that holds the 2D array is actually a reference to the array object in memory. This reference is stored in the stack memory. Each row of the 2D array is itself an array, and each of these row arrays is also allocated on the heap.

    //Why 2D array always starts with 0 index
    // In Java, 2D arrays are also zero-indexed, meaning that the first row and first column of a 2D array are accessed using index 0. This design choice is consistent with the way memory is addressed and how array elements are calculated. The index represents the offset from the starting memory address of the array. By starting at 0, the index directly corresponds to the memory location of each element in both dimensions.
    //formula to calculate the address of an element in a 2D array is:
    //Address of element at row i and column j = Base address of array + (i * number of columns + j) * size of each element

}
