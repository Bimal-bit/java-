package arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//In this method, the elements should be lesser than or equal to arr.length
//if the elements is greater than the array length it pops error (ArrayIndexOutOfBoundsException)
class CycleSort {
     public static void main(String[] args) {
         int arr[]={9,6,4,2,3,5,7,0,1};
         sort(arr);
         System.out.println(Arrays.toString(arr));

     }
     static void sort(int arr[]){
         int i = 0;

         while (i< arr.length){
             int check = arr[i]-1;
             if (arr[i]!=arr[check]){
                 swap(arr,i,check);
             }else {
                 i++;
             }
         }

     }

      static void swap(int[] arr, int i, int check) {
         int temp =arr[i];
         arr[i]=arr[check];
         arr[check]=temp;
     }


 }


//268. Missing Number
//
class MissingNumber {
    public static void main(String[] args) {
        int arr[] = {9,6,4,2,3,5,7,0,1};
        int ans = sort(arr);
        System.out.println(ans);

    }

    static int  sort(int arr[]) {
        int i = 0;

        while (i < arr.length) {
            int check = arr[i] ;
            if (arr[i]< arr.length && arr[i] != arr[check]) {
                swap(arr, i, check);
            } else {
                i++;
            }

        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j){
                return j;
            }
            
        }
       return arr.length;
    }

    static void swap(int[] arr, int i, int check) {
        int temp = arr[i];
        arr[i] = arr[check];
        arr[check] = temp;
    }

}


//448. Find All Numbers Disappeared in an Array
//List <Integer> is used to store the elements in array form
class NumbersDisappeared {
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        List<Integer> ans = sort(arr);
        System.out.println(ans);

    }

    static List<Integer> sort(int arr[]) {
        int i = 0;

        while (i < arr.length) {
            int check = arr[i]-1 ;
            if (arr[i]!=arr[check]) {
                swap(arr, i, check);
            } else {
                i++;
            }

        }
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j+1){
                ans.add(j+1);
            }

        }
        return ans;
    }

    static void swap(int[] arr, int i, int check) {
        int temp = arr[i];
        arr[i] = arr[check];
        arr[check] = temp;
    }

}

//287. Find the Duplicate Number

class DuplicateNumber {
    public static void main(String[] args) {
        int arr[] = {3,3,3,3,3};
        int ans = sort(arr);
        System.out.println(ans);

    }

    static int sort(int arr[]) {
        int i = 0;

        while (i < arr.length) {
            int check = arr[i] - 1;
            if (arr[i] != arr[check]) {
                swap(arr, i, check);
            } else {
                i++;
            }

        }
            int ans =0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j+1){
                ans =arr[j];

            }
        }
        return ans;

    }

    static void swap(int[] arr, int i, int check) {
        int temp = arr[i];
        arr[i] = arr[check];
        arr[check] = temp;
    }
}

