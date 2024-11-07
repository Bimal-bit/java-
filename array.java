//ARRAYS


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//ARRAYS
class array {
    public static void main(String[] args) {

        //input using specfic index and data
        int[] arr = new int[5];
        arr[0] = 11;
        arr[1] = 15;
        arr[2] = 14;
        arr[3] = 18;
        arr[4] = 19;
        System.out.println(arr[4]);
    }
}

//1D INPUT ARRAY
class inarr{
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("enter no the elements ");
        int n = o.nextInt();
        int[] a =new int[n];
        System.out.println("enter  the elements ");
        for (int i =0;i<n;i++){
            a[i]= o.nextInt();
        }
        for (int i :a){

            System.out.println(i);
        }
    }
}

//PRINT IN TO STRING
class toarr{
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("enter no the elements ");
        int n = o.nextInt();
        int[] a =new int[n];
        System.out.println("enter  the elements ");
        for (int i =0;i<n;i++){
            a[i]= o.nextInt();
        }


        System.out.println(Arrays.toString(a));

    }
}

//STRING ARRAY
class strarr{
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("enter the elemenets");
        int n = o.nextInt();
        String []str = new String[n];
        System.out.println("enter the name");
        for (int i = 0;i<n;i++){
            str [i] = o.next();

        }
        System.out.println(Arrays.toString(str));
    }
}

//2D ARRAY
class array2d{
    public static void main(String[] args) {
        int [][] a= {{1,2},{3,4,5},{1,2,5,6}};
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length; j++) {
                System.out.print(a[i][j] +" ");

            }
            System.out.println();
        }
    }
}

//INPUT 2D ARRAY

class inputarray{
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("enter the row or column");
        int [] [] arr = new int [3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=o.nextInt();

            }

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(Arrays.toString(arr)+"");
            }
            System.out.println();
        }
    }
}

//ENAHANCED FOR LOOP
class enhancedForloop {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("enter the row or column");
        int[][] arr = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = o.nextInt();

            }

        }
//        for (int i = 0; i < arr.length; i++) {
//
//            System.out.println(Arrays.toString(arr[i]));
        for (int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}

//ARRAY LIST
class arraylist{
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        System.out.println(l);
        l.set(0,11);
        l.remove(2);
        l.get(0);
        System.out.println(l);

        for (int i = 0; i < 5; i++) {
            l.add(o.nextInt()) ;
        }
        System.out.println(l);


    }

}


//INPUT ARRAY List
class arrlist{
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            l.add(new ArrayList<>());

            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    l.get(i).add(o.nextInt());


                }

            }
            System.out.println(l);

        }
    }
}


//SWAPPING ARRAY
class swaping{
    public static void main(String[] args) {
        int [] arr = {10 ,20,30,40,50};
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int []arr,int i,int n){
        int temp=arr[i];
        arr[i]=arr[n];
        arr[n]=temp;

    }
}

//FIND MAX ARRAY

class arrmax{
    public static void main(String[] args) {
        int [] arr = {10 ,20,30,40,50};

        System.out.println(amx(arr,arr.length-1));
    }
    static int amx(int []arr,int s){
        int maxval=arr[0];

        for (int i = 0; i <=arr.length-1; i++) {
            if(arr[i]>maxval){
                maxval=arr[i];
            }

        }
        return maxval;

    }
}

//REVERSE ARRAY

class reverseingarr{
    public static void main(String[] args) {
        int [] arr = {10 ,20,30,40,50};
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void rev(int [] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int []arr,int i,int n){
        int temp=arr[i];
        arr[i]=arr[n];
        arr[n]=temp;

    }
}
