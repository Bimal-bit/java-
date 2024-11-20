package Patterns;

//Pattern1
//    *****
//    *****
//    *****
//    *****
//    *****

import java.util.Arrays;

class Pattern1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}

//Pattern2
//    *
//    **
//    ***
//    ****
//    *****
class Pattern2{
    public static void main(String[] args) {
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <=i; j++) {
                    System.out.print("* ");

                }
                System.out.println();

            }
        }
    }

//Pattern3
//    *****
//    ****
//    ***
//    **
//    *

class Pattern3{
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = 5; j >i; j--) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}

//Pattern4
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5


class Pattern4{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");

            }
            System.out.println();

        }
    }
}

//Pattern5
//    *
//    **
//    ***
//    ****
//    *****
//    ****
//    ***
//    **
//    *


class Pattern5{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >i; j--) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }
}


//Pattern6
//         *
//        **
//       ***
//      ****
//     *****


class Pattern6 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


//Pattern7
//    *****
//    ****
//    ***
//    **
//    *

class Pattern7 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


//Pattern8
//        *
//       ***
//      *****
//     *******
//    *********

class Pattern8 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//Pattern9
//    *********
//     *******
//      *****
//       ***
//        *

class Pattern9 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >=1 ; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


//1652. Defuse the Bomb
class decrept {
    public static void main(String[] args) {
        int arr [] = {2,4,9,3};
        int k =-2;
        int [ ]ans= find(arr,k);
        System.out.println(Arrays.toString(ans));
    }
    static int []find(int []code,int k){
        int n = code.length;
        int result []= new int [n];
        if (k==0){
            return result;
        }
        for (int i = 0; i < code.length; i++) {
            if(k>0 ){
                for (int j =i+1 ; j <i+1+k ; j++) {
                    result[i]+=code[j%n];

                    
                }

            }
            else {
                for (int j = i-Math.abs(k); j <i ; j++) {
                    result[i]+=code[(j+n)%n];

                }
            }
            
        }
        return result;
    } 
}

//80. Remove Duplicates from Sorted Array II


class Remove {
    public static void main(String[] args) {
        int []nums = {0,0,1,1,1,1,2,3,3};
        int ans = find(nums);
        System.out.println(ans);

    }
    static int find (int [] nums){
        int n = nums.length;
        if(n <=2 ){
            return n;

        }
        int j=2;
        for (int i = 2; i <n ; i++) {
            if (nums[i]!=nums[j-2]){
                nums[j]=nums[i];
                j++;
            }

        }
        return j;

    }
}