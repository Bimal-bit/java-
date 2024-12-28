package oops;

import java.util.Arrays;

class loop{
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <=5; j++) {
                i=i+5;

            System.out.println(i);
            }

        }
    }
}

class Fib {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.println("Fibonacci (" + i + ") using recursive method: " + ans1(i));
            System.out.println("Fibonacci (" + i + ") using Binet's formula: " + ans(i));
            System.out.println();
            double tn = 1.61803;
            double ans2 = Math.pow(tn, 8) / 2;
            System.out.println("Special calculation using the golden ratio: " + (int) ans2);
        }
    }

    static int ans(int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        double psi = (1 - Math.sqrt(5)) / 2;
        return (int)((Math.pow(phi, n) - Math.pow(psi, n)) / Math.sqrt(5));
    }

    static int ans1(int n) {
        if (n < 2) {
            return n;
        } else {
            return ans1(n - 1) + ans1(n - 2);
        }
    }
}


class Main {
    static void sort1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            while (i != arr[i]) {
                swap1(arr, i);
            }

        }
    }
        static void swap1( int []arr, int i){
            int temp = arr[i];
            arr[i] = arr[temp];
            arr[temp] = temp;
        }


    public static void main(String[] args) {
        int []arr={0,3,4,1,2};
        sort1(arr);
        System.out.println(Arrays.toString(arr));

    }

}