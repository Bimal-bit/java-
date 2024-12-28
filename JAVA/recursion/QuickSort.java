package recursion;

import java.util.Arrays;

class QuickSort {
    public static void main(String[] args) {
        int arr[] = {5, 1, 3, 2, 4}; // Example array to be sorted
        sort(arr, 0, arr.length - 1); // Call the sort method to sort the array
        System.out.println(Arrays.toString(arr)); // Print the sorted array
    }
    // Method to sort the array using quicksort
    static void sort(int[] arr, int low, int high) {
        // Base case: if the subarray has one or no elements, it's already sorted
        if (low >= high) {
            return;
        }
        // Initialize pointers for the start and end of the subarray
        int start = low;
        int end = high;
        // Choose the pivot element as the middle element of the subarray
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        // Partition the array around the pivot
        while (start <= end) {
            // Move the start pointer to the right until an element greater than the pivot is found
            while (arr[start] < pivot) {
                start++;
            }
            // Move the end pointer to the left until an element less than the pivot is found
            while (arr[end] > pivot) {
                end--;
            }
            // Swap the elements at the start and end pointers if they are in the wrong order
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        // Recursively sort the left and right subarrays
        sort(arr, low, end);
        sort(arr, start, high);
    }
}
