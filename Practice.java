import java.util.*;

class Result1 {
    public static void main(String[] args) {
        System.out.println("enter the  number of elements ");
        Scanner o = new Scanner(System.in);
        int n = o.nextInt();
        fizzBuzz(n);


    }

    static void fizzBuzz(int n) {
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            if (i % 3 == 0 ) {
                System.out.println("Fizz");
            }
            if (i % 5 == 0 ) {
                System.out.println("Buzz");
            }

            else {
                System.out.println(i);
            }


            // Write your code here

        }


    }
}




class Result {

    public static List<String> possibleChanges(List<String> usernames) {
        List<String> result = new ArrayList<>();

        for (String username : usernames) {
            boolean canChange = false;
            char minRightChar = username.charAt(username.length() - 1);

            // Iterate from right to left to find if any left character is greater than any right character
            for (int i = username.length() - 2; i >= 0; i--) {
                if (username.charAt(i) > minRightChar) {
                    canChange = true;
                    break;
                }
                minRightChar = (char) Math.min(minRightChar, username.charAt(i));
            }

            // Add "YES" or "NO" based on the check
            result.add(canChange ? "YES" : "NO");
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> usernames = Arrays.asList("abc", "cba", "fed");
        List<String> result = possibleChanges(usernames);

        for (String res : result) {
            System.out.println(res);
        }
    }
}



class Result2 {

    public static int nearlySimilarRectangles(List<List<Long>> sides) {
        Map<Double, Integer> ratioCount = new HashMap<>();
        int pairs = 0;

        for (List<Long> side : sides) {
            // Calculate the ratio of the rectangle as a double
            double ratio = (double) side.get(0) / side.get(1);

            // If this ratio already exists in the map, count pairs
            if (ratioCount.containsKey(ratio)) {
                pairs += ratioCount.get(ratio);
            }

            // Update the count of this ratio in the map
            ratioCount.put(ratio, ratioCount.getOrDefault(ratio, 0) + 1);
        }

        return pairs;
}
}


class add {
    public static void main(String[] args) {
        int arr[] = { 6, 2, 1, 8, 10 };
        int maximum = max(arr);


        System.out.println(maximum);


    }

    static int max(int numbers[]) {
        int ans1 = numbers[0];
        int ans2 = numbers[0];
        int sum =0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > ans1) {
                ans1 = numbers[i];


            }

            if (numbers[i] < ans2) {
                ans2 = numbers[i];


            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]!=ans1 && numbers[i]!=ans2 ){
                sum+=numbers[i];

        }



        }
        return sum;
    }
}



