package arrays;

import java.util.Arrays;

//its more like bubble sort

class InsertionSortOrBubbleSort {
    public static void main(String[] args) {
        int arr []={3,4,1,5,2};
         find(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void find (int arr[]){
        boolean flag;
        for (int i = 0; i < arr.length-1; i++) {
                flag=false;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    flag=true;
                }

            }

        if (!flag){
            break;
        }

        }
    }
    
}


//OR
//you can try this method for insertion Sort


class InsertionSort {
    public static void main(String[] args) {
        int arr []={3,4,1,5,2};
        find(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void find (int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    Swap(arr,j,j-1);
                }else {
                    break;
                }

            }
        }

        }

     static void Swap(int[] arr, int j, int i) {

             int temp = arr[j];
             arr[j]=arr[i];
             arr[i]=temp;


    }
}

//268. Missing Number
//in sum it adds all the index value (fibanocci);
//but it adds only arr.length -1
//so you should seperatly add arr.length value to sum
//then you add all the elements in array
//later subtract sum from arraysum


class MissingNumber1 {
    public static void main(String[] args) {
        int arr[] = {3,0,1};
        int ans = find(arr);
        System.out.println(ans);

    }

    static int find(int arr[]) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
           sum+=arr.length;

        int arraySum = 0;

        for (int i = 0; i < n; i++) {
            arraySum += arr[i];

        }

        return sum - arraySum;

    }
}
//268. Missing Number
//or you can try this
//where n = total number of element(it starts from 1)
//expected stores the number (basically its a fibanocci of arr.length)
//after gettinng the epxpected value
//you can now add all the elements in arry
//then subtarct expected sum

class MissingNumber2 {
    public static void main(String[] args) {
        int arr[] = {3,0,1};
        int ans = find(arr);
        System.out.println(ans);

    }

    static int find(int arr[]) {
        int n = arr.length;
        int exptected = n*(n+1)/2;
        int sum =0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];

        }
        return exptected-sum;
    }
}
