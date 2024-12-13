package Maths;
//The bitwise AND operation with 1 (0001 in binary) isolates the least significant bit of n.
//If the least significant bit is 1, the number is odd. If it is 0, the number is even.
//Bitwise operations offer a powerful way to perform low-level data manipulation efficiently. They are essential tools in many areas of computer science and engineering.
//Let's consider n = 61:
//The binary representation of 61 is 111101.
//The binary representation of 1 is 000001.
//Performing 61 & 1:
//  111101
//& 000001
//--------
//  000001
//The result is 1, which means the least significant bit is 1, indicating that 61 is an odd number.
 class oddOrEven1 {
     public static void main(String[] args) {
    int n = 61 ;

   boolean flag = (n&1) == 1; //you can use this technique to reduce steps
         System.out.println(flag);
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


// finding odd or even using AND operator
class arrayOddOrEven{
    public static void main(String[] args) {
        int arr[]={1,5,8,3,4,6,9};
        for (int i = 0; i < arr.length; i++) {
        int n = arr[i]&1;
        if (n==1){
            System.out.println("odd "+arr[i]);
        }
        else {
            System.out.println("even "+arr[i]);
        }

        }
    }
}

//XOR (exclusive OR) is a bitwise operation that follows these rules:
//0 ^ 0 = 0
//1 ^ 1 = 0
//0 ^ 1 = 1
//1 ^ 0 = 1
//Properties of XOR:
//Self-Cancellation: (a ^ a = 0) for any integer a.
//Identity: (a ^ 0 = a) for any integer a.
//Commutative and Associative: The order in which you apply XOR does not matter: a ^ b ^ c = c ^ b ^ a.
//it checks the value in binary
//it adds both values if both values are same it wil1 gives 0;
//else it adds both numbers in binary


class findUnique{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 3};
        System.out.println(unique(arr));
    }
     static int unique(int[] arr) {
        int ans = 0 ;
        for (int n: arr){
            ans^=n;
        }
    return ans;
    }
}
