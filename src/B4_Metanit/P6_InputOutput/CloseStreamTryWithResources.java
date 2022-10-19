package B4_Metanit.P6_InputOutput;
import java.io.*;

public class CloseStreamTryWithResources {
    public static void main(String[] args) {

        try(FileInputStream fin = new FileInputStream("C://JavaExamples//notes.txt");
            FileOutputStream fos = new FileOutputStream("C://JavaExamples//notes_5.txt"))
            {


                byte[] buffer = new byte[fin.available()];
                fin.read(buffer,0,buffer.length);
                fos.write(buffer,0,buffer.length);
            }
            catch(IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

