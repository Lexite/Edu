package B4_Metanit.P6_InputOutput;

import java.io.*;

public class BufferedReaderWriterExample {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("notes4.txt"))) {
            String text = "Hello World! \nHey! Teachers! Leave the kids alone.";
            bw.write(text);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try(BufferedReader br = new BufferedReader(new FileReader("notes4.txt"))) {
            int c;
            while((c=br.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println();
        try(BufferedReader br = new BufferedReader(new FileReader("notes4.txt"))) {
            String s;
            while((s=br.readLine())!=null){
                System.out.println(s);
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter("VladimirPutin.txt"))) {
            String text;
            while(!(text= br.readLine()).equals("ESC")){
                bw.write(text + "\n");
                bw.flush();
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
