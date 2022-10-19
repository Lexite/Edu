package B4_Metanit.P5_Collections.MapAndHashMap;
import java.util.*;
public class Program {
    public static void main(String[] args) {
        Map<Integer, String> states = new HashMap<Integer, String>();
        states.put(1, "Germany");
        states.put(2, "Belgium");
        states.put(3, "France");
        states.put(4, "Italy");

        String first = states.get(2);
        System.out.println(first);
        Set<Integer> keys = states.keySet();
        Collection<String> values = states.values();

        states.replace(1, "Poland");
        states.remove(2);

        for (Map.Entry<Integer, String> item : states.entrySet()) {
            System.out.printf("Key: %d Value: %s \n", item.getKey(), item.getValue());
        }

        Map<String, Person> people = new HashMap<String, Person>();
        Person tom = new Person("Tom");
        Person bill = new Person("Bill");
        Person nick = new Person("Nick");
        people.put("1240i54", tom);
        people.put("1564i55", bill);
        people.put("4540i56", new Person("Nick"));

        for (Map.Entry<String, Person> item : people.entrySet()) {
            System.out.printf("Key: %s Value: %s \n", item.getKey(), item.getValue().getName());
        }
    }
}
class Person{
    private String name;
    public Person(String name) {
        this.name = name;
    }
    String getName(){return name;}
}
