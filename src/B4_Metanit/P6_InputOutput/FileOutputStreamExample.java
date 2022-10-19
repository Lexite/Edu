package B4_Metanit.P6_InputOutput;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutputStreamExample {
    public static void main(String[] args) {
        String text = "Hello World!";
        try(FileOutputStream fos = new FileOutputStream("C://JavaExamples//HelloWorld.txt")){
            byte[] buffer = text.getBytes();
            fos.write(buffer,0, buffer.length);
            System.out.println("The file has been written");
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }



}
