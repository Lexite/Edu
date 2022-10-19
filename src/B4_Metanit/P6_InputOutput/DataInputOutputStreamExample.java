package B4_Metanit.P6_InputOutput;

import java.io.*;

public class DataInputOutputStreamExample {
    public static void main(String[] args) {
        Person tom = new Person("Ilya", 26, 1.80, true);
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("IlyaData.bin")))
        {
            dos.writeUTF(tom.name);
            dos.writeInt(tom.age);
            dos.writeDouble(tom.height);
            dos.writeBoolean(tom.married);
            System.out.println("File has been written");
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }

        try(DataInputStream dos = new DataInputStream(new FileInputStream("AlexeiData.bin")))
        {
            String name = dos.readUTF();
            int age = dos.readInt();
            double height = dos.readDouble();
            boolean married = dos.readBoolean();
            System.out.printf("Name: %s Age: %d Height: %f Married: %b",name,age,height,married);
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }






    }
}

class Person{
    public String name;
    public int age;
    public double height;
    public boolean married;

    public Person(String name, int age, double height, boolean married) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;
    }

}
