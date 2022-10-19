package B1_Start.SimpleExamples;

import java.io.ByteArrayInputStream;

public class P {
    public static void main(String[] args) {
        byte[] array = new byte[] {1,2,3,4};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(array);
        int a;
        while ((a = byteArrayInputStream.read())!= -1) {
            System.out.print(a);
        }
        System.out.println();

        byte[] stringArray = new byte[] {'a','b','c','d'};
        ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(stringArray);
        int b;
        while ((b = byteArrayInputStream1.read())!= - 1) {
            System.out.print((char)b);
        }

    }



}
