package B6_Other.GenerateAWebsite;
import java.io.*;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        //HTML - Hyper Text Markup Language usd for creating web pages
        // 1. ask user for a file name
        // 2. check if the file exists
        // 3. determine if the file is empty
        // 4. rename .txt as .html
        // 5. read each line and insert necessary <tags>
        Scanner scanner = new Scanner(System.in);
        Scanner fileIn; // input file connection
        PrintWriter fileOut; // HTML file connection
        String fileNameIn; // original file's name
        String fileNameOut; // new HTML file's name
        int dotIndex; // position of . in fileName
        String line = null; // a line from the input file
        // 1. ask user for a file name (or file path)
        System.out.println("Enter file name or file path");
        fileNameIn = scanner.nextLine();
        // 2. check if file exists
        // 3. rename .txt as .html
        try {
            fileIn = new Scanner(new FileReader(fileNameIn));
            dotIndex = fileNameIn.lastIndexOf(".");
            if(dotIndex == -1) {// means there were no dots found
                fileNameOut = fileNameIn + ".html";
            }
            else {
                fileNameOut = fileNameIn.substring(0,dotIndex) + ".html";
            }
            fileOut = new PrintWriter(fileNameOut);
            // 4. determine if file is empty
            try {
                line = fileIn.nextLine();
            }
            catch(NoSuchElementException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
            if (line == null) {
                System.out.println("This file is empty :(");
            }
            else {
                // 5. read each line and insert necessary <tags>
                fileOut.println("<html>");
                fileOut.println("<head>");
                fileOut.println("</head>");
                fileOut.println("<body>");
                fileOut.println(line);
                while(fileIn.hasNextLine()) {
                    fileOut.println("<br>");
                    line = fileIn.nextLine();
                    if(line.isEmpty()) {
                        fileOut.println("<br>");
                    }
                    else {
                        fileOut.println(line);
                    }
                }

                fileOut.println("</body>");
                fileOut.println("</html>");
                System.out.println("HTML file is processed :)");
            }
            fileIn.close();
            fileOut.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("File not found");
        }

    }
}
