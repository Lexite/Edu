package B7_EndavaJavaCourses;

import java.util.ArrayList;
import java.util.Iterator;

public class P3_Iterator {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(2);
        numbers.add(11);
        numbers.add(8);
        numbers.add(5);
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            if (i<10){
                it.remove();
            }
        }
        System.out.println(numbers);


        numbers.add(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(3);
        numbers.add(6);
        Iterator<Integer> it2 = numbers.iterator();
        Integer myInt = 5;
        System.out.println(myInt.intValue());
        System.out.println(myInt);

    }
}
