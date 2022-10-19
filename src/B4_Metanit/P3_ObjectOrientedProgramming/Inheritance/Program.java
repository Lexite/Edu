package B4_Metanit.P3_ObjectOrientedProgramming.Inheritance;

public class Program {

    public static void main(String[] args) {

        Person tom = new Person("TOM");
        tom.display();
        Person sam = new Employee("Sam","Microsoft");
        sam.display();
        Employee alex = new Employee("Alex", "Cedrus");
        alex.work();
    }
}

class Person {
    String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name:" + name);
    }
}

class Employee extends Person {
    String company;

    public Employee(String name, String company) {
        super(name);
        this.company = company;
    }

    public void work() {
        System.out.printf("%s works in %s \n", getName(), company);
    }

    @Override
    public void display() {
        System.out.printf("Works in %s \n", company);
    }
}


