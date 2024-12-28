package Maths;

import java.util.ArrayList;
import java.util.Arrays;

class Maths1 {
    public static void main(String[] args) {
        int n = 10;
        // Loop through numbers from 1 to n-1
        for (int i = 1; i <=n; i++) {
            // Print the number and whether it is prime
            System.out.println(i + " " + find(i));
        }
    }
    // Function to determine if a number is prime
    static boolean find(int n) {
        // Numbers less than or equal to 1 are not prime
        if (n <= 1) {
            return false;
        }
        int c = 2; // Start checking divisors from 2
        // Check divisors up to the square root of n
        while (c * c <= n) {
            // If n is divisible by c, it is not prime
            if (n % c == 0) {
                return false;
            }
            c++; // Increment divisor
        }
        // If no divisors are found, n is prime
        return true;
    }
}




//This program implements the Sieve of Eratosthenes algorithm to find all prime numbers up to a given number n=40).
class Sieve {
    public static void main(String[] args) {
        int n = 40; // Define the range up to which we need to find prime numbers
        // Create a boolean array to track whether a number is prime
        // "false" indicates that the number is prime
        boolean[] prime = new boolean[n + 1];
        // Call the function to find primes using the Sieve of Eratosthenes algorithm
        find(n, prime);
    }
    // Function to implement the Sieve of Eratosthenes algorithm
    static void find(int n, boolean[] prime) {
        // Loop through numbers from 2 up to the square root of n
        for (int i = 2; i * i <= n; i++) {
            // If the number is marked as prime (false), mark its multiples as non-prime
            if (!prime[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    prime[j] = true; // Mark multiples of i as non-prime (true)
                }
            }
        }
        // Print all prime numbers in the range
        for (int i = 2; i <= n; i++) {
            if (!prime[i]) { // If the number is still marked as prime (false)
                System.out.println(i + " ");
            }
        }
    }
}



//normal sqrt
class squrtNo {
    public static void main(String[] args) {
        int n = 40;  // Number to find the square root of
        int p = 3;   // Number of decimal places for the precision
        double ans = find(n, p);  // Call the find function
        System.out.printf("%.3f", ans);  // Print the result with 3 decimal places
    }

    static double find(int n, int p) {
        int start = 0;
        int end = n;
        int mid;
        double root = 0.0;

        // Binary search to find the integer part of the square root
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (mid * mid == n) {
                return mid; // Perfect square root found
            } else if (mid * mid < n) {
                start = mid + 1;
                root = mid; // Keep track of the last mid value when mid*mid < n
            } else {
                end = mid - 1;
            }
        }

        double incre = 0.1;
        // Loop to calculate the fractional part up to p decimal places
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += incre;
            }
            root -= incre; // Step back one increment
            incre /= 10; // Decrease increment for the next decimal place
        }

        return root; // Return the result with precision
    }
}




//finding square root using newton raphson
class newtonRapson {
    public static void main(String[] args) {
        int n = 40;  // Number to find the square root of
        System.out.printf("%.3f", find(n));  // Call the find function and print the result with 3 decimal places
    }
    // Function to find the square root using Newton-Raphson method
    static double find(int n) {
        double x = n;  // Initial guess
        double root;
        while (true) {  // Loop until the desired precision is achieved
            // Calculate the next approximation of the root
            root = 0.5 * (x + (n / x));
            // Check if the absolute difference between current root and previous guess is within the desired precision
            if (Math.abs(root - x) < 0.5) {
                break;  // If within precision, exit the loop
            }
            x = root;  // Update the guess for the next iteration
        }
        return root;  // Return the calculated root
    }
}



//to find factors
class Factors {
    public static void main(String[] args) {
        int n = 40;  // Number to find the factors of
        find(n);  // Call the function to find all factors using method 1
        find2(n);  // Call the optimized function to find all factors using method 2
        find3(n);  // Call the optimized function with proper handling of factors
    }
    // Function to find all factors of a number
    static void find(int n) {
        System.out.println("Factors of " + n + " using method 1:");
        for (int i = 1; i <= n; i++) {  // Loop from 1 to n
            if (n % i == 0) {  // Check if i is a factor of n
                System.out.print(i + " ");  // Print the factor
            }
        }
        System.out.println();  // Move to the next line after printing all factors
    }
    // Optimized function to find all factors of a number
    static void find2(int n) {
        System.out.println("Factors of " + n + " using method 2:");
        for (int i = 1; i <= Math.sqrt(n); i++) {  // Loop from 1 to square root of n
            if (n % i == 0) {  // Check if i is a factor of n
                if (n / i == i) {  // Check if both divisors are the same
                    System.out.print(i + " ");  // Print the factor only once
                } else {
                    System.out.print(i + " " + n / i + " ");  // Print both factors
                }
            }
        }
        System.out.println();  // Move to the next line after printing all factors
    }
    // Another optimized function to find all factors of a number
    static void find3(int n) {
        System.out.println("Factors of " + n + " using method 3:");
        ArrayList<Integer> list = new ArrayList<>();  // Create a list to store factors greater than sqrt(n)
        for (int i = 1; i <= Math.sqrt(n); i++) {  // Loop from 1 to square root of n
            if (n % i == 0) {  // Check if i is a factor of n
                if (n / i == i) {  // Check if both divisors are the same
                    System.out.print(i + " ");  // Print the factor only once
                } else {
                    System.out.print(i + " ");  // Print the smaller factor
                    list.add(n / i);  // Add the larger factor to the list
                }
            }
        }
        // Print the factors stored in the list
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();  // Move to the next line after printing all factors
    }
}


//to find gcd
class GCD {
    public static void main(String[] args) {
        int a = 4;  // First number
        int b = 8;  // Second number
        System.out.println(find(a, b));  // Call the find function to compute GCD and print the result
    }
    // Function to find the GCD (Greatest Common Divisor) of two numbers using the Euclidean algorithm
    static int find(int a, int b) {
        if (a == 0) {  // Base case: if a is 0, return b as the GCD
            return b;
        }
        return find(b % a, a);  // Recursive call with b % a and a
    }
}


//to find lcm
class LCM {
    public static void main(String[] args) {
        int a = 2;  // First number
        int b = 7;  // Second number

        // Calculate LCM using the formula LCM(a, b) = (a * b) / GCD(a, b)
        int ans = (a * b) / find(a, b);

        // Print the result
        System.out.println("LCM of " + a + " and " + b + " is: " + ans);
    }
    // Function to find the GCD (Greatest Common Divisor) of two numbers using the Euclidean algorithm
    static int find(int a, int b) {
        // Base case: if a is 0, return b as the GCD
        if (a == 0) {
            return b;
        }
        // Recursive call: GCD(b % a, a)
        return find(b % a, a);
    }
}



class sort {
    public static void main(String[] args) {
        int []arr ={1,9,8,3,10,5};
        System.out.println(find(arr));
    }
    static  double find(int[] arr){
        int start =0;
        int end =arr.length-1;
        Arrays.sort(arr);
        double avg =arr[start];
        while (start<=end){
             avg = Math.min((arr[start++] + arr[end--]) / 2.0,avg);

        }
        return avg;

    }
}