package B4_Metanit.P5_Collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> states = new LinkedList<String>();

        states.add("Russia");
        states.add("UKraine");
        states.addLast("Moldova");
        states.addFirst("Romania");
        states.add(1,"Bulgaria");

        System.out.println();

        System.out.printf("List has %d elements \n",states.size());
        System.out.println(states.get(1));
        states.set(1,"Poland");
        for (String state: states) {
            System.out.println(state);
        }

        if(states.contains("Russia")){
            System.out.println("List contains Russia");
        }
        states.remove("Russia");
        states.removeFirst();
        states.removeLast();

        LinkedList<Person1> people = new LinkedList<Person1>();
        people.add(new Person1("Mike"));
        people.addFirst(new Person1("Tomas"));
        people.addLast(new Person1("Nick"));
        people.remove(1);

        for(Person1 p : people) {
            System.out.println(p.getName());
        }
        Person1 first = people.getFirst();
        System.out.println(first.getName());
        System.out.println();


        System.out.println("States: ");
        for (String state : states) {
            System.out.print(state + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Names: ");
        for (Person1 person  : people) {
            System.out.print(person.getName() + " ");
        }



    }

}

class Person{
    private String name;
    public Person(String value) {
        name = value;
    }
    String getName() {return name;}
}
