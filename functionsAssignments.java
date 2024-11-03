import java.util.Scanner;
class MAXandMIN {
     public static void main(String[] args) {
         Scanner o = new Scanner(System.in);
         System.out.println("enter first number");
         int a = o.nextInt();
         System.out.println("enter second number");
         int b = o.nextInt();
         System.out.println("enter third number");
         int c = o.nextInt();
         int maximum=max(a,b,c);
         int minimum =min(a,b,c);
         System.out.println("the max in  "+ a + b + c+" is " +maximum);
         System.out.println("the min in  "+ a + b + c+" is " +minimum);

     }

     static int max (int a , int b , int c){
         int max=a;
         if (b>a){
              max=b;


         }
         if (c>b){
             max=c;
         }
         return max;
     }
    static int min (int a , int b , int c){
        int min=a;
        if (b<a){
            min=b;


        }
        if (c<b){
            min=c;
        }
        return min;
    }
}



class evenORodd{
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("enter the last no ");
        int n=o.nextInt();
        System.out.println(oddoreve(n));

    }
    static String oddoreve( int n){

            if (  n%2==0) {
                return "even";

            }

            else {
                return "odd";
            }
        }

    }

class evenorodd{
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("enter the last no ");
        int n=o.nextInt();
        oddoreve(n);
    }
    static void oddoreve(int n){
            System.out.println("the even no are ");
        for (int i = 1; i <=n ; i++) {

            if (i % 2 == 0 ) {
                System.out.println(i);
            }
        }

        System.out.println("\nthe odd no are ");
            for (int i = 1; i <=n; i++) {
            if (i%2!=0){

                System.out.println(i);
            }
        }
    }

}


class vote {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("enter the age");
        int n=o.nextInt();
        age(n);

    }
    static void age(int n){
        if(n<=18){
            System.out.println("eligible");
        }
        else {
            System.out.println("not eligible");
        }
    }
}


//FACTORIAL

class factorial{
    public static void main(String[] args) {
        Scanner o  = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = o.nextInt();
        System.out.println("the factorial is :"+fact(n));

    }
    static int fact(int n){
        if (n==0)
            return  1;
        else
            return (n*fact(n-1));
    }
}



//PRIME NO
class  PRIMENO{
    public static void main(String[] args) {
        Scanner o = new Scanner((System.in));
        System.out.println( "enter the no ");
        int n = o . nextInt();
        if(prime(n)){
            System.out.println(n+" is a prime no ");

        }
        else {
            System.out.println(n+" is not prime");
        }

    }
    static boolean prime (int n ){
        if (n<1)
            return false;
        for (int i = 2; i < n/2; i++) {
            if (n%i==0){
                return  false;

            }


        }
        return  true;
    }

}

//marks
class marks {

    public static void main(String[] args) {

        Scanner o = new Scanner(System.in);
        int sub=0;
        System.out.println("enter the name ");
        String name = o.nextLine();
        System.out.println("enter the id ");
        int id = o.nextInt();
        System.out.println("enter three sub marks");
        for (int i = 0; i < 3; i++) {
             sub += o.nextInt();

        }
        int percentage =((sub*100)/(100*3));
             System.out.println("your grade is "+mark(percentage));


    }
    static char mark(int percentage){

        switch (percentage/10){
            case 10:
                return 'A';
            case 9:
                return 'B';
            case 8:
                return 'C';
            default:
                return 'D';

        }
    }
}