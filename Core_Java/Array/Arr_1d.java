package Core_Java.Array;

public class Arr_1d {
    
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println("Elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // How address of array is stored in memory
    // In Java, arrays are objects, and when you create an array, it is allocated
    // on the heap memory. The variable that holds the array is actually a reference
    // to the array object in memory. This reference is stored in the stack memory.


    //Why array always starts with 0 index
    // In Java, arrays are zero-indexed, meaning that the first element of an array
    // is accessed using index 0. This design choice is rooted in the way memory is
    //addressed and how array elements are calculated. The index represents the
    //offset from the starting memory address of the array. By starting at 0, the
    //index directly corresponds to the memory location of each element.
    //formula to calculate the address of an element in an array is:
    //Address of element at index i = Base address of array + (i * size of each element)
}
