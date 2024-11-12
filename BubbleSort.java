
//27. Remove Element
//using brute force method

import java.util.Scanner;

class RemoveElement {
     public static void main(String[] args) {
         int[] arr = {0,1,2,2,3,0,4,2};
         int target = 2;
         int ans =find(arr,target);
         System.out.println(ans);
     }
     static int find (int [ ] arr, int target) {
         int count = 0;
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] != target) {

                 arr[count] = arr[i];


                 count++;

             }

         }
             return count;


     }
}


//136. Single Number
//if the number is repeating twice the we can use xor operator to probelm

//Using these properties, we can deduce that if we XOR all the numbers in the array,
// pairs of identical numbers will cancel each other out, leaving only the single, unique number.
class SingleNumber {
    public static void main(String[] args) {
        int arr[] = {4, 1, 2, 1, 2,1,2};
        int ans = find(arr);
        System.out.println(ans);

    }

    static int find(int arr[]) {
        int ans = 0;
        for (int num : arr) {
            ans ^= num;
        }
        return ans;
    }
}



