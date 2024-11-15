import java.util.Arrays;


//selection sorting
//its used to sort array
//its like chossing maximum or minimum value ina array and placing it to correct index

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {4, 5, 1, 2, 3, -55};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selection(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = maimum(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int maimum(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i < last; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }

        }
        return max;
    }

}

//69. Sqrt(x)

 class Sqrt {
     public static void main(String[] args) {
         int x= 4;
         int ans =mySqrt(x);
         System.out.println(ans);


     }
    static int mySqrt(int x) {
        if (x == 0) return 0; // Special case for 0

        int left = 1, right = x, ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;  // Prevent overflow by using this formula for mid
            if (mid <= x / mid) {  // Equivalent to mid * mid <= x but avoids overflow
                ans = mid;         // Store mid as potential answer
                left = mid + 1;    // Try to find a larger square root
            } else {
                right = mid - 1;   // Look for a smaller value
            }
        }

        return ans;
    }
}