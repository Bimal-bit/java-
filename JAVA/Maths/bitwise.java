package Maths;
//The bitwise AND operation with 1 (0001 in binary) isolates the least significant bit of n.
//If the least significant bit is 1, the number is odd. If it is 0, the number is even.
//Bitwise operations offer a powerful way to perform low-level data manipulation efficiently. They are essential tools in many areas of computer science and engineering.
//Let's consider n = 61:
//The binary representation of 61 is 111101.
//The binary representation of 1 is 000001.
//Performing 61 & 1:
//111101
//& 000001
//--------
//  000001
//The result is 1, which means the least significant bit is 1, indicating that 61 is an odd number.
 class oddOrEven1 {
     public static void main(String[] args) {
    int n = 61 ;
         if (isOdd(n)==true){
             System.out.println("odd");
         }
         else {
             System.out.println("even");
         }


     }

      static boolean isOdd(int n) {
         return ((n&1) ==1);
     }
 }

