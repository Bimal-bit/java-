package oops;

//public class new1 {
//    public static void main(String[] args) {
//        packages10 p = new packages10(10,15);
//        System.out.println(p.calculateArea());
//    }
//
//}


interface Shapes{
    double Area();
    void display();
}

class circle1 implements Shapes{
    private double radius;
    circle1(double radius){
        this.radius=radius;
    }

    @Override
    public double Area() {
        return Math.PI*radius*radius;
    }

    @Override
    public void display() {
        System.out.println(Area());
    }
}

class ans{
    public static void main(String[] args) {
        Shapes s = new circle1(2.5);

        s.display();
    }
}


class ok {
    public static void main(String[] args) {
        try {
            int a =1/0;
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("executed");
        }
    }
}

class invalid extends Exception{
    public invalid(String message){
        super(message);
    }
}
class negative{
    public static void main(String[] args) {
        try{
            int num =-1;
            if(num<0){
                throw new invalid("negative error");
            }


        }catch (invalid e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("program excucted");
        }
    }
}

class myThread extends Thread{
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        t.setName("bimal");
        System.out.println(t);
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }


        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}


class newThread implements Runnable {
    Thread t;
    private String name;

    public newThread(String name) {
        this.name=name;
        t = new Thread(this,name);
        System.out.println("this is child thread" + name);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("child thread" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}

class demo {
    public static void main(String[] args) {

 new newThread("bimal");

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("main thread" + i);
                Thread.sleep(1000);

            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

class callme{
     synchronized void call (String msg ){
        System.out.println("["+msg);
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e ){
        System.out.println(e.getMessage());
        }
        System.out.println("]");

    }
}
class caller implements Runnable{
    String msg ;
    callme target ;
    Thread t ;
    public caller(callme target ,String msg){
        this.target=target;
        this.msg=msg;
        t=new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        target.call(msg);
    }
}

class synch{
    public static void main(String[] args) {
        callme c = new callme();
        caller c1= new caller(c,"hello");
        caller c2= new caller(c,"world");
        caller c3= new caller(c,"sync");
        try {
            c1.t.join();
            c2.t.join();
            c3.t.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Table {
    // Synchronized method to ensure thread-safe access
    synchronized void printTable(int number) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
            try {
                Thread.sleep(500); // Simulate a delay
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

class MyThread extends Thread {
    Table table;
    int number;

    public MyThread(Table table, int number) {
        this.table = table;
        this.number = number;
    }

    @Override
    public void run() {
        table.printTable(number); // Calling the synchronized method
    }
}

 class SynchronizationExample {
    public static void main(String[] args) {
        Table sharedTable = new Table(); // Shared resource

        MyThread t1 = new MyThread(sharedTable, 5);
        MyThread t2 = new MyThread(sharedTable, 7);

        t1.start();
        t2.start();
    }
}


class Table1{
    synchronized void printTable(int n ){
        for (int i = 0; i < 5; i++) {
            System.out.println(n*i);

        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

class myT extends Thread{
    Table1 t;

    myT(Table1 t) {
        this.t=t;
    }

    @Override
    public void run() {
        t.printTable(5);
    }
}
class myT1 extends Thread{
    Table1 t;

    myT1(Table1 t) {
        this.t=t;
    }

    @Override
    public void run() {
        t.printTable(10);
    }
}

class test1{
    public static void main(String[] args) {
        Table1 o =new Table1();
        myT t1 = new myT(o);
        myT1 t2 = new myT1(o);
        t1.start();
        t2.start();

    }
}

class s implements Runnable {
    String name ;
    Thread t ;
    public s(String threadname){
        name =threadname;
        t = new Thread(this ,threadname);
        System.out.println("therad "+t);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);

            }

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

class k {
    public static void main(String[] args) {
        s n = new s("1");
        s n1 = new s("2");
        s n2 = new s("3");
        n.t.start();
        n1.t.start();
        n2.t.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}

class z extends Thread{
    z(){
        super("bimal");
        System.out.println(this);
    }

    @Override
    public void run() {
       try {
           for (int i = 0; i < 5; i++) {
               System.out.println(i);
               Thread.sleep(1000);
           }
       } catch (InterruptedException e) {
           System.out.println(e.getMessage());
       }


    }

}

class n {
    public static void main(String[] args) {
        z z1 = new z();
        z1.start();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}



