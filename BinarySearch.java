class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {11, 12, 13, 14, 15, 16, 17, 18, 19};
        int target = 18;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target < arr[middle]) {
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }

        return -1;
    }
}


//
class OrderDiagnosticBinarySearch {
    public static void main(String[] args) {
        int arr[] = {11, 12, 13, 14, 15, 16, 17, 18, 19};
        int target = 18;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isasc=arr[start] < arr[end];
        System.out.println(isasc);

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target < arr[middle]) {
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }

        return -1;
    }
}

//ceiling of a number
//Smallest number greater than equal to target
class CeilingOfNumber {
    public static void main(String[] args) {
        int arr[] = {11, 12, 13, 14, 16, 17};
        int target =18 ;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int arr[], int target) {
        if(target>arr.length-1){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target < arr[middle]) {
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }

        return start;
    }
}

// reverse ceiling of a number
//Smallest number lesser than equal to target

class RverseCeilingOfNumber {
    public static void main(String[] args) {
        int arr[] = {9,11, 12, 13, 14, 16, 17};
        int target =8 ;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int arr[], int target) {
        if(target<0){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target < arr[middle]) {
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }

        return end;
    }
}

//744. Find Smallest Letter Greater Than Target

class nextGreatestLetter{
    public static void main(String[] args) {
        char arr[] = {'c','d','f','j'};
        char target = 'j';
        char ans = search(arr, target);
        System.out.println(ans);
    }

    static char search(char arr[], char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target < arr[middle]) {
                end = middle - 1;
            } else  {
                start = middle + 1;
            }
        }

        return arr[start % arr.length];
    }
}
