
//27. Remove Element
//using brute force method

import java.util.Arrays;
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
//if the number is repeated twice, we can use xor operator for the problem

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



//swap the numberes using bubble sort
class BubblwSort{
    public static void main(String[] args) {

        int arr[] = {5, 2,6, 3,7, 1};
        find(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void find (int [ ]arr){
        boolean swap;
        for (int i = 0; i < arr.length; i++) {
            swap=false;
            for (int j = 1; j <arr.length-i ; j++) {
                if (arr[j]<arr[j-1]) {
                    int temp =arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;

                }

            }

        if(!swap){
            break;
        }
        }

    }

        }


