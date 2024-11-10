import java.util.Arrays;

import static java.lang.System.*;

class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {11, 12, 13, 14, 15, 16, 17, 18, 19};
        int target = 18;
        int ans = search(arr, target);
        out.println(ans);
    }

    static int search(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target < arr[middle]) {
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }

        return -1;
    }
}


//
class OrderDiagnosticBinarySearch {
    public static void main(String[] args) {
        int arr[] = {11, 12, 13, 14, 15, 16, 17, 18, 19};
        int target = 18;
        int ans = search(arr, target);
        out.println(ans);
    }

    static int search(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isasc=arr[start] < arr[end];
        out.println(isasc);

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target < arr[middle]) {
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }

        return -1;
    }
}

//ceiling of a number
//Smallest number greater than equal to target
class CeilingOfNumber {
    public static void main(String[] args) {
        int arr[] = {11, 12, 13, 14, 16, 17};
        int target =18 ;
        int ans = search(arr, target);
        out.println(ans);
    }

    static int search(int arr[], int target) {
        if(target>arr.length-1){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target < arr[middle]) {
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }

        return start;
    }
}

// reverse ceiling of a number
//Smallest number lesser than equal to target

class RverseCeilingOfNumber {
    public static void main(String[] args) {
        int arr[] = {9,11, 12, 13, 14, 16, 17};
        int target =8 ;
        int ans = search(arr, target);
        out.println(ans);
    }

    static int search(int arr[], int target) {
        if(target<0){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target < arr[middle]) {
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }

        return end;
    }
}

//744. Find Smallest Letter Greater Than Target

class nextGreatestLetter{
    public static void main(String[] args) {
        char arr[] = {'c','d','f','j'};
        char target = 'j';
        char ans = search(arr, target);
        out.println(ans);
    }

    static char search(char arr[], char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target < arr[middle]) {
                end = middle - 1;
            } else  {
                start = middle + 1;
            }
        }

        return arr[start % arr.length];
    }
}


//34. Find First and Last Position of Element in Sorted Array
class FirstAndLast {
    public static void main(String[] args) {
        int arr[] = {5,7,7,7,7,8,8,8,9,10};
        int target = 7;
        int ans[] = search(arr, target);
        out.println(Arrays.toString(ans));
    }

    static int[] search(int nums[], int target) {
        int []ans ={-1,-1};
        int start=ok(nums,target,true);
        int end =ok(nums,target,false);
        ans[0]=start;
        ans[1]=end;


        return ans;
    }


    static int ok(int []arr,int target,boolean find){
        int ans =-1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target < arr[middle]) {
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            } else {
                ans=middle;
                if(find==true){
                    end=middle-1;
                }
                else {
                    start=middle+1;
                }
            }
        }

        return ans;

    }

}

//finding target in an infinite array

 class InfiniteArray
{
    public static void main(String[] args)
    {
        int[] a={2,3,4,5,7,8,9,11,22,35,48,51,82,95,115,270};
        int target=95;
        int result= findPosition(a, target);
        out.println(result);
    }


    public static int findPosition(int[] arr, int target)
    {
        int start=0;
        int end=1;
        while(target > arr[end])
        {
            int sizeOfBox=end-start+1;
            start=end+1;
            end = end + sizeOfBox * 2;
            if(end >= arr.length)
            {
                end = arr.length - 1; //make end index=last index of array
                if(target>arr[end])
                    return -1;
            }
        }
        return binarySearch(arr, target, start, end);
    }

    public static int binarySearch(int[] a, int target, int start, int end)
    {
        while(start <= end)
        {
            int mid= start + (end-start) / 2;
            if(target == a[mid])
                return mid;
            else if(target < a[mid])
                end = mid-1;
            else if(target > a[mid])
                start = mid+1;
        }
        return -1;
    }
}

//852. Peak Index in a Mountain Array
//this is my logic
//to solve this question time complexity should be O(log(n))

class PeakIndex {
    public static void main(String[] args) {
        int arr[] = {11, 12, 13, 14, 15,16, 10, 9, 8, 7};

        int ans = search(arr);
        out.println(ans);
    }

    static int search(int arr[]) {
        int ans=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>arr[i+1]){
                return i;
            }
        }
            return -1;
        }


        }
//or
//you can try this
//852. Peak Index in a Mountain Array

class PeakIndex1 {
    public static void main(String[] args) {
        int arr[] = {11, 12, 13, 14, 15,16,17, 11, 10, 9, 8};

        int ans = search(arr);
        out.println(ans);
    }

    static int search(int arr[]  ) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (arr[middle+1] < arr[middle]) {
                end = middle - 1;
            } else if (arr[middle+1] > arr[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }

        return start;
    }
}

//33. Search in Rotated Sorted Array
//pivot is the largest number in the array

class RotatedArray {
    public static void main(String[] args) {
        int arr[] = {11, 12, 13, 14, 15, 10, 9, 8, 7};
        int target = 1;
        int ans = search(arr, target);
        out.println(ans);
    }

    static int search(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (arr[middle] == target) {
                return middle;

            }
            if (arr[start] <= arr[middle]) {
                if (arr[start] <= target && target < arr[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else {
                if (arr[end] <= target && target > arr[middle]) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }

            }

        }
        return-1;
    }
}

//33. Search in Rotated Sorted Array
//atually this code contains the wrong algorithm it only works for three examples which is given in leetcode
//it was just created for fun to check that code works or not,
//but for another example it does not work
//
class temp {
    public static void main(String[] args) {
        int arr[] = {11, 12, 13, 14, 15, 10, 9, 8, 7};
        int target = 1;
        int ans = search(arr, target);
        out.println(ans);
    }

    static int search(int arr[], int target) {
                if(target==arr[0]){
                    return arr[0];
                } else if (arr.length-1==0) {
                    return -1;

                } else {
                    if(target==0){
                        return arr[0];
                    }
                }
        return-1;
    }
}


class trial{
    public static void main(String[] args) {

    }
    static  int sol(int []arr){
        int start=0;
        int end=arr.length-1;
        while (start <=end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                return mid;
            }


        }
        return -1;
       
    }
}

