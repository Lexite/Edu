package B4_Metanit.P6_InputOutput;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try(FileInputStream fin = new FileInputStream("C://JavaExamples//FileInputStream.txt");){
            System.out.printf("File size: %d bytes \n", fin.available());

            int i = - 1;
            while((i = fin.read())!=-1){
                System.out.print((char)i);
            }
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
