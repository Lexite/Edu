package B4_Metanit.P6_InputOutput;

import java.io.FileInputStream;
import java.io.IOException;

public class CloseStreams {
    public static void main(String[] args) {

        FileInputStream fin = null;
        try {
            fin = new FileInputStream("C://JavaExamples//notes.txt");
            int i = -1;
            while ((i = fin.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (fin != null)
                    fin.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
