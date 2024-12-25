package recursion;

import java.util.ArrayList;

class Array {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 6, 4}; // Example array
        System.out.println(check(arr, 0)); // Check if the array is sorted and output the result
    }

    // Method to check if the array is sorted in ascending order
    static boolean check(int[] arr, int index) {
        if (index == arr.length - 1) { // If we reach the end of the array, it is sorted
            return true;
        }
        // Check if the current element is less than the next element and recursively check the rest
        return arr[index] < arr[index + 1] && check(arr, index + 1);
    }
}

//to find the element in array using recursion
class Search1 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 6, 4}; // Example array
        System.out.println(check(arr, 4, 0)); // Find the index of the target value 4 and output the result
    }

    // Method to find the index of the target value in the array
    static int check(int[] arr, int target, int index) {
        if (index >= arr.length) { // If we reach the end of the array and haven't found the target, return -1
            return -1;
        }
        if (arr[index] == target) { // If the current element matches the target, return the current index
            return index;
        }
        return check(arr, target, index + 1); // Recursively check the next element
    }

}


//to find two or more same elements
class Search2 {
    public static void main(String[] args) {
        int[] arr = {1, 2,5, 3, 2,6, 4}; // Example array
        CheckAll(arr, 2, 0); // Find the index of the target value 4 and output the result
        System.out.println(list);
    }
static ArrayList<Integer> list =new ArrayList<>();
static void CheckAll(int[] arr, int target, int index) {
    if (index == arr.length) { // If we reach the end of the array and haven't found the target, return -1
        return ;
    }
    if (arr[index] == target) { // If the current element matches the target, return the current index
        list.add(index);
    }
    CheckAll(arr, target, index + 1); // Recursively check the next element
}
}


///another method to find using array list
class Search3 {
    public static void main(String[] args) {
        int[] arr = {1, 2,5, 3, 2,6, 4}; // Example array
        ; // Find the index of the target value 4 and output the result
        System.out.println(CheckAll(arr, 2, 0,new ArrayList<>()));
    }

    static ArrayList<Integer> CheckAll(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) { // If we reach the end of the array and haven't found the target, return -1
            return list ;
        }
        if (arr[index] == target) { // If the current element matches the target, return the current index
            list.add(index);
        }
        return CheckAll(arr, target, index + 1,list); // Recursively check the next element
    }
}

//not suggested
class Search4{
    public static void main(String[] args) {
        int[] arr = {1, 2,5, 3, 2,6, 4}; // Example array
        ; // Find the index of the target value 4 and output the result
        System.out.println(CheckAll(arr, 2, 0));
    }

    static ArrayList<Integer> CheckAll(int[] arr, int target, int index) {
        ArrayList <Integer> list = new ArrayList<>();
        if (index == arr.length) { // If we reach the end of the array and haven't found the target, return -1
            return list ;
        }
        if (arr[index] == target) { // If the current element matches the target, return the current index
            list.add(index);
        }
        ArrayList<Integer> ans= CheckAll(arr, target, index + 1); // Recursively check the next element
        list.addAll(ans);
        return list;
    }

}


class RotatedBinarySearch1 {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3}; // Example array
        System.out.println(search(arr, 7, 0, arr.length - 1)); // Find the index of the target value 5 and output the result
    }

    // Method to perform rotated binary search
    static int search(int[] arr, int target, int s, int e) {
        if (s > e) { // Base case: if start index exceeds end index, target is not found
            return -1;
        }
        int m = s + (e - s) / 2; // Calculate the middle index
        if (arr[m] == target) { // If the middle element matches the target, return the middle index
            return m;
        }
        // Check if the left half is sorted
        if (arr[s] <= arr[m]) {
            // Check if the target is in the left half
            if (target >= arr[s] && target <= arr[m]) {
                return search(arr, target, s, m - 1); // Search in the left half
            } else {
                return search(arr, target, m + 1, e); // Search in the right half
            }
        }
        // If the left half is not sorted, then the right half must be sorted
        if (target >= arr[m] && target <= arr[e]) {
            return search(arr, target, m + 1, e); // Search in the right half
        } else {
            return search(arr, target, s, m - 1); // Search in the left half
        }
    }
}
