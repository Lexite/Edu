package B4_Metanit.P7_String;

public class StringExample {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String();
        String str3 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        String str4 = new String(new char[]{'w', 'e', 'l', 'c', 'o', 'm', 'e'}, 3, 4);
        System.out.println(str1);
        System.out.println(str1.length());
        System.out.println(str2);
        System.out.println(str3);
        char[] helloArray = str3.toCharArray();
        System.out.println(str4);
        String s = "";
        if(s.length()==0) System.out.println("String is empty");
        if(s.isEmpty()) System.out.println("String is empty");
        String sNull = null;
        if(sNull == null) System.out.println("String is null");
        //if(sNull.length()==0) - null is not 0
        String s0 = null;
        if(s0==null || s.length()==0) System.out.println("String is empty");

        String s1 = "age" + 15;
        System.out.println(s1);
        String s2 = "Java";
        String s3 = "Hello";
        String s4 = s2.concat(s3);
        System.out.println(s4);
        String s5 = String.join(" ", s3, s4,s1);
        System.out.println(s5);
        char c = str1.charAt(2);
        System.out.println(c);
        String helloJava = "Hello Java!";
        int start = 6;
        int end = 11;
        char[] dst = new char[end - start];
        helloJava.getChars(start, end, dst, 0);
        System.out.println(dst);
        String hello = "hello";
        String hello1 = "hello";
        System.out.println(hello.equals(hello1));
        System.out.println(hello.equalsIgnoreCase(hello1));
        String w1 = "Hello world";
        String w2 = "I work";
        boolean result = w1.regionMatches(6,w2,2,3);




    }
}
