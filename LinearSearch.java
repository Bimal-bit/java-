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



//new code
class serach1 {
    public static void main(String[] args) {
        int arr []={10,2,66,88,44,85,42};
        int target = 44;
        int ans=ls1(arr,target);
        System.out.println(ans);
    }
}

static int ls1(int []arr,int target){
    if(arr.length==0){
        return  -1;
    }
    for (int i = 0; i < arr.length; i++) {
        int element = arr[i];
        if (element==target){
            return i;

        }
        else {
            System.out.println("wrong input");


    }
}