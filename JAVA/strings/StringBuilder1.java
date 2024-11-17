//string builder is mutable
//if we want to modify the String it does not create a new object
//it modifies the same object
 class StringBuilder1 {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder();
        for(int i = 0 ; i< 26;i++){
            char ch= (char) ('a'+i);
            str.append(ch);
        }
        System.out.println(str);
    }
}

class Methods{
    public static void main(String[] args) {
//        it is used to append the character to existing string
        StringBuilder str = new StringBuilder("bimal");
        str.append(" k l");
        System.out.println(str);
//
        StringBuilder str1 = new StringBuilder("java");
        System.out.println(str1.compareTo(str));

        StringBuilder str2= new StringBuilder("kunal");
        System.out.println(str2.indexOf("u"));



    }
}

class StringBuilderExample{
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Hello ");
        sb.append("Java");//now original string is changed
        System.out.println(sb);//prints Hello Java
    }
}

class StringBuilderExample2{
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Hello ");
        sb.append("Java");//now original string is changed
        System.out.println(sb);//prints Hello Java
    }
}


class StringBuilderExample3{
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Hello");
        sb.replace(1,3,"Java");
        System.out.println(sb);//prints HJavalo
    }
}

class StringBuilderExample4{
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Hello");
        sb.delete(1,3);
        System.out.println(sb);//prints Hlo
        StringBuilder sb1=new StringBuilder("Hello");
        sb1.deleteCharAt(0);
        System.out.println(sb1);//prints ello

    }
}

class StringBuilderExample5{
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Hello");
        sb.reverse();
        System.out.println(sb);//prints olleH
    }
}

class StringBuilderExample6{
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder();
        System.out.println(sb.capacity());//default 16
        sb.append("Hello");
        System.out.println(sb.capacity());//now 16
        sb.append("Java is my favourite language");
        System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
    }
}


class StringBuilderExample7{
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder();
        System.out.println(sb.capacity());//default 16
        sb.append("Hello");
        System.out.println(sb.capacity());//now 16
        sb.append("Java is my favourite language");
        System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
        sb.ensureCapacity(10);//now no change
        System.out.println(sb.capacity());//now 34
        sb.ensureCapacity(50);//now (34*2)+2
        System.out.println(sb.capacity());//now 70

    }
}
