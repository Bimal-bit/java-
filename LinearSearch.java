public class LinearSearch {
    public static void main(String[] args) {
           int count =0;
           int arr []={11,33,66,99,44,55,61};
        for (int i = 0; i < arr.length; i++) {
            count=i;
            if (arr[i]==55){
                break;
            }

        }
        System.out.println("the value found at "+ count);
    }
}
