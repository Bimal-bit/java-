package recursion;

import java.util.Arrays;

class triangle2 {
    public static void main(String[] args) {
        find(5, 0); // Start the recursive function with 5 rows and 0 columns
    }

    // Recursive method to print a pattern of asterisks
    static void find(int r, int c) {
        if (r == 0) { // Base case: if the number of rows is zero, stop the recursion
            return;
        }
        if (c < r) { // If the current column is less than the current row
            System.out.print("*"); // Print an asterisk without a newline
            find(r, c + 1); // Recursively call the function with the next column
        } else {
            System.out.println(); // Print a newline to move to the next row
            find(r - 1, 0); // Recursively call the function with one less row and reset the column to 0
        }
    }
}

class Triangle1 {
    public static void main(String[] args) {
        find(5, 0); // Start the recursive function with 5 rows and 0 columns
    }

    // Recursive method to print a pattern of asterisks
    static void find(int r, int c) {
        if (r == 0) { // Base case: if the number of rows is zero, stop the recursion
            return;
        }
        if (c < r) { // If the current column is less than the current row
            find(r, c + 1); // Recursively call the function with the next column
            System.out.print("*"); // Print an asterisk without a newline
        } else {
            find(r - 1, 0); // Recursively call the function with one less row and reset the column to 0
            System.out.println(); // Print a newline to move to the next row
        }
    }
}




class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 4, 3}; // Example array
        sort(arr, arr.length - 1, 0); // Start the recursive bubble sort
        System.out.println(Arrays.toString(arr)); // Print the sorted array
    }

    // Recursive method to perform bubble sort
    static void sort(int[] arr, int r, int c) {
        if (r == 0) { // Base case: if the number of rows is zero, stop the recursion
            return;
        }
        if (c < r) { // If the current column is less than the current row
            if (arr[c] > arr[c + 1]) { // If the current element is greater than the next element
                // Swap the elements
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            sort(arr, r, c + 1); // Recursively call the function with the next column
        } else {
            sort(arr, r - 1, 0); // Recursively call the function with one less row and reset the column to 0
        }
    }
}



class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 6, 3, 2}; // Example array
        sort(arr, arr.length, 0, 0); // Start the recursive selection sort
        System.out.println(Arrays.toString(arr)); // Print the sorted array
    }

    // Recursive method to perform selection sort
    static void sort(int[] arr, int r, int c, int max) {
        if (r == 0) { // Base case: if the number of rows is zero, stop the recursion
            return;
        }
        if (c < r) { // If the current column is less than the current row
            if (arr[c] > arr[max]) { // If the current element is greater than the max element
                sort(arr, r, c + 1, c); // Recursively call the function with the next column and update max
            } else {
                sort(arr, r, c + 1, max); // Recursively call the function with the next column
            }
        } else {
            // Swap the max element with the last element of the current subarray
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            sort(arr, r - 1, 0, 0); // Recursively call the function with one less row and reset the column and max
        }
    }
}
