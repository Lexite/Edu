package B4_Metanit.P6_InputOutput;
import java.io.*;


public class ByteArrayInputStreamExample {
    public static void main(String[] args) {
        byte[] array1 = new byte[]{1,3,5,7};
        ByteArrayInputStream byteStream1 = new ByteArrayInputStream(array1);
        int b;
        while((b=byteStream1.read())!=-1){
            System.out.print(b);
        }
        System.out.println();

        String text = "Hello world!";
        byte[] array2 = text.getBytes();
        ByteArrayInputStream byteStream2 = new ByteArrayInputStream(array2);
        int c;
        while((c=byteStream2.read())!=-1){
            System.out.print((char)c);
        }
    }



}
