package Learning.FirstLearnign.ClassesAndObjectOrientedProgramming.Constructors;

public class ConstructorsExample4 {

    public static void main(String[] args) {
        Constructor4 alex = new Constructor4();
        alex.displayInfo();

        Constructor4 ilya = new Constructor4("Ilya");
        ilya.displayInfo();

        Constructor4 vasilii = new Constructor4("Vasilii", 25);
        vasilii.displayInfo();
    }
}

class Constructor4 {
    String name;
    int age;

    //initializer
    {
        name = "undefined";
        age = 18;
    }

    Constructor4() {

    }

    Constructor4(String name) {
        this.name = name;
    }

    Constructor4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }







}
