package basics;

//import oops.*;
//
//public class ok extends package1 {
//    public static void main(String[] args) {
//        package1 p = new package1();
//        ok a = new ok();
//        p.p1();
//        ok.p2();
//        p.p3();
//        p.p4();
//
//    }
//}

interface a {
    default void ab(){
        System.out.println("hello");
    }
}
interface b extends a{

    void abc();

}
class c implements b {

    @Override
    public void abc() {
        System.out.println("hi");
    }
}


class z{
public static void main(String[] args) {
    c x = new c();
    x.abc();
    x.ab();

    }
}





//class ChainedExceptionExample {
//    public static void main(String[] args) {
//        try {
//            method1();
//        } catch (Exception e) {
//            System.out.println("Caught Exception: " + e.getMessage());
//            System.out.println("Caused By: " + e.getCause());
//        }
//    }
//
//    static void method1() throws Exception {
//        try {
//            method2();
//        } catch (ArithmeticException e) {
//            throw new Exception("Exception in method1", e);
//        }
//    }
//
//    static void method2() {
//        int result = 10 / 0; // ArithmeticException
//    }
//}



 class ExceptionPropagationExample {
    static void method1() throws Exception {
        throw new Exception("Exception from method1");
    }

    static void method2() throws Exception {
        method1(); // Propagates the exception
    }

    static void method3() {
        try {
            method2();
        } catch (Exception e) {
            System.out.println("Handled Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        method3();
        System.out.println("Program continues after handling exception.");
    }
}


abstract class bike {
     abstract void run();

}
class honda extends bike{
    @Override
    void run() {
        System.out.println("hi");
    }
class suzuki extends bike{
    @Override
    void run() {
        System.out.println("hello");
    }
}
class ans {
    public static void main(String[] args) {
        bike o = new honda();
        o.run();
    }
}
}

class abs {
     String name;
     int age;
     abs(String name , int age){
         this.age=age;
         this.name=name;
     }
     void run(){
         System.out.println(name +"\n"+ age);
     }

}
class def{
    public static void main(String[] args) {
        abs a = new abs("bimal" ,19);
        abs b = a;
        b.name="kl";
        b.run();
        a.run();

    }
}



abstract class bank {
     abstract double intrest();

}

class axis extends bank{
     public double intrest(){
         return  9.0;
     }
}
class sbi extends bank{
    public double intrest(){
        return  8.0;
    }
}

class ans {
    public static void main(String[] args) {
        bank a = new axis();
        bank b = new sbi();

        System.out.println(a.intrest());
        System.out.println(b.intrest());

    }
}

class shape1 {
    interface shape {
        void draw();


        default void change() {
            System.out.println("changing size");
        }
    }
}
class circle implements shape1.shape{
    @Override
    public void draw() {
        System.out.println("its a  circle ");

    }
}


class ans1 {
    public static void main(String[] args) {
        shape1.shape n = new circle();
       n.change();

        n.draw();

    }

}


interface vehicle{
    void start();

}
interface car  {
    void sound();

}

class mg implements car,vehicle{
    public void start(){
        System.out.println("drrrr");
    }
    public void sound(){
        System.out.println("1");
    }
}
class an {
    public static void main(String[] args) {
        mg v = new mg();
        v.start();
        v.sound();
    }
}

class person{
    private String name="bimal";

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

}
class ans2{
    public static void main(String[] args) {
        person n = new person();
        n.setName("kl");
        System.out.println(n.getName());
    }
}

// File: Modifiers.java (in package "mypackage")

 class ok1 {
    public String publicVar = "Public";
    private String privateVar = "Private";
    protected String protectedVar = "Protected";
    String defaultVar = "Default"; // Package-private

    public void displayPublic() {
        System.out.println(publicVar);
    }

    private void displayPrivate() {
        System.out.println(privateVar);
    }

    protected void displayProtected() {
        System.out.println(protectedVar);
    }

    void displayDefault() {
        System.out.println(defaultVar);
    }
}




class BasicExceptionHandling {
    public static void main(String[] args) {


        int a = 10;
        int b = 0;
        try {
            int arr[] = new int[2];

            arr[3] = 40;

        }


//    catch (ArrayIndexOutOfBoundsException e){
//        System.out.println(e.getMessage());
//    }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("final answer");
        }

    }


}

class throwing {
    static void check(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("age must be 18 years and older ");
        } else {
            System.out.println("age is valid");
        }
    }

        public static void main (String[]args){
            try {
                check(5);

            }
            catch (IllegalAccessError e){
                System.out.println(e.getMessage());
            }

        }

}

class Invalid extends Exception{
    public Invalid(String message ){
        super(message);
    }
}
class custom  {
    static void check (int age ) throws Invalid{
        if(age<18){
            throw  new Invalid ("age is less");
        }
    }

    public static void main(String[] args) {
        try {
            check(10);
        }
        catch (Invalid e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("bye");
        }
    }
}


class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

 class BankingApp {
    public static void withdraw(double balance, double amount) throws InsufficientFundsException {
        if (balance < amount) {
            throw new InsufficientFundsException("Insufficient funds to withdraw " + amount);
        } else {
            System.out.println("Withdrawal successful: " + amount);
        }
    }

    public static void main(String[] args) {
        double balance = 1000.00;
        double withdrawAmount = 1200.00;
        try {
            withdraw(balance, withdrawAmount);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction attempt finished.");
        }
    }
}


public class ok {
    int n = 1;
    private int pri =5;
    protected int pro =5;
    public int pub =5;
    public ok(){
        System.out.println(n);
        System.out.println(pri);
        System.out.println(pro);
        System.out.println(pub);

    }
}

class nest{
    public static void main(String[] args) {
        try {
            int a []= new int[2];
             a[3] =42;
            System.out.println("a");
            try {
                int c =45/0;

            }
            catch (ArithmeticException e ){
                System.out.println(e.getMessage());
            }

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("eyery thing is printed");
        }
    }
}

class throwdemo{
    static void demo(){
        try {
            throw new NullPointerException("demo");
        }
        catch (NullPointerException e ){
            System.out.println("caught");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demo();
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}