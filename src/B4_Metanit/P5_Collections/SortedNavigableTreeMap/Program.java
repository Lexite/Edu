package B4_Metanit.P5_Collections.SortedNavigableTreeMap;
import java.util.*;
public class Program {
    public static void main(String[] args) {

        TreeMap<Integer, String> states = new TreeMap<Integer, String>();
        Map<String, Person> people = new TreeMap<String, Person>();
            states.put(10, "Germany");
            states.put(2, "Spain");
            states.put(14, "France");
            states.put(3, "Italy");

            String first = states.get(2);
            for (Map.Entry<Integer, String> item : states.entrySet()) {
                System.out.printf("Key: %d Value: %s \n", item.getKey(), item.getValue());
            }

            Set<Integer> keys = states.keySet();
            Collection<String> values = states.values();
            Map<Integer, String> afterMap = states.tailMap(4);
            Map<Integer, String> beforeMap = states.headMap(10);
            Map.Entry<Integer, String> lastItem = states.lastEntry();
            System.out.printf("Last item has key %d value %s \n", lastItem.getKey(), lastItem.getValue());

            people.put("1240i56", new Person("Tom"));
            people.put("1240i57", new Person("Ben"));
            people.put("1240i58", new Person("Helen"));
            people.put("1240i59", new Person("Rich"));

        for(Map.Entry<String, Person> item : people.entrySet()) {
            System.out.printf("Key: %s Value: %s \n", item.getKey(), item.getValue().getName());
        }
    }
}
class Person{
    private String name;
    public Person(String name){
        this.name = name;
    }
    String getName(){return name;}
}
