package recursion;

import java.util.Arrays;

class MergeSort {
    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 2, 7, 6}; // Example array to be sorted
        int[] ans = sort(arr); // Call the sort method to sort the array
        System.out.println(Arrays.toString(ans)); // Print the sorted array
    }

    // Method to sort the array using merge sort
    static int[] sort(int[] arr) {
        // Base case: if the array has only one element, it's already sorted
        if (arr.length == 1) {
            return arr;
        }
        // Find the middle index to split the array into two halves
        int mid = arr.length / 2;
        // Recursively sort the left half of the array
        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        // Recursively sort the right half of the array
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

        // Merge the sorted halves and return the result
        return merge(left, right);
    }

    // Method to merge two sorted arrays into one sorted array
    static int[] merge(int[] left, int[] right) {
        // Create a new array to hold the merged result
        int[] mix = new int[left.length + right.length];
        // Initialize pointers for left, right, and mix arrays
        int i = 0, j = 0, k = 0;

        // Merge elements from left and right arrays in sorted order
        while (i < left.length && j < right.length) {
            // Compare elements from left and right arrays
            if (left[i] < right[j]) {
                // Add the smaller element to the mix array
                mix[k] = left[i];
                i++;
            } else {
                // Add the smaller element to the mix array
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        // Add remaining elements from the left array to the mix array
        while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }
        // Add remaining elements from the right array to the mix array
        while (j < right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }
        // Return the merged array
        return mix;
    }
}




class MergeSortInPlace {
    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 2, 7, 6}; // Example array to be sorted
        sort(arr, 0, arr.length); // Call the sort method to sort the array
        System.out.println(Arrays.toString(arr)); // Print the sorted array
    }

    // Method to sort the array using merge sort
    static void sort(int[] arr, int s, int e) {
        // Base case: if the subarray has only one element, it's already sorted
        if (e - s == 1) {
            return;
        }
        // Find the middle index to split the array into two halves
        int mid = (s + e) / 2;
        // Recursively sort the left half of the array
        sort(arr, s, mid);
        // Recursively sort the right half of the array
        sort(arr, mid, e);

        // Merge the sorted halves
        merge(arr, s, mid, e);
    }

    // Method to merge two sorted subarrays into one sorted array
    static void merge(int[] arr, int s, int m, int e) {
        // Create a new array to hold the merged result
        int[] mix = new int[e - s];
        // Initialize pointers for left, right, and mix arrays
        int i = s, j = m, k = 0;

        // Merge elements from left and right subarrays in sorted order
        while (i < m && j < e) {
            // Compare elements from left and right subarrays
            if (arr[i] < arr[j]) {
                // Add the smaller element to the mix array
                mix[k] = arr[i];
                i++;
            } else {
                // Add the smaller element to the mix array
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        // Add remaining elements from the left subarray to the mix array
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        // Add remaining elements from the right subarray to the mix array
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        // Copy the merged elements back to the original array
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }
}
