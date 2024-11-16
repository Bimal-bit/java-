// class fruit  {
//
//    void color(){
//        System.out.println("blue");
//
//    }
//}
//    class apple extends fruit {
//        void shape() {
//            System.out.println("circle");
//        }
//    }
//    class banana extends apple{
//    void size (){
//        System.out.println("long");
//    }
//    }
//class sabe extends fruit{
//    void thick(){
//        System.out.println("hair");
//    }
//}
//
//
//class all{
//    public static void main(String[] args) {
//        fruit a = new fruit();
//        apple b = new apple();
//        banana c = new banana();
//        sabe d =new sabe();
//        d.thick();
//        c.size();
//        b.shape();
//        a.color();
//    }
//}

//class test{
//    void print(int a){
//        System.out.println(a);
//    }
//
//    void print(int a,int b, int c){
//        System.out.println(a+b+c);
//    }
//    void print(int a,int b){
//        System.out.println(a+b);
//    }
//}
//class answers {
//    public static void main(String[] args) {
//        test t = new test();
//        t.print(11);
//        t.print(55,66);
//        t.print(88,99,66);
//    }
//}

//class test {
//    test(){
//        System.out.println(hi);
//    }
//    String color = "white";
//    void print() {
//        System.out.println(55);
//    }
//}
//
//    class ak extends test{
//
//    void print() {
//        System.out.println(66);
//        super();
//    }
//}
//class kk extends test{
//    void print(){
//        System.out.println(11);
//        System.out.println(super.color);;
//        super.print();
//
//
//    }
//}
//
//class answers {
//    public static void main(String[] args) {
//        test t = new test();
//        ak p = new ak();
//        kk i = new kk();
//        i.print();
//        p.print();
//        t.print();
//
//
//    }
//}

//class person {
//    int id ;
//    String name ;
//    person(int id, String name){
//        this.id=id;
//        this.name=name;
//
//    }
//}
//class emp extends person {
//    float salary;
//
//    emp(int id, String name, float salary) {
//        super(id, name);
//        this.salary = salary;
//    }
//
//
//    void display() {
//        System.out.println(id + " " + name + " " + salary);
//
//    }
//}
//class  test {
//    public static void main(String[] args) {
//        emp e =new emp(1,"bimal",5000);
//        e.display();
//    }
//}

class eze {
    int cla(){
        return 3000;

    }
}
class manager extends eze{
    int cla(){
        return super.cla() + 1000;

    }

}
 class director extends eze{
     @Override
     int cla() {
         return super.cla()+2000;
     }
 }


 class all {
     public static void main(String[] args) {
         director d = new director();
         eze e = new eze();
         manager m = new manager();
         System.out.println(d.cla());
         System.out.println(m.cla());
         System.out.println(e.cla());

     }
 }
