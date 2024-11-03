
class box{
    int area;
    int breadth;

box(int o){
    System.out.println(o);

}

    public box(int area, int breadth) {
        this.breadth=breadth;
        this. area=area;


    }
    void fe(){
        System.out.println(area+" "+breadth);
    }
    box(){
    area=99;
    breadth=99;
    }
 box get (){
    return this;
 }
    void mas(){
        System.out.println("a");
    }
    double vol () {
        return area * breadth;
    }
    void dim(int w , int l){
        area=w;
        breadth=l;
        int z =w*l;
        System.out.println(z);




    }

  void area() {
        System.out.println("A");
    }
}
public class oops1  {
    public static void main(String[] args) {
        box a = new box(33,88);
        box b = new box(11,66);
        System.out.println(b.vol());
        System.out.println(a.vol());

        a.get().fe();

        a.dim(10,66);

        a.area();
        a.mas();
        b.area=40;
        b.breadth=30;
        a.area=10;
        a.breadth=10;
        double v = a.vol();
        double h = b.vol();
        System.out.println(v);
        System.out.println(h);
    }
}