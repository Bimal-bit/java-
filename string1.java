import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;


class string {
    public static void main(String[] args) {
        String a ="Bimal";
        System.out.println(a);
        String b  = "Bimal";
        System.out.println(a == b);
        String c=null;
        System.out.println(c);
        int [] arr = {1, 2, 3};
        System.out.println(arr);
//STRING COMPSRISION
        String k = new String("kl ");
        String h = new String("kl ");
        System.out.println(k == h);
        System.out.println(a.equals(b));
//        TO FIND THE VALUE IN THE INDEX
        System.out.println(a.charAt(0));



    }
}

//ROUNDING OF NUMBERES
class prettyPrinting{
    public static void main(String[] args) {
        float a =10.235445f;
        System.out.printf("%.2f\n",a);
        System.out.printf("%.3f\n",Math.PI);
        System.out.println(Math.max(30,Math.max(10,20)));
        System.out.printf("My name is %s and my age is %d\n" ,"Bimal",13);
        System.out.printf("today time is %t",11);
    }
}

//OPERATORS
class operators{
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println('a'+3);
        System.out.println((char)('a'+3));
//        this will conver it into "a" +"1"
//      integer will be concatinated to Integer that will call toString

        System.out.println("bimal"+new ArrayList<>(1));
//        there should be string object to use + operator
        String c=new Integer(55)+" "+new ArrayList<>(1);
        System.out.println(c);
        System.out.println("bimal"+new Integer(11));
    }
}

