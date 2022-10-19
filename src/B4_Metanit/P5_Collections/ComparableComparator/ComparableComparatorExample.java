package B4_Metanit.P5_Collections.ComparableComparator;
import java.util.*;
public class ComparableComparatorExample {
    public static void main(String[] args) {
        TreeSet<Person> people = new TreeSet<Person>();
        people.add(new Person("Tom"));
        people.add(new Person("Alex"));
        people.add(new Person("Richard"));
        people.add(new Person("Alisha"));
        people.add(new Person("Rosey"));
        for (Person person : people) {
            System.out.print("[" + person.getName() + "] ");
        }
        System.out.println();

        TreeSet<PersonLength> peopleLength = new TreeSet<PersonLength>();
        peopleLength.add(new PersonLength("Alex"));
        peopleLength.add(new PersonLength("Ilyuhaaaaaa"));
        peopleLength.add(new PersonLength("Vasiliy"));
        peopleLength.add(new PersonLength("Natashaagaaaaaaaa"));
        peopleLength.add(new PersonLength("Elena"));
        for (PersonLength person : peopleLength) {
            System.out.print("[" + person.getName() + "] ");
        }
        System.out.println();

        PersonComparator pcomp = new PersonComparator();
        TreeSet<Person> people1 = new TreeSet<Person>(pcomp);
        people1.add(new Person("Tom"));
        people1.add(new Person("Hue"));
        people1.add(new Person("Howard"));
        people1.add(new Person("Bob"));
        people1.add(new Person("Alex"));
        for (Person p : people1) {
            System.out.print("[" + p.getName() + "] ");
        }
        System.out.println();

        Comparator<Person1> p1comp = new PersonNameComparator().thenComparing(new PersonAgeComparator());
        TreeSet<Person1> people2 = new TreeSet(p1comp);
        people2.add(new Person1("Tom",23));
        people2.add(new Person1("Nick",34));
        people2.add(new Person1("Tom",10));
        people2.add(new Person1("Bill",14));
        people2.add(new Person1("Helen",34));

        for (Person1 p : people2) {
            System.out.print("{[" + p.getName() + "][" + p.getAge() + "]} ");
        }

    }
}
class Person implements Comparable<Person> {
    private String name;
    Person(String name){
        this.name = name;
    }
    String getName(){return name;}
    public int compareTo(Person p) {
        return name.compareTo(p.getName());
    }
}
class PersonLength implements Comparable<PersonLength> {
    private String name;
    PersonLength(String name) {
        this.name = name;
    }
    String getName() {return name;}
    public int compareTo(PersonLength p) {
        return name.length() - p.getName().length();
    }
}
class PersonComparator implements Comparator<Person> {
    public int compare(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }
}
class Person1{
    private String name;
    private int age;
    public Person1(String n, int a) {
        name = n;
        age = a;
    }
    String getName() {return name;}
    int getAge() {return age;}
}
class PersonNameComparator implements Comparator<Person1>{
    public int compare(Person1 a, Person1 b){
        return a.getName().compareTo(b.getName());
    }
}
class PersonAgeComparator implements Comparator<Person1>{
    public int compare(Person1 a, Person1 b) {
        if(a.getAge()>b.getAge())
            return 1;
        else if (a.getAge()<b.getAge())
            return -1;
        else
            return 0;
    }
}
