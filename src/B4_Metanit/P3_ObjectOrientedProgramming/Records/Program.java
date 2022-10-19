package B4_Metanit.P3_ObjectOrientedProgramming.Records;

public class Program {
    public static void main(String[] args) {
        Person tom = new Person("Tom", 36);
        System.out.println(tom.name());
        System.out.println(tom.age());
        System.out.println(tom.hashCode());
        System.out.println();

        Person bob = new Person("Bob", 21);
        Person tomas = new Person("Tom", 36);
        System.out.println(tom.equals(bob));
        System.out.println(tom.equals(tomas));
        System.out.println();

        Person tom1 = new Person("Tom", 36);
        System.out.println(tom1.toString());
        System.out.println(tom1.name());
        System.out.println();

        Person1 tom2 = new Person1("Tom", "Smith",42);
        System.out.println(tom2.toString());
        System.out.println();

        Person2 p2 = new Person2("Alex", 25);
        System.out.println(p2.toString());
        System.out.println(p2.name());
        System.out.println();

        Person3 p3 = new Person3("Andrew", 26);
        System.out.println(p3.toString());


    }
}
record Person(String name, int age){
    Person(String name, int age) {
        if (age < 1 || age > 110) age = 18;
        this.name = name;
        this.age = age;
    }
}

record Person1(String name, int age) {
    Person1(String firstName, String lastName, int age) {
        this(firstName + " " + lastName, age);
    }
}

record Person2(String name, int age) {
    public String name() {return "Mister " + name;}
    public String toString() {
        return String.format("Person %s, Age: %d", name, age);
    }
}

record Person3(String name, int aeg) {
    static int minAge;
    static{
        minAge = 18;
        System.out.println("Static initializer");
    }
}
