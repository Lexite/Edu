package B4_Metanit.P5_Collections.Iterators;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<String>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");
        Iterator<String> iter = states.iterator();
        while(iter.hasNext()) {
            System.out.print(iter.next()+ " ");
        }
        System.out.println();
        ListIterator<String> listIterator = states.listIterator();

        while (listIterator.hasNext()) {
            System.out.print(listIterator.next()+ " ");
        }
        System.out.println();

        listIterator.set("Portugal");

        while(listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
    }
}
