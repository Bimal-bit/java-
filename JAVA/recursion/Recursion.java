package recursion;

import java.util.Arrays;
import java.util.Scanner;

class Recursion {
     public static void main(String[] args) {

         print1(1);
     }
     static void print1(int n){
         System.out.println(n);
         print2(2);

     }
     static void print2(int n){
         System.out.println(n);
         print3(3);

     }
     static void print3(int n){
         System.out.println(n);
         print4(4);

     }
     static void print4(int n){
         System.out.println(n);
         print5(5);

     }
     static void print5(int n){
         System.out.println(n);
         print6(6);

     }
     static void print6(int n){
         System.out.println(n);
                 
     }

}

// in recursion, it calls function itlef
class  recursion1{
    public static void main(String[] args) {
        print1(1);

    }
    static void print1(int n ){
        if (n == 6 ){
            System.out.println(6);
            return;
        }

        System.out.println(n);
        print1(n+1);
    }
}

//factorial using recursion
//it calls the function multiple times until it meets the base condition
class factorial1{
    public static void main(String[] args) {
        int ans= find(5);
        System.out.println(ans);
    }
     static int find(int n ){
        if (n ==1 || n== 0){
            return 1;
        }
        else {
            return n * find(n-1);
        }
    }
}
//fibonacci numbers using recursion
//it checks in the form of binary tree
class fibonnacci{
    public static void main(String[] args) {
        int n = 50;
            System.out.println(find1(n));
    }
    static int find1 (int n ){
            if (n <= 1) {
                return n;
            }
            else {
                return find1(n - 1) + find1(n - 2);
            }
    }
}

//binary search using recursion
class BinarySearchRecursion{
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6};
        int target = 6;
        int start= 0;
        int end =arr.length-1;
        int ans =find(arr,target,start,end);
        System.out.println(ans);

    }
    static  int find(int arr [], int target,int s,int e){
        if (s>e){
            return -1;
        }
        int middle =s +(e-s)/2;

        if (arr[middle] == target){
            return middle;
        }
        if(target< arr[middle]){
            return find(arr,target,s,middle-1);
        }

            return find(arr,target,middle+1,e);





    }

}

//check the area of triangle
class triangle {
    public static void main(String[] args) {
        int a = 6 ;
        int b = 5 ;
        int c = 6;
        find(a,b,c);
    }
    static void  find(int a,int b , int c ){
        if (b == a && b==c  ){
            System.out.println("equlateral trangle");
        }
        else if (a==b || a==c || b==c) {

        System.out.println("isocles triangle");

        }
        else{
            System.out.println("scalane triangle");
        }
    }
}

//maths tables
class n{
    public static void main(String[] args) {
        int n = 2;
        for (int i = 1; i < 11; i++) {
            System.out.println( n +"*"+ i +"="+ n*i );

        }

    }

}



 class Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of queries
        int queries = scanner.nextInt();

        // Loop through each query
        for (int q = 0; q < queries; q++) {
            // Read a, b, and n
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            // Initialize the series and compute terms
            int sum = a;
            for (int i = 0; i < n; i++) {
                sum += Math.pow(2, i) * b;
                System.out.print(sum + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

//to take the no of elements
class ans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lineNumber = 1;

        // Read lines until EOF
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }

        scanner.close();
    }
}


