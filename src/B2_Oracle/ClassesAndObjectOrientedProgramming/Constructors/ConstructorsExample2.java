package Learning.FirstLearnign.ClassesAndObjectOrientedProgramming.Constructors;

public class ConstructorsExample2 {
    public static void main(String[] args) {
        Constructor2 defaultD = new Constructor2();
        Constructor2 ilya = new Constructor2("Ilya");
        Constructor2 vasilii = new Constructor2("Vasilii", 25);

        defaultD.displayInfo();
        ilya.displayInfo();
        vasilii.displayInfo();
    }
}

class Constructor2 {
    String name;
    int age;

    Constructor2() {
        name = "Undefined";
        age = 18;
    }

    Constructor2(String name) {
        this.name = name;
        age = 18;
    }

    Constructor2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }






}
