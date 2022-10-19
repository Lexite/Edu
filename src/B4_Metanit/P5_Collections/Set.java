package B4_Metanit.P5_Collections;
import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet<String> states = new HashSet<String>();

        states.add("Germany");
        states.add("France");
        states.add("Italy");

        boolean isAdded = states.add("Germany");
        System.out.println(isAdded);

        System.out.printf("Set contains %d elements \n", states.size());

        for (String state: states) {
            System.out.print(state);
        }
        System.out.println();

        states.remove("Germany");

        HashSet<Person1> people = new HashSet<Person1>();
        people.add(new Person1("Mike"));
        people.add(new Person1("Tom"));
        people.add(new Person1("Nick"));

        for (Person1 p : people) {
            System.out.println(p.getName());
        }
    }

}

class Person1 {
    private String name;
    public Person1(String value) {
        name = value;
    }
    String getName() {return name;}
}
