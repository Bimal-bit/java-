import java.util.Arrays;

//its more like bubble sort

class InsertionSortOrBubbleSort {
    public static void main(String[] args) {
        int arr []={3,4,1,5,2};
         find(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void find (int arr[]){
        boolean flag;
        for (int i = 0; i < arr.length-1; i++) {
                flag=false;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    flag=true;
                }

            }

        if (!flag){
            break;
        }

        }
    }
    
}


//OR
//you can try this method for insertion Sort


class InsertionSort {
    public static void main(String[] args) {
        int arr []={3,4,1,5,2};
        find(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void find (int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    Swap(arr,j,j-1);
                }else {
                    break;
                }

            }
        }

        }

     static void Swap(int[] arr, int j, int i) {
         for (int k = 0; k < arr.length; k++) {
             int temp = arr[j];
             arr[j]=arr[i];
             arr[i]=temp;

         }
    }
}
