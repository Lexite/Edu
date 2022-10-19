package Learning.FirstLearnign.ClassesAndObjectOrientedProgramming.Constructors;

public class ConstructorsExample1 {
    public static void main(String[] args) {
        Constructor1 alex = new Constructor1();
        alex.displayInfo();

        alex.name = "Alex";
        alex.age = 25;
        alex.displayInfo();

    }
}

class Constructor1 {
    String name;
    int age;

    void displayInfo() {
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }




}
