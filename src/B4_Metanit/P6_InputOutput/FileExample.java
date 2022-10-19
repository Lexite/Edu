package B4_Metanit.P6_InputOutput;
import java.io.File;
import java.io.IOException;


public class FileExample {
    public static void main(String[] args) {
        File directory = new File("C://JavaExamples");
        if (directory.isDirectory()){
            for (File item : directory.listFiles()){
                if(item.isDirectory()){
                    System.out.println(item.getName() + " \t folder");
                }
                else {
                    System.out.println(item.getName() + "\t file");
                }
            }
        }
        File dir = new File("C://JavaExamples//NewExamples");
        boolean created = dir.mkdir();
        if(created)
            System.out.println("Folder has been created");
        File newDir = new File("C://JavaExamples//NewExamplesRenamed");
        boolean renamed = dir.renameTo(newDir);
        if (renamed)
            System.out.println("Folder has been renamed");
        boolean deleted = newDir.delete();
        if (deleted)
        System.out.println("Folder has been deleted");

        File myFile = new File("C://JavaExamples//fileExample.txt");
        System.out.println("File name" + myFile.getName());
        System.out.println("Parent folder: " + myFile.getParent());
        if (myFile.exists())
            System.out.println("File exists");
        else
            System.out.println("File not found");
        System.out.println("File size: " + myFile.length());
        if(myFile.canRead())
            System.out.println("File can be read");
        else
            System.out.println("File cannot be read");
        if (myFile.canWrite())
            System.out.println("File can be written");
        File newFile = new File("C://JavaExamples//MyFile");
        try{
            boolean created1 = newFile.createNewFile();
            if(created1)
                System.out.println("File has been created");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
