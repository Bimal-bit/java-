import java.util.Scanner;
class Arofcircle {
    public static void main(String[] args) {
        Scanner o= new Scanner(System.in);
        System.out.println("enter the radius");
        double radius= o.nextDouble();
        double area = Math.PI*radius*radius;
        System.out.println(area);

    }
}

class Aroftriangle {
    public static void main(String[] args) {
        Scanner o= new Scanner(System.in);
        System.out.println("enter the base");
        double base = o.nextDouble();
        System.out.println("enter the height");
        double height= o.nextDouble();
        double area = (0.5)*base*height;
        System.out.println(area);

    }
}


class SubtractProductAndSum {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("enter the num ");
        int num =o.nextInt();
        int sum =0,product=1;
        while (num!=0){
            int digit =num%10;
            sum+=digit;
            product*=digit;
            num/=10;

        }
        int result = sum- product;
        System.out.println("the sum and product of digit is"+result);

    }
}


 class FactorsOfNumber {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number: ");
         int number = sc.nextInt();
         System.out.println("Factors of " + number + " are: ");

         for (int i = 1; i <= number; i++) {
             if(number%i==0){
                 System.out.print(i+" ");
             }
         }
     }
 }