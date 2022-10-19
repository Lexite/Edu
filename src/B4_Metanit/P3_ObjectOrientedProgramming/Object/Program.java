package B4_Metanit.P3_ObjectOrientedProgramming.Object;

public class Program {
    public static void main(String[] args) {
        Person tom = new Person("Tom");
        System.out.println(tom.toString());
        System.out.println(tom.hashCode());
        System.out.println(tom.getClass());

        Person bob = new Person("Bob");
        System.out.println(tom.equals(bob));
        Person tom2 = new Person("Tom");
        System.out.println(tom.equals(tom2));
    }
}

class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }

    public String toString() {
        return "Person" + name;
    }
    public int hashCode() {
        return 10 * name.hashCode() + 20456;
    }
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) return false;

        Person p = (Person)obj;
        return this.name.equals(p.name);
    }
}
