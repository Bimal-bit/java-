package basics;//package basics;

 class threads12 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t);
        t.setName("demo");

        System.out.println(t);
        System.out.println(t);
        try {
            for (int i = 5; i >0 ; i--) {
                System.out.println(i);
                Thread.sleep(1000);

            }

        }catch (InterruptedException e ){
            System.out.println(e.getMessage());
        }
    }



}





class threads2 implements Runnable{
    Thread t ;
     threads2(){
     t = new Thread(this,"demo");
         System.out.println("child thread"+ t);
         t.start();
    }

    public  void run(){
         try {

             for (int i = 0; i <6 ; i++) {
                 System.out.println(i);
                 Thread.sleep(1000);

             }
         }
         catch (InterruptedException e){
             System.out.println(e.getMessage());

         }
        System.out.println("existing child");
    }

}
class add{
    public static void main(String[] args) {
        new Thread();
        try {

            for (int i = 0; i <6 ; i++) {
                System.out.println(i);
                Thread.sleep(1000);

            }
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());

        }
        System.out.println("existing child");
    }

}





class New1 implements Runnable {  // Corrected class name to match Java naming conventions.
    private Thread t;
    private String threadName;   // Fixed variable name typo ("theeadname" to "threadName").

    // Constructor
    New1(String name) {
        threadName = name;
        System.out.println("Creating thread: " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running thread: " + threadName);
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i + " " + threadName);
                Thread.sleep(1000); // Pauses the thread for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("Exception: " + e.getMessage() + " " + threadName);
        }
        System.out.println("Thread interrupted");
    }

    public static void main(String[] args) {
        New1 newThread = new New1("demo");  // Create an instance of New1 with a thread name
        System.out.println("Starting " + newThread.threadName);

        // Check if the thread is not already created
        if (newThread.t == null) {
            newThread.t = new Thread(newThread, newThread.threadName);  // Create a new thread and pass the instance
            newThread.t.start();  // Start the thread
        }
    }
}




class New2 extends Thread {  // Renamed class to follow naming conventions
    // Constructor
    New2() {
        super("Extending Demo Thread");  // Setting the thread name
        System.out.println("Child thread: " + this);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Child thread: " + i);
                Thread.sleep(1000);  // Pause for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread interrupted: " + e.getMessage());
        }
        System.out.println("Exiting child thread");
    }
}

public class threads1 {  // Corrected class scoping and renamed to follow naming conventions
    public static void main(String[] args) {
        New2 childThread = new New2();  // Create and start the child thread
        childThread.start();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Main thread: " + i);
                Thread.sleep(1000);  // Pause for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("Exiting main thread");
    }
}







class multi implements Runnable{
    String name;
    Thread t ;
    multi( String threadname){
        name = threadname;
        t = new Thread(this,threadname);
        System.out.println("new thread :"+ threadname);
        t.start();
    }
    public void run(){
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(name + i);
                Thread.sleep(1000);

            }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println(name+"existing");
    }

}
class multi1{
    public static void main(String[] args) {
        multi m = new multi("one : ");
        multi n = new multi("two ;");
        multi o = new multi("three :");
        System.out.println("thread 1 is alive"+ m.t.isAlive());
        System.out.println("thread 2 is alive"+ m.t.isAlive());
        System.out.println("thread 3 is alive"+ m.t.isAlive());
        try {
            m.t.join();
            n.t.join();
            o.t.join();
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }


}








class multi3 implements Runnable{
    String name;
    Thread t ;
    multi3( String threadname){
        name = threadname;
        t = new Thread(this,threadname);
        System.out.println("new thread :"+ threadname);
    }
    public void run(){
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(name + i);
                Thread.sleep(1000);

            }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println(name+"existing");
    }

}





class multi4{
    public static void main(String[] args) {
        multi m = new multi("one : ");
        multi n = new multi("two ;");
        multi o = new multi("three :");
        m.t.start();
        n.t.start();
        o.t.start();
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }


}

