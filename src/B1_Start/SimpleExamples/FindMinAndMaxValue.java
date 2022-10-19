package B1_Start.SimpleExamples;

import java.util.Random;

public class FindMinAndMaxValue {

    public static void main(String[] args) {
        int size = 5;
        int upperbound = 20;
        int[] array = randomArray(size, upperbound);
        print(array);
        System.out.print("\n");
        //arrayMax(array);
        //arrayMin(array);
        if (array.length == 0) {
            System.out.println("epmty array");
        }
        if (array.length != 0) {
        System.out.println("min value = " + arrayMin(array) + "; max value = " + arrayMax(array));
        }
    }

    static int[] randomArray(int size, int upperbound) {
        int[] randomarray = new int[size];
        Random number = new Random();

        for (int i = 0; i < size; i++) {
            int newNumber = number.nextInt(upperbound);
            randomarray[i] = newNumber;
        }
        return randomarray;
    }

    static void print(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    public static int arrayMax(int[] array) {
        int max = 0;
        if (array.length == 0) {
            System.out.println("empty array");
        } else if (array.length != 0) {
            max = array[0];
            for (int i = 0; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
                //System.out.print("index " + array[i] + "; max " + max);
            }
        }
        return max;
    }

    public static int arrayMin(int[] array) {
        int min = 0;
        if (array.length == 0) {
            System.out.println("empty array");
        } else if (array.length != 0) {
            min = array[0];
            for (int i = 0; i < array.length; i++) {
                if (min < array[i]) {
                    min = array[i];
                }
                return min;
                //System.out.print("index " + array[i] + "; max " + max);
            }
        }
        return min;
    }
}




