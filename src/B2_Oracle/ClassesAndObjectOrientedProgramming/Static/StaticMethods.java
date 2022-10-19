package Learning.FirstLearnign.ClassesAndObjectOrientedProgramming.Static;

public class StaticMethods {
    public static void main(String[] args) {

        Person3.displayCounter();

        Person3 tom = new Person3();
        Person3 bob = new Person3();

        Person3.displayCounter();
    }
}

class Person3 {
    private int id;
    private static int counter = 1;

    Person3() {
        id = counter++;
    }

    public static void displayCounter() {
        System.out.printf("Counter: %d \n", counter);
    }

    public void displayId() {
        System.out.printf("Id: %d \n", id);
    }
}
