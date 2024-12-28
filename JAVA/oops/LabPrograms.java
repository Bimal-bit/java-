package basics;

import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num ,reversed = 0;

        while (num!=0){
            int digit = num%10;
            reversed = reversed*10 +digit;
            num/=10;
        }
        if (original==reversed){
            System.out.println("is palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }
    }
}

class factiorial{
    static int ans(int n){
        if (n ==1||n==0){
            return  1;
        }
        else {
            return n*ans(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ans(n));
    }
}

class largeAndSmall{
    public static void main(String[] args) {
        int []arr = {1,10,11,56,88,26};
        int max =arr[0];
        int min =arr[0];
        for(int ans : arr){
            if(ans>max){
                max = ans;
            }
            if (ans<min){
                min=ans;

            }

        }
        System.out.println("max"+max);
        System.out.println("min"+min);
    }
}

class vowelcounter{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int vowels = 0,consonents=0;
        for (char c: str.toCharArray()){
            if("aeiou".indexOf(c)!=-1){
                vowels++;
                
            } else if (Character.isLetter(c)) {
                consonents++;
                
            }
        }
        System.out.println("vowels"+vowels);
        System.out.println("consonents"+consonents);
    }
}

class multiplication {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3, 4},{2,3,1}};
        int[] []arr2 = {{1, 2, 3, 4},{1,2,3}};

        int[][] sum = new int[arr1.length][arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                sum[i][j] = arr1[i] [j]+ arr2[i][j];
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(sum[i][j] +" ");
            }
            System.out.println();
            
        }
    }
}


class employee{
    private  int id ;
    private String name ;
    private double salary;

    public employee(int id ,String name,double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void increaseSalary(double percentage){
        salary =salary+salary*(percentage/100);

    }
    public void employeeDetails(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(salary);
    }

    public static void main(String[] args) {
        employee e = new employee(10,"bimal",4000);
        e.increaseSalary(20);
        e.employeeDetails();
    }
}

class rectangle {
    private int length;
    private int breadth;
    public rectangle(int length,int breadth){
        this.breadth=breadth;
        this.length=length;

    }
    public double getArea(){
        return length*breadth;
    }
    public double getPerimeter(){
        return 2*(length*breadth);
    }

    public static void main(String[] args) {
        rectangle r = new rectangle(10 ,5);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
    }
}


class Animal{
    void makeSound(){
        System.out.println("sound");
    }

}
class dog extends Animal{
    void makeSound(){
        System.out.println("bark");
    }
}
class cat extends Animal{
    void makeSound(){
        System.out.println("meow");
    }
}
class test{
    public static void main(String[] args) {
        Animal a = new Animal();
        dog d = new dog();
        cat c = new cat();
        c.makeSound();
        d.makeSound();
        a.makeSound();
    }
}

class Person{
     String name;
     int age;
    public Person( String name  ,int age){
    this.name=name;
         this.age=age;
    }
     public void dispalayInfo(){
         System.out.println(name);
         System.out.println(age);

     }


}

class Employee1 extends Person {

     double salary1;

    public Employee1(String name, int age, double salary1) {
        super(name, age);
        this.salary1 = salary1;
    }

    public void dispalayInfo() {

        System.out.println(salary1);



    }
}
    class manager extends Employee1{
     double property;

        public manager(String name, int age, double salary1,double property) {
            super(name, age, salary1);
            this.property=property;
        }
        public void dispalayInfo() {


            System.out.println(property);

        }

    }
    class ans10{
        public static void main(String[] args) {
            Person p = new Person("bimal",19);
            Employee1 e1 =new Employee1("bimal",19,2500);
            manager m = new manager("bimal ",19,2500,60000);
            p.dispalayInfo();
            m.dispalayInfo();
            e1.dispalayInfo();

        }

    }


