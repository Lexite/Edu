package B4_Metanit.P5_Collections;

import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> states = new TreeSet<String>();

        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Great Britain");

        for (String state: states) {
            System.out.print("[" + state + "] ");
        }

        System.out.println();
        System.out.println("first: " + states.first());
        System.out.println("last: " + states.last());

        SortedSet<String> set = states.subSet("Germany",true, "Italy",true);
        System.out.println("set: " + set);

        String greater = states.higher("Germany");
        String lower = states.lower("Germany");

        NavigableSet<String> navSet = states.descendingSet();

        SortedSet<String> setLower = states.headSet("Germany",true);
        SortedSet<String> setGreater = states.tailSet("Germany",true);

        System.out.println("greater: " + greater);
        System.out.println("lower: " + lower);
        System.out.println("navSet: " + navSet);
        System.out.println("setLower: " + setLower);
        System.out.println("setGreater: " + setGreater);

        System.out.printf("TreeSet contains %d elements \n", states.size());

        // удаление элемента
        states.remove("Germany");
        for(String state : states){

            System.out.print("[" + state + "] ");
        }
    }
}