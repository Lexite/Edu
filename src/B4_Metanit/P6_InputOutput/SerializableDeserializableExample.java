package B4_Metanit.P6_InputOutput;
import java.io.*;
import java.util.ArrayList;

public class SerializableDeserializableExample {
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
            Person1 p = new Person1("Sam",33,178,true);
            oos.writeObject(p);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat"))){
            Person1 p = (Person1)ois.readObject();
            System.out.printf("Name: %s \t Age: %d \n",p.getName(),p.getAge());
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        String filename = "people.dat";
        ArrayList<Person1> people = new ArrayList<Person1>();
        people.add(new Person1("Alex",25, 178, false));
        people.add(new Person1("Vasilii", 26, 188, false));
        people.add(new Person1("Ilya", 26, 179, true));

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))){
            oos.writeObject(people);
            System.out.println("File has been written");
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        ArrayList<Person1> newPeople = new ArrayList<Person1>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){
            newPeople = (ArrayList<Person1>)ois.readObject();
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        for(Person1 p : newPeople)
            System.out.printf("Name: %s \t Age: %d \n",p.getName(),p.getAge());



    }
}
class Person1 implements Serializable{
    private String name;
    private int age;
    private transient double height;
    private transient boolean married;
    Person1(String name, int age, double height, boolean married) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;
    }
    String getName(){return name;}
    int getAge(){return age;}
    double getHeight(){return height;}
    boolean getMarried(){return married;}

}
