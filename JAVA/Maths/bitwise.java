package Maths;


import java.util.Arrays;

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


//to find unique no which is not repeated three times
class findUnique1 {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 3, 2, 3, 3};
        System.out.println(unique(arr));
    }

    static int unique(int[] arr) {
        int ones = 0, twos = 0;
        for (int n : arr) {
            ones = (ones ^ n) & ~twos;
            twos = (twos ^ n) & ~ones;
        }
        return ones;
    }
}


//The goal of the magicNo program is to calculate a special number (referred to as a "magic number") based on the provided integer n. The magic number is determined using the powers of 5.
class magicNo {
    public static void main(String[] args) {
        int n = 5;
        int base = 5;
        int ans = 0;
        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }
        System.out.println(ans);
    }
}

//The program calculates the number of digits of an integer a in a given base b using logarithms.
//The formula
//(⌊log𝑏(𝑎)⌋+1)
//For
//a=356 and 𝑏 =10 ,the output is 3 because 356 has three digits in base 10.

class noOfDigits{
    public static void main(String[] args) {
        int a = 356;
        int b = 10;
        int c = (int)(Math.log(a)/Math.log(b))+1;
        System.out.println(c);
    }
}


//Sum of each row in Pascal's Triangle equals 2𝑛, wheren is the row index.
//The sum of the elements in the nth row is derived using:2𝑛−1, for then-th row starting at row index n=0.
class PascalRowSum {
    public static void main(String[] args) {
        System.out.print("Enter the row number (n): ");
        int n =5;
        // Sum of the nth row in Pascal's Triangle
        int sum = 1 << (n - 1); // Equivalent to 2^(n-1)
        System.out.println("The sum of row " + n + " is: " + sum);
    }
}


// ### **Why It Works**
//The check `(n & (n - 1)) == 0` works because:
//1. Powers of 2 have a single `1` in their binary representation.
//2. Subtracting `1` from a power of 2 flips all the lower bits, ensuring a **zero overlap** when performing bitwise AND.

//### **Key Points**
//1. This approach works for positive integers.
//2. **Edge Case**: If `n = 0`, the condition will not hold since `0` is not a power of 2.
//3. **Time Complexity**: \( O(1) \), as the operation involves a single bitwise AND.

//### **Summary**
//This program efficiently determines if a number `n` is a power of 2 using bitwise operations. For `n = 127`, the program correctly identifies that it is **not** a power of 2 and outputs `false`.

class _2thPower {
    public static void main(String[] args) {
        int n = 128; // The number we want to check if it's a power of 2
        // Check if n is a power of 2 using bitwise AND operation
        // (n & (n - 1)) removes the rightmost 1-bit from n.
        // If the result is 0, it means 'n' had only one 1-bit, making it a power of 2.
        boolean ans = (n & (n - 1)) == 0;

        // Print the result: true if n is a power of 2, false otherwise
        System.out.println(ans);
    }
}


//This program calculates base power
//  efficiently using Exponentiation by Squaring, a method that reduces the number of multiplications compared to naive repeated multiplication.

class power1 {
    public static void main(String[] args) {
        int base = 3;  // The base number (3 in this case)
        int power = 4; // The exponent (4 in this case)
        int ans = 1;   // Initialize the result variable to 1
        // Loop until the power becomes 0
        while (power > 0) {
            // Check if the current power is odd using bitwise AND with 1
            if ((power & 1) == 1) {
                ans *= base; // If odd, multiply the current base with ans
            }
            base *= base;  // Square the base for the next iteration
            power = power >> 1; // Right shift the power (divide it by 2)
        }
        // Print the final result
        System.out.println(ans);
    }
}


//The goal is to count the number of 1s (set bits) in the binary representation of the number.

class setBits {
    public static void main(String[] args) {
        int n = 16;  // The number whose set bits (1s in binary representation) we want to count
        int count = 0;  // Initialize the counter to store the number of set bits
        // Print the binary representation of the number for reference
        System.out.println(Integer.toBinaryString(n)); // Converts n to binary string and prints it
        // Loop until all bits of n have been processed
        while (n > 0) {
            // Check if the last bit (least significant bit) of n is 1
            if ((n & 1) == 1) {
                count++;  // Increment the counter if the last bit is 1
            }
            // Right shift n by 1 to process the next bit (divides n by 2)
            n = n >> 1;
        }
        // Print the total number of set bits in the binary representation of the original n
        System.out.println(count);
    }
}


//Instead of iterating through every number up to a and performing the XOR operation (which has 𝑂(𝑎) complexity), the mathematical shortcut based on a % 4 computes the result in O(1) time.
class XOR {
    public static void main(String[] args) {
        int a = 9;  // The number up to which we want to compute the XOR
        int ans;    // Variable to store the result
        // Compute XOR of all numbers from 0 to 'a' using properties of XOR
        // XOR of numbers from 0 to n follows a pattern based on n % 4:
        // If n % 4 == 0 → result is n
        // If n % 4 == 1 → result is 1
        // If n % 4 == 2 → result is n + 1
        // If n % 4 == 3 → result is 0
        if (a % 4 == 0) {
            ans = a; // If remainder is 0, result is the number itself
        } else if (a % 4 == 1) {
            ans = 1; // If remainder is 1, result is 1
        } else if (a % 4 == 2) {
            ans = a + 1; // If remainder is 2, result is the number + 1
        } else {
            ans = 0; // If remainder is 3, result is 0
        }
        // Print the result
        System.out.println(ans);
    }
}

//832. Flipping an Image

//Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
//To flip an image horizontally means that each row of the image is reversed.
//For example, flipping [1,1,0] horizontally results in [0,1,1].
//To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
//For example, inverting [0,1,1] results in [1,0,0]


class flipANImage {
    public static void main(String[] args) {
        // Input: 2D binary array representing the image
        int[][] arr = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        // Flip and invert the image
        int[][] ans = flip(arr);
        // Print the resulting 2D array after flipping and inverting
        for (int[] row : ans) {
            System.out.println(Arrays.toString(row)); // Print each row as a string
        }
    }
    /**
     * This function flips and inverts a 2D binary array.
     * Flipping: Reverses the order of elements in each row.
     * Inverting: Replaces each 1 with 0, and each 0 with 1.
     * @param arr The 2D binary array (image) to be processed.
     * @return The processed 2D binary array.
     */
    static int[][] flip(int[][] arr) {
        // Iterate over each row in the array
        for (int[] row : arr) {
            // Flip and invert each row
            for (int i = 0; i < (row.length + 1) / 2; i++) {
                // Flip: Swap the i-th and (length - i - 1)-th elements
                // Invert: XOR the elements with 1 to flip 1 <-> 0
                int temp = row[i] ^ 1; // Invert the current element
                row[i] = row[row.length - i - 1] ^ 1; // Invert and assign the swapped element
                row[row.length - i - 1] = temp; // Assign the inverted element to its new position
            }
        }
        return arr; // Return the flipped and inverted array
    }
}
