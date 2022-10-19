package B4_Metanit.P6_InputOutput;
import java.io.*;
import java.util.*;
public class FileWriterReaderExample {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("notes5.txt", false))
        {
            // запись всей строки
            String text = "Hello Gold!";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('E');

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        System.out.println();
        try(FileReader reader = new FileReader("notes11.txt"))
        {
            int c;
            while((c= reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println();
        try(FileReader reader = new FileReader("notes3.txt"))
        {
            char[] buf = new char[256];
            int c;
            while((c=reader.read(buf))>0){
                if(c < 256){
                    buf = Arrays.copyOf(buf,c);
                }
                System.out.print(buf);
            }
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
