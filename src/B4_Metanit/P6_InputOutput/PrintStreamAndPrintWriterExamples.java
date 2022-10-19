package B4_Metanit.P6_InputOutput;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.*;

public class PrintStreamAndPrintWriterExamples {
    public static void main(String[] args) {
        String text = "Hello World!";
        try (FileOutputStream fos = new FileOutputStream("C://JavaExamples//notes10.txt");
             PrintStream printStream = new PrintStream(fos))
        {
            printStream.println(text);
            System.out.println("the info is written into the file");
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        try(PrintStream printStream = new PrintStream("notes11.txt"))
        {
            printStream.print("hello world!");
            printStream.println("Welcome to java!");
            printStream.printf("Name: %s Age: %d \n","Tom",34);
            String message = "PrintStream";
            byte[] message_toBytes = message.getBytes();
            printStream.write(message_toBytes);
            System.out.println("The file has been written");
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
