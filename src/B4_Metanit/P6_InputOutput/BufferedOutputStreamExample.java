package B4_Metanit.P6_InputOutput;
import java.io.*;
public class BufferedOutputStreamExample {
    public static void main(String[] args) {
        String text = "Hello world!";
        try(FileOutputStream out = new FileOutputStream("notes.txt");
            BufferedOutputStream bos = new BufferedOutputStream(out)) {
            byte[] buffer = text.getBytes();
            bos.write(buffer,0,buffer.length);
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());

        }

    }
}
