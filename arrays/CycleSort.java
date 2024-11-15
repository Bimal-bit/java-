package arrays;
import java.util.Arrays;


//In this method, the elements should be lesser than or equal to arr.length
//if the elements is greater than the array length it pops error (ArrayIndexOutOfBoundsException)
class CycleSort {
     public static void main(String[] args) {
         int arr[]={4,3,6,1,2};
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
