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
