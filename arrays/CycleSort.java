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
//sort the array (1,n)
//later match the index if index +1  not equal to element return element

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
//442. Find All Duplicates in an Array
//same as 448.
class DuplicateArray {
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        List<Integer> ans = sort(arr);
        System.out.println(ans);

    }

    static List<Integer> sort(int arr[]) {
        int i = 0;

        while (i < arr.length) {
            int check = arr[i] - 1;
            if (arr[i] != arr[check]) {
                swap(arr, i, check);
            } else {
                i++;
            }

        }
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j+1){
                ans.add(arr[j]);

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



//645. Set Mismatch
//first return the index and also return the mismatch element


class SetMismatch {
    public static void main(String[] args) {
        int arr[] = {1,1};
        int []ans = sort(arr);
        System.out.println(Arrays.toString(ans));

    }

    static int []sort(int arr[]) {
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
        int val = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j+1){
                ans =arr[j];
                val=j;

            }
        }
        return new int [] {ans,val+1};

    }

    static void swap(int[] arr, int i, int check) {
        int temp = arr[i];
        arr[i] = arr[check];
        arr[check] = temp;
    }
}


//41. First, Missing Positive
//ignore 0 and negative
//sorting starts from 1
//if the element is missing return index +1
//if the first element is not equal to index return that element
class FirstMissingPositive {
    public static void main(String[] args) {
        int arr[] = {7,8,9,11,12};
        int ans = sort(arr);
        System.out.println(ans);

    }

    static int sort(int arr[]) {
        int i = 0;

        while (i < arr.length) {

            int check = arr[i]-1 ;

            if ( arr[i]>0 && arr[i]<= arr.length && arr[i] != arr[check]) {
                swap(arr, i, check);
            } else {
                i++;
            }

        }
        int ans =0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j+1){
                ans =j;
                return ans+1;

            }
        }
        return arr.length+1;

    }

    static void swap(int[] arr, int i, int check) {
        int temp = arr[i];
        arr[i] = arr[check];
        arr[check] = temp;
    }
}
