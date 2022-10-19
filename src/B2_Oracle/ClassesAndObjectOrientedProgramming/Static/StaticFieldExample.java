package Learning.FirstLearnign.ClassesAndObjectOrientedProgramming.Static;

public class StaticFieldExample {
    public static void main(String[] args) {
        Person tom = new Person();
        Person bob = new Person();

        tom.displayId();
        bob.displayId();
        System.out.println(Person.counter);

        Person.counter = 8;

        Person same = new Person();
        same.displayId();

    }
}


class Person {
    private int id;
    static int counter = 1;

    Person() {
        id = counter++;
    }
    public void displayId() {
        System.out.printf("Id: %d \n", id);
    }
}
