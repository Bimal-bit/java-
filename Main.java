import java.util.Arrays;
import java.util.Scanner;
//DATA TYPES
class input{
    public static void main(String[] args) {
        System.out.println("hello world!");
        Scanner o = new Scanner(System.in);
        int a =o.nextInt();
        float b =o.nextFloat();
        double c = o.nextDouble();
        long d=o.nextLong();
        boolean e = o.nextBoolean();
        String n = o.nextLine();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(n);

    }
}
class data_types{
    public static void main(String[] args) {
        int integer= 100;
        char letter ='A';
        float decimal = 100.03f;
        double large_decimal=1656464.6654D;
        long large_integer=144364644443L;
        boolean check =true;
        boolean check1 =false;
        System.out.println(integer);
        System.out.println(letter);
        System.out.println(large_decimal);
        System.out.println(decimal);
        System.out.println(large_integer);
        System.out.println(check);
        System.out.println(check1);
    }
}


class sum{
    public static void main(String[] args) {
        System.out.println("enter teo numbers");
        Scanner o = new Scanner(System.in);
        int a = o.nextInt();
        int b = o.nextInt();
        System.out.println(a+b);

    }
}

class type_casting {
    public static void main(String[] args) {
        byte b =11;
        short s = 123;
        char c='a';
        int  a = 1011;
        long l= 15665654464L;
        float f= 132.4645f;
        double d = 100.546464644d;

        System.out.println(b);
        System.out.println(s);
        System.out.println(l);
        System.out.println(c+f);
        System.out.println(a+b);
        System.out.println(f+c);
        System.out.println(d+a);

    }
}

class temprature {
    public static void main(String[] args) {
        Scanner o = new Scanner (System.in);
        System.out.println("enter the temp");
        float a = o.nextFloat();
        float b= (a*9/5)+32;
        System.out.println(b);
    }
}
//LOOP
class whil{
    public static void main(String[] args) {
        int num =1;
        while (num<=5){
            System.out.println(num);
            num++;
        }
    }

}
//SWITCH
class day{
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("enter the days ");
        int day = o.nextInt();
        switch (day){
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
            default -> System.out.println("invalid");
        }
    }
}

class days {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("enter the days ");
        int day = o.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("weekday");
            case 6, 7 -> System.out.println("weekend");
        }
    }
}

class employee {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("enter the details ");
        int empId = o.nextInt();
        String department = o.next();
        switch (empId) {
            case 1:
                System.out.println("bimal");
                break;
            case 2:
                System.out.println("xyz");
                break;
            case 3:
                System.out.println("enter the num");
                switch (department) {
                    case "it" -> System.out.println("it department");
                    case "man" -> System.out.println("management");
                    default -> System.out.println("no department");
                }
                break;
            default:
                System.out.println("invalid");
        }
    }
}
//FUNCTIONS

class greet{
    public static void main(String[] args) {
        String hi = greeting();
        System.out.println(hi);
    }
    static String greeting(){
        String msg = "how are you ";
        return msg;

    }
}
class name{
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("enter the name ");
        String name = o.nextLine();
        String greet =hi(name);
        System.out.println(greet);


    }
    static String hi(String name){
        String msg = "hello" +name;
        return msg;
    }
}


class swap{
    public static void main(String[] args) {
        int a= 10 ;
        int b =20;
        sap(a,b);
        System.out.println(a +" "+b);
    }

    static void sap(int num1, int num2) {
        int temp = num1;
        num1=num2;
        num2=temp;


    }
}

class block_scope{
    public static void main(String[] args) {
        int a = 10 ;
        int b = 30 ;
        {
            a=30;
            System.out.println(a);
        }
        System.out.println(a);
        for (int i =0;i<5;i++){
            System.out.println(i);
        }


    }
}

class shadowing{
    static int x=100;
    public static void main(String[] args) {
        System.out.println(x);
        int x= 10;
        System.out.println(x);
        System.out.println(x);

        shadow();
    }static void shadow (){
        System.out.println(x);
    }
}


//VARIABLE LENGTH ARGUMENTS

class varargs{
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7);
        mix(10,20.2f,'a',"bimal","hi ","hello");
    }
    static void mix(int a ,float b,char c,String...s){
        System.out.println(Arrays.toString(s));
    }
    static void fun(int ...a){
        System.out.println(Arrays.toString(a));
    }
}


//OVERLOADING

class overloading {
    public static void main(String[] args) {
        a(10);

        int sum = a(10,20,30);
        System.out.println(sum);
        a("bimal");
    }

    static int a(int a) {
        System.out.println(a);
        return a;
    }

    static int a(int a, int b,int c) {
        return a+b+c;
    }
    static String a(String a){
        System.out.println(a);
        return a;
    }
}
//PRIME NO
class prime {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("enter the num");
        int n= o.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }

    static boolean isPrime(int n) {
        if (n<1){
            return false;
        }
        int c=2;
        while (c*c<=n){
            if (n%c==0){
                return false;
            }
            c++;
        }return c*c>n;
    }
}

