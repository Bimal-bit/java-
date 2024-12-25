package recursion;

class Level1 {
    public static void main(String[] args) {
        search(5);  // Call the search function with n = 5
    }

    // Recursive function to search and print numbers from 1 to n
    static void search(int n) {
        if (n == 0) {  // Base case: if n is 0, return from the function
            return;
        }
        search(n - 1);  // Recursive call with n - 1
        System.out.println(n);  // Print the current value of n after the recursive call
    }
}


class Fact {
    // The main method is the entry point of the program
    public static void main(String[] args) {
        // Call the find method with the number 5 and print the result
        System.out.println(find(5));
    }

    // A recursive method to calculate the factorial of a given number
    static int find(int n) {
        // Base case: if n is less than or equal to 1, return 1
        if (n <= 1) {
            return 1;
        } else {
            // Recursive case: return n multiplied by the factorial of (n - 1)
            return n * find(n - 1);
        }
    }
}


class Sum {
    // The main method is the entry point of the program
    public static void main(String[] args) {
        // Call the find method with the number 1342 and print the result
        System.out.println(find(1342));
    }

    // A recursive method to calculate the sum of digits of a given number
    static int find(int n) {
        // Base case: if n is 0, return 0
        if (n == 0) {
            return 0;
        }
        // Recursive case: return the last digit (n % 10) plus the sum of the remaining digits
        return (n % 10) + find(n / 10);
    }
}


class product {
    // The main method is the entry point of the program
    public static void main(String[] args) {
        // Call the find method with the number 1342 and print the result
        System.out.println(find(1342));
    }

    // A recursive method to calculate the sum of digits of a given number
    static int find(int n) {
        // Base case: if n is 0, return 0
        if (n %10== n) {
            return n;
        }
        // Recursive case: return the last digit (n % 10) plus the product of the remaining digits
        return (n % 10) * find(n / 10);
    }
}

class increment {
    public static void main(String[] args) {
        search(5);  // Call the search function with n = 5
    }

    // Recursive function to search and print numbers from 1 to n
    static void search(int n) {
        if (n == 1) {  // Base case: if n is 0, return from the function
            return;
        }
        search(--n);  // Recursive call with --n
        System.out.println(n);  // Print the current value of n after the recursive call
    }
}


class ReverseNumber {

    public static void main(String[] args) {
        int number = 12345; // Example number to reverse
        int reversedNumber = reverse(number, 0);// Call the recursive method to reverse the number

        System.out.println("Reversed Number: " + reversedNumber); // Print the reversed number
    }

    // Recursive method to reverse a number
    public static int reverse(int number, int reversed) {
        if (number == 0) { // Base case: if the number is 0, return the reversed number
            return reversed;
        }
        // Recursive case: extract the last digit and add it to the reversed number
        return reverse(number / 10, reversed * 10 + number % 10);
    }
}



//without recursion

class amstrong{
    public static void main(String[] args) {
        int n = 1234;
            int remainder = 0, reverse = 0;
        while (n!=0) {
            remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n / 10;
        }
        System.out.println(reverse);
    }
}

class palindrome {

    public static void main(String[] args) {
        int number = 12321; // Example number to reverse
        int reversedNumber = reverse(number, 0);// Call the recursive method to reverse the number
        if (number==reversedNumber) {
            System.out.println("palindrome"); // Print the reversed number
        }
        else {
            System.out.println("not a palindrome");
        }
    }

    // Recursive method to reverse a number
    public static int reverse(int number, int reversed) {
        if (number == 0) { // Base case: if the number is 0, return the reversed number
            return reversed;
        }
        // Recursive case: extract the last digit and add it to the reversed number
        return reverse(number / 10, reversed * 10 + number % 10);
    }
}




class CountZero {
    public static void main(String[] args) {
        int number = 103050; // Example number to count zeros in
        System.out.println(count(number)); // Should output 2
    }

    // Method to count the number of zeros in the given number
    static int count(int number) {
        return helper(number, 0);
    }

    // Recursive helper method to count zeros
    static int helper(int number, int count) {
        if (number == 0) {
            return count; // Base case: return the count when number is fully processed
        }
        if (number % 10 == 0) {
            return helper(number / 10, count + 1); // Increment count if the last digit is zero
        }
        return helper(number / 10, count); // Continue with the next digit
    }
}



//1342. Number of Steps to Reduce a Number to Zero
class ReturnCount {
    public static void main(String[] args) {
        int num = 123; // Example number to find the count of operations
        System.out.println(find(num)); // Output the count of operations needed
    }

    // Method to find the count of operations to reduce the number to zero
    static int find(int n) {
        int count = 0; // Initialize the counter for operations
        while (n != 0) { // Continue until n becomes zero
            if (n % 2 == 0) { // Check if n is even
                n = n / 2; // If even, divide by 2
                count++; // Increment the count of operations
            } else {
                n = n - 1; // If odd, subtract 1
                count++; // Increment the count of operations
            }
        }
        return count; // Return the total count of operations
    }
}

//OR
//1342. Number of Steps to Reduce a Number to Zero

class CountZero1 {
    public static void main(String[] args) {
        int num = 123; // Example number to find the count of steps
        System.out.println(steps(num)); // Output the count of steps needed
    }

    // Method to find the count of steps to reduce the number to zero
    static int steps(int num) {
        return helper(num, 0); // Call helper method with initial count as 0
    }

    // Recursive helper method to count steps
    static int helper(int n, int c) {
        if (n == 0) { // Base case: if n is zero, return the count
            return c;
        }
        if (n % 2 == 0) { // Check if n is even
            return helper(n / 2, ++c); // If even, divide by 2 and increment count
        }
        return helper(n - 1, ++c); // If odd, subtract 1 and increment count
    }
}
