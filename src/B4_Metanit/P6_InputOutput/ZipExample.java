package B4_Metanit.P6_InputOutput;
import  java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;


public class ZipExample {
    public static void main(String[] args) {
        String filename = "C://JavaExamples//notes1.txt";
        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("C://JavaExamples//output.zip"));
                FileInputStream fis = new FileInputStream(filename);) {
            ZipEntry entry1 = new ZipEntry("notes1.txt");
            ZipEntry entry2 = new ZipEntry("notes2.txt");
            zout.putNextEntry(entry1);
            zout.putNextEntry(entry2);
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            zout.write(buffer);
            zout.closeEntry();
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        try(ZipInputStream zin = new ZipInputStream(new FileInputStream("C://JavaExamples//output.zip")))
        {
            ZipEntry entry;
            String name;
            long size;
            while((entry=zin.getNextEntry())!=null){

                name = entry.getName(); // получим название файла
                size=entry.getSize();  // получим его размер в байтах
                System.out.printf("File name: %s \t File size: %d \n", name, size);

                // распаковка
                FileOutputStream fout = new FileOutputStream("C://JavaExamples//new" + name);
                for (int c = zin.read(); c != -1; c = zin.read()) {
                    fout.write(c);
                }
                fout.flush();
                zin.closeEntry();
                fout.close();
            }
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }


}
