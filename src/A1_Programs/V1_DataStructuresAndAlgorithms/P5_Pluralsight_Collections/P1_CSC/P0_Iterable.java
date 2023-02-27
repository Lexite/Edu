package A1_Programs.V1_DataStructuresAndAlgorithms.P5_Pluralsight_Collections.P1_CSC;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class P0_Iterable {

    void printAll(Iterable<?> iterable) {
        Iterator<?> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
    // use first if you want to use remove method


    void printALl(Iterable<?> iterable) {
        for (Object obj : iterable) {
            System.out.println(obj);
        }
    }

    /*static <T> Iterable<T> nCopies(final T value, final int count) {
        if (count < 0) {
            throw new IllegalArgumentException("Negative count: " + count);
        }
        return new Iterable<T>() {

            @Override public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int rest = count;

                    @Override public boolean hasNext() {
                        return rest > 0;
                    }

                    @Override public T next() {
                        if (rest == 0)
                            throw new NoSuchElementException();
                        rest--;
                        return value;
                    }

                };
            }
        };
    }

     */

    static <T> Iterable<T> nCopies(final T value, final int count) {
        if (count < 0)
            throw new IllegalArgumentException("Negative count: " + count);
        return () -> new Iterator<T>() {
            int rest = count;
            @Override
            public boolean hasNext() {
                return rest > 0;
            }

            @Override
            public T next() {
                if (rest == 0)
                    throw new NoSuchElementException();
                rest--;
                return value;
            }
        };
    }
}






