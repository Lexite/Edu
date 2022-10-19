package Learning.FirstLearnign.ClassesAndObjectOrientedProgramming.Constructors;
public class ConstructorsExample3 {
    public static void main(String[] args) {
        Constructor3 alex = new Constructor3();
        Constructor3 ilya = new Constructor3("Ilya");
        Constructor3 vasilii = new Constructor3("Vasilii", 25);
        alex.displayInfo();
        ilya.displayInfo();
        vasilii.displayInfo();
    }
}
class Constructor3 {
    String name;
    int age;
    int b;
    int c;

    Constructor3() {
        this("Undefined", 18);
       // this(2,5);
    }
    Constructor3(String name) {
        this(name, 18);
    }
    Constructor3(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Constructor3(int b, int c) {
        this.b = b;
        this.c = c;
    }
    void displayInfo() {
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}


