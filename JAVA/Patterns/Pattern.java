package Patterns;

//Pattern1
//    *****
//    *****
//    *****
//    *****
//    *****

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