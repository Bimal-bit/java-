// Strings are immutable for security purpose
//String contains pool memory
//if both variables have the same name then it points same name in heap(pool) memory
//if one variable name changes it points to another name,
//it does not alter both variables

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

class String2 {
     public static void main(String[] args) {
         String str = " bimal";
         System.out.println(str);
         str = " kl";
         System.out.println(str);
     }
}

//two types comparison method
//1.(==)method
//in this method if there is any space or any uppercase or lower case it points to false
//if you create a new object using new keyword
//it stores the same name in different pool(heap)
//2.equals() method
//to check or compare two variables which is created using new string
//you should use .equals() method
//to find the given character .charAt(index) is used
class comparison{
    public static void main(String[] args) {
        String a = " bimal";
        String b = " bimal";
        System.out.println(a==b);
//STRING COMPSRISION
        String str1 = new String("java");
        String str2 = new String("java");
        System.out.println(str1==str2);
// TO FIND THE VALUE IN THE INDEX
        System.out.println(str1.charAt(3));
    }
}


class PrettyPrinting1{
    public static void main(String[] args) {
//        this is wraper class
//        Integer num = new Integer(56);
//        System.out.println(num.toString());


//        to roundoff number
        float a = 53.44846f;
        System.out.printf("%2f\n",a);
//        Math. contains all maths constants and other things
        System.out.println(Math.PI);
//        to add the string value in between the sentence %s is used %d is used for int
        System.out.printf("hi my name is %s my age is %d","bimal",19);

    }
}



class Operator1{
    public static void main(String[] args) {
//        it adds the ASCII values and produces the output
        System.out.println('a'+'b');
//        it concatenates the string
        System.out.println("a"+"b");
//        it explicitly converts int into char
        System.out.println((char)('a'+5));
//        when an int is added to string, it converted to wrapper class which calls
//        toString() method to print
        System.out.println("a"+1);
//        it prints a given string and an empty array
        System.out.println("bimal"+new ArrayList<>());
//        its wrapper class
        System.out.println("bimal"+new Integer(11));
//        + operators works only when either object should be string
//        else use " " to use + without string
        System.out.println(new Integer(55)+" "+new ArrayList<>());

    }
}

//to print thw alphebets, you should explicitly convert int to char
//first it will point to an in pool
//next it does not append the value it creates a new object ab and so on

class Performance{
    public static void main(String[] args) {
        String Series ="";
        for (int i = 0; i < 26; i++) {
            char ch =(char) ('a' +i);
            Series+=ch;


        }
        System.out.println(Series+" ");

    }
}


//converts into array format
class Methods1{
    public static void main(String[] args) {
        String str = "Bimal kl";
        String str1= " k l";
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.getBytes(StandardCharsets.UTF_8));
        System.out.println(str.getBytes());
        System.out.println(str.equals(str1));
        System.out.println(str.indexOf("B"));
        System.out.println(str.length());
        System.out.println(str.concat(str1));
        System.out.println(str.strip());
        System.out.println(Arrays.toString(str.split(",")));

    }
}