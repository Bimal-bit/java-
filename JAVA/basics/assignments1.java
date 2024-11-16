import java.util.Scanner;

class even_odd {

    public static void main(String[] args) {
        System.out.println("enter the number ");
        Scanner o = new Scanner(System.in);
        int n = o.nextInt();
        if (n % 2 == 0) {
            System.out.println("" + n + " is  a even number ");
        } else {
            System.out.println("" + n + " is a odd no");
        }

    }
}

class hello{
    public static void main(String[] args) {
        System.out.println("enter the name");
        Scanner o = new Scanner(System.in);
        String name = o.nextLine();
        System.out.println("hello "+name);
    }
}

class simple_intrest{
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("enter the principle");
        float p = o.nextFloat();
        System.out.println("enter the time in years");
        float t = o.nextFloat();
        System.out.println("enter the rate of intrest in annum");
        float r = o.nextFloat();
        float SI=(p*t*r)/100;
        System.out.println("simple intrest is :"+SI);
    }
}


class operator{
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("enter two number");
        int a= o.nextInt();
        char op = o.next().charAt(0);
        int b= o.nextInt();
        switch (op) {
            case '+' -> {
                int add = a + b;
                System.out.println("addition is add: " + add);
            }
            case '-' -> {
                int sub = a - b;
                System.out.println("subtraction is : " + sub);
            }
            case '*' -> {
                int mul = a * b;
                System.out.println("multiplication is : " + mul);
            }
            case '/' -> {
                if (a != 0) {
                    int div = a / b;
                    System.out.println("divison is : " + div);
                } else {
                    System.out.println("zero division error");
                }
            }
            default -> System.out.println("invalid input");
        }

    }
}

class largest  {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("enter theree numbers");
        int a = o.nextInt();
        int b = o.nextInt();
        int c = o.nextInt();
        int largest = (a>=b)?(a>=c?a:c):(b>=c?b:c);
        System.out.println(largest +" is the largest ");


    }
}
class usd{
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("enter the rupees");
        float rs = o.nextInt();
        float rate  = 84.0f;
        float currency =  rs/rate;
        System.out.println("the rs in usd is "+ currency);

    }
}

class fibanocci{
    public static void main(String[] args) {

        System.out.println("enter the no of terms ");
        Scanner o = new Scanner(System.in);
        int n = o.nextInt();
        int first=0,second=1;
        System.out.print("the fibanocci numbers are "+first+", "+second);
        for (int i =2;i<=n;i++) {
            int  next = first + second;
            System.out.print(", " +next);
            first=second;
            second=next;
        }

        }
    }
 class  palindrome {
     public static void main(String[] args) {
         Scanner o = new Scanner(System.in);
         System.out.println("enter the string");
         String str = o.nextLine();
         boolean flag = true;
         for (int i = 0; i < str.length() / 2; i++) {
             if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                 flag = false;
                 break;
             }
         }
         if (flag) {
             System.out.println("is palindrome ");
         } else {
             System.out.println("not palindrome");
         }
     }

 }


 class amstrong{
     public static void main(String[] args) {

         Scanner o = new Scanner(System.in);
         System.out.println("enter the num1");
         int num1 = o.nextInt();
         System.out.println("enter the num2");
         int num2 = o.nextInt();
         for (int i = num1; i < num2; i++) {
             int choice, rem, sum = 0;
             choice = i;
             while (choice!=0){
             rem = choice % 10;
             sum = sum + (rem * rem * rem);
             choice = choice / 10;

         }
         if (sum == i) {
             System.out.println(i + " is the amstrong number");
         }
     }
     }
 }

 class max{
     public static void main(String[] args) {
         System.out.println("enter three numberes");
         Scanner o = new Scanner(System.in);
         int a = o.nextInt();
         int b = o.nextInt();
         int c = o.nextInt();

         int max = a;
         if (b>max){
             max =b;

         }
          if (c>max){
             max=c;
         }
         System.out.println(max);

     }
 }
 class case_check {
     public static void main(String[] args) {
         Scanner o = new Scanner(System.in);
         System.out.println("enter a letter");
         char a = o.next().charAt(0);
         if (a >= 'a' && a <= 'z') {
             System.out.println("lower case");
         } else {
             System.out.println("upper case");
         }
     }
 }

 class reverse{
     public static void main(String[] args) {
         System.out.println("enter the numberes");
         Scanner o = new Scanner(System.in);
         int a = o.nextInt();
         int ans= 0;
         while(a>0){
             int rem =a%10;
             a/=10;
             ans=ans*10+rem;
         }
             System.out.println(ans);

         }
     }
