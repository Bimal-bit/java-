import java.lang.reflect.Array;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
           int count =0;
           int arr []={11,33,66,99,44,55,61};
        for (int i = 0; i < arr.length; i++) {
            count=i;
            if (arr[i]==55){
                break;
            }

        }
        System.out.println("the value found at "+ count);
    }
}



//give input target and get output index
class serach1 {
    public static void main(String[] args) {
        int arr[] = {10, 2, 66, 88, 44, 85, 42};
        int target = 44;
        int ans = ls1(arr, target);
        System.out.println("your value found at index "+ans);
    }


    static int ls1(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;


            }
        }

        return -1;
    }
}


//give input index and output value
class serach {
    public static void main(String[] args) {
        int arr[] = {10, 2, 66, 88, 44, 85, 42};
        int target = 3;
        int ans = ls1(arr, target);
        System.out.println( " the index contain the value "+ ans);
    }


    static int ls1(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {

            if (i == target) {
                return arr[i];


            }
        }

        return -1;
    }
}


//search using strings

class SearchString{
    public static void main(String[] args) {

        String name = "kunal";
        char target = 'a';
        int x= findChar(name,target);
        System.out.println("your char found at index "+x);

    }
    static int findChar(String name ,char target){
        if (name.length()==0){
            return -1;

        }
        for (int i = 0; i < name.length(); i++) {
            if (target==name.charAt(i)){
                return i;
            }

        }return -1;
    }

}

//Search a string and print the output
class SearchArrString{
    public static void main(String[] args) {

        String name[] = {"kunal","bimal","kl","arr"};
        String target = "arr";
        int x= findChar(name,target);
        System.out.println("your string found at index "+x);

    }
    static int findChar(String name [] ,String target){
        if (name.length==0){
            return -1;

        }
        for (int i = 0; i < name.length; i++) {
            if (name[i]==target){
                return i;
            }

        }return -1;
    }

}
//search the value in range
class SerachForRange {
    public static void main(String[] args) {
        int arr[] = {10, 2, 66, 88, 44, 85, 42};
        int target = 44;

        int ans = ls1(arr, target,1,5);
        System.out.println("your value found at index "+ans);
    }


    static int ls1(int[] arr, int target,int from,int to) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = from; i <= to; i++) {
            int element = arr[i];
            if (element == target) {
                return i;


            }
        }

        return -1;
    }
}


//find min in array

class SerachForMin {
    public static void main(String[] args) {
        int arr[] = {2,3,1,4,5,6};


        int ans = ls2(arr);
        System.out.println("your value found at index "+ans);
    }


    static int ls2(int[] arr ) {

            int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min= i;


            }
        }

        return min;
    }
}


class SerachForMax {
    public static void main(String[] args) {
        int arr[] = {2,3,1,4,5,6};

        int ans = ls2(arr);
        System.out.println("your value found at index "+ans);
    }


    static int ls2(int[] arr ) {

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max= arr[i];
            }
        }
        return max;
    }
}

//seaarch in 2d array
class Search2d {
    public static void main(String[] args) {
        int arr[][] = {
                {11, 12, 13},
                {14, 15, 16},
                {18, 19, 20}
        };
        int target = 20;
        int[] ans = find(arr, target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] find(int arr[][], int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {


                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
            return new int[]{-1, -1};
    }
}


class SearchMin2d {
    public static void main(String[] args) {
        int arr[][] = {
                {11, 12, 13},
                {14, 15, 16},
                {18, 19, 20}
        };
        
        int ans = find(arr);
//    System.out.println(Arrays.toString(ans));

    }

    static int find(int arr[][]) {
            int min=Integer.MAX_VALUE;
            for (int[]a:arr){
                for (int element:a){
                    if(element<min){
                        min=element;
                    }


                }
            }
            return min;
        }

    }



//1295 find numberes with number of digits
class EvenDigits{
    public static void main(String[] args) {
        int []nums= {11, 1, 584, 5697, 55};
        int ans=findNumbers(nums);
        System.out.println(ans);

    }
    static int findNumbers(int []nums){
        int count=0;
        int ec=0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i]!=0){
                count++;
                nums[i]/=10;

            }
            ec+=((count%2==0)?1:0);
            count=0;

        }
        return ec;
    }
}

//1672 Richest coustemer wealth

class maxwealth{
    public static void main(String[] args) {
        int [][]arr={
                {1, 2, 3},
                {5, 6, 10},
                {8, 6, 6},
                {11,25,99}
        };
        int ans =max(arr);
        System.out.println(ans);

    }
    static int max (int [][]arr){
        int sum=0;
        int max=0;
        for (int i = 0; i <arr.length; i++) {
            sum=0;

            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];

            }
            if (sum >= max) {
                max=sum;

            }


        }
        return max;
    }
}

//two sum

class TwoSum{
    public static void main(String[] args) {
        int []arr ={10,3,5,6,7,7,4,6};
        int target=20;
        int []ans =sol(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sol(int []arr, int target){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {


                if (arr[i]+arr[i+1]==target) {
                    return new int[]{i, j};
                }

            }

        }
        return new int[]{};
    }
}

//second-largest element
//this was asked in geeks for geeks
class SecondLargest{
    public static void main(String[] args) {
        int []arr={12 ,35 ,1 ,10 ,34,1,60,70};
        int ans =sol(arr);
        System.out.println(ans);



    }
    static  int sol(int arr[]){


        int max =-1;
        int min =-1;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (arr[i] > max) {
                min = max;
                max = arr[i];
            } else if (num > min && num != max) {
                min=num;

            }


        }

        return min;
        }
    }
