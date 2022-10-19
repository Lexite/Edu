package B4_Metanit.P6_InputOutput;
import java.io.*;


public class ByteArrayOutputStreamExample {
    public static void main(String[] args) {
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        String text = "Hello World!";
        byte[] buffer = text.getBytes();
        try {
            boas.write(buffer);
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(boas.toString());
        byte[] array = boas.toByteArray();
        for (byte b: array) {
            System.out.print((char)b);
        }
        System.out.println();

        try(FileOutputStream fos = new FileOutputStream("hello.txt")){
            boas.writeTo(fos);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
