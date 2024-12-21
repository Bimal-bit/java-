package arrays;

import java.util.*;

class Result1 {
    public static void main(String[] args) {
        System.out.println("enter the  number of elements ");
        Scanner o = new Scanner(System.in);
        int n = o.nextInt();
        fizzBuzz(n);


    }

    static void fizzBuzz(int n) {
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            if (i % 3 == 0 ) {
                System.out.println("Fizz");
            }
            if (i % 5 == 0 ) {
                System.out.println("Buzz");
            }

            else {
                System.out.println(i);
            }


            // Write your code here

        }


    }
}




class Result {

    public static List<String> possibleChanges(List<String> usernames) {
        List<String> result = new ArrayList<>();

        for (String username : usernames) {
            boolean canChange = false;
            char minRightChar = username.charAt(username.length() - 1);

            // Iterate from right to left to find if any left character is greater than any right character
            for (int i = username.length() - 2; i >= 0; i--) {
                if (username.charAt(i) > minRightChar) {
                    canChange = true;
                    break;
                }
                minRightChar = (char) Math.min(minRightChar, username.charAt(i));
            }

            // Add "YES" or "NO" based on the check
            result.add(canChange ? "YES" : "NO");
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> usernames = Arrays.asList("abc", "cba", "fed");
        List<String> result = possibleChanges(usernames);

        for (String res : result) {
            System.out.println(res);
        }
    }
}



class Result2 {

    public static int nearlySimilarRectangles(List<List<Long>> sides) {
        Map<Double, Integer> ratioCount = new HashMap<>();
        int pairs = 0;

        for (List<Long> side : sides) {
            // Calculate the ratio of the rectangle as a double
            double ratio = (double) side.get(0) / side.get(1);

            // If this ratio already exists in the map, count pairs
            if (ratioCount.containsKey(ratio)) {
                pairs += ratioCount.get(ratio);
            }

            // Update the count of this ratio in the map
            ratioCount.put(ratio, ratioCount.getOrDefault(ratio, 0) + 1);
        }

        return pairs;
}
}


class add {
    public static void main(String[] args) {
        int arr[] = { 6, 2, 1, 8, 10 };
        int maximum = max(arr);


        System.out.println(maximum);


    }

    static int max(int numbers[]) {
        int ans1 = numbers[0];
        int ans2 = numbers[0];
        int sum =0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > ans1) {
                ans1 = numbers[i];


            }

            if (numbers[i] < ans2) {
                ans2 = numbers[i];


            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]!=ans1 && numbers[i]!=ans2 ){
                sum+=numbers[i];

        }



        }
        return sum;
    }
}

//26. Remove Duplicates from Sorted Array

class FindDuplicate{
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        int ans =find(arr);
        System.out.println(ans);

    }
    static int find (int arr[]){
        int ans =0;
        for (int i = 0; i < arr.length; i++) {
                if (arr[ans]!=arr[i]){
                    ans++;
                    arr[ans]=arr[i];

                }

            }


        return ans+1;
        }
    }


//Basic Bubble Sort Implementation:
//Write a program to implement the Bubble Sort algorithm.
//Example: Given an array [64, 34, 25, 12, 22, 11, 90], the output should be [11, 12, 22, 25, 34, 64, 90].

class Main {
    public static void main(String[] args) {
        int [ ] arr= {64, 34, 25, 12, 22, 11, 90};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void sort(int[] arr) {
        boolean flag;
         for (int i = 0; i < arr.length; i++) {
             flag=false;
             for (int j = 1; j < arr.length-i ; j++) {
                 if (arr[j]<arr[j-1]){
                     int temp=arr[j];
                     arr[j]=arr[j-1];
                     arr[j-1]=temp;
                     flag=true;
                 }

             }
             if(!flag){
                 break;
             }

         }
    }

}

//cycle sort for revision
//Identify the correct position for every element in the array.
//Place the element at its correct position, and if any element is displaced, find its correct position and place it there. This continues in cycles until all elements are placed correctly.
//The process involves cycles, where a cycle ends when the element originally at the starting position is placed back in its correct position.
class CycleSort1{
    public static void main(String[] args) {
        int arr[]={6,5,3,1,2,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int []arr ){
        int i = 0 ;
        while (i< arr.length){
            int check = arr[i]-1;
            if(arr[i]!=arr[check]){
                swap(arr,i,check);
            }
            else {
                i++;

            }
        }

        }

     static void swap(int []arr,int i, int check) {
        int temp =arr[i];
        arr[i]=arr[check];
        arr[check]=temp;
    }

}



class MissingNo_CycleSort1{
    public static void main(String[] args) {
        int arr[]={6,5,3,1,2,0};
        System.out.println(sort(arr));


    }
    static int  sort(int []arr ){
        int i = 0 ;
        while (i< arr.length){
            int check = arr[i];
            if(arr[i]< arr.length && arr[i]!=arr[check]){
                swap(arr,i,check);
            }
            else {
                i++;

            }

        }
        for (int j = 0; j < arr.length; j++) {


            if (arr[j] != j) {
                return j;
            }
        }

            return arr.length;


    }

    static void swap(int []arr,int i, int check) {
        int temp =arr[i];
        arr[i]=arr[check];
        arr[check]=temp;
    }

}


class DuplicateNo{
    public static void main(String[] args) {
        int arr[]={6,5,3,1,2,0};
        System.out.println(sort(arr));


    }
    static int  sort(int []arr ){
        int i = 0 ;
        while (i< arr.length){
            int check = arr[i];
            if(arr[i]< arr.length && arr[i]!=arr[check]){
                swap(arr,i,check);
            }
            else {
                i++;

            }

        }
        for (int j = 0; j < arr.length; j++) {


            if (arr[j] != j) {
                return j;
            }
        }

        return arr.length;


    }

    static void swap(int []arr,int i, int check) {
        int temp =arr[i];
        arr[i]=arr[check];
        arr[check]=temp;
    }

}


class String2{
    public static void main(String[] args) {
         char []ch = {'h','e','l','l','o'};
        Stack<Character> s = new Stack<>();
        for (char c : ch){
            s.push(c);
            }
        int i = 0;
        while (!s.isEmpty()){
            ch[i++]=s.pop();

            }
            System.out.println(Arrays.toString(ch));

    }
}

class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        int low = 0;
        int high = len -1;
        while(low <= high) {
            // if two characters are different, swap them
            // else last and first are same characters, no need to swap
            if(s[low] != s[high]) {
                char temp = s[low];
                s[low] = s[high];
                s[high] = temp;
            }
            low++;
            high--;
        }
    }
}


//153. Find Minimum in Rotated Sorted Array

class FindMinInRotatedArray {
    public static void main(String[] args) {
        int nums[] = {3, 4, 5, 1, 2};
        int ans = findMin(nums);
        System.out.println(ans);
    }

    static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // If the middle element is less than the last element, the minimum is in the left part
            if (nums[mid] < nums[end]) {
                end = mid-1;
            } else { // Otherwise, the minimum is in the right part
                start = mid + 1;
            }
        }

        // At the end of the loop, start == end, pointing to the smallest element
        return nums[start];
    }
}


class fib{
    public static void main(String[] args) {
        int n = 7;
        System.out.println(ans(n));

    }
    static int ans(int n){
        int fina;
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        else {
             fina=((n-1)+(n-2) );

        }
        return fina;
    }
}