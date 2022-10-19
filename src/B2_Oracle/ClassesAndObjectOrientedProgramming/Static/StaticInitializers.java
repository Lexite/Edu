package Learning.FirstLearnign.ClassesAndObjectOrientedProgramming.Static;

public class StaticInitializers {
    public static void main(String[] args) {

        Person2 tom = new Person2();
        Person2 bob = new Person2();

        tom.displayId();
        bob.displayId();

    }
}

class Person2 {
    private int id;
    static int counter;

    static{
        counter = 105;
        System.out.println("Static initializer");
    }
    Person2() {
        id = counter++;
        System.out.println("Constructor");
    }

    public void displayId() {
        System.out.printf("Id: %d \n", id);

    }
}
