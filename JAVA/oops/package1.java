package oops;

public class package1 {
    public void p1(){
        System.out.println("public class");
    }




    protected static void p2(){
        System.out.println("protected class");
    }




    public void p3(){
        System.out.println("private class");
    }



     public void p4(){
        System.out.println("default class");
    }
}




// File: TestOtherPackage.java (in package "otherpackage")




//class TestOtherPackage extends ok {
//    public static void main(String[] args) {
//        ok obj = new ok();
//        System.out.println(obj.publicVar);     // Accessible
////         System.out.println(obj.privateVar); // Not accessible
////         System.out.println(obj.protectedVar); // Not directly accessible
//        // System.out.println(obj.defaultVar); // Not accessible
//
//        obj.displayPublic();                   // Accessible
//        // obj.displayProtected();            // Not accessible directly
//
//        // Accessing protected member through inheritance
//        TestOtherPackage child = new TestOtherPackage();
//        System.out.println(child.protectedVar); // Accessible through inheritance
//        child.displayProtected();               // Accessible through inheritance
//    }
//}

