public class LinearSearch {
    public static void main(String[] args) {
        int count =0;
        int arr [] = {11,22,56,58,44,55};
        for (int i = 0; i < arr.length; i++) {
            if (arr [i]==58){
                count=i;
                break;

            }

        }
            System.out.println("your value found at index"+ count);


    }
}

