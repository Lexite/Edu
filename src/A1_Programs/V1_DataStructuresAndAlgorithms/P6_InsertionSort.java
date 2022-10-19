package A1_Programs.V1_DataStructuresAndAlgorithms;

import java.util.Random;

public class P6_InsertionSort {
    final static int LENGTH = 30;

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[LENGTH];

        System.out.println("Array: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        insertionSort(array);

        System.out.println();
        System.out.println("Sorted array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }


    }

    static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i ++){
            int j = i - 1;
            int temp = array[i];

            while (j >= 0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }





            printArray(array);
            System.out.println();


        return array;
    }
    static void printArray(int[] array){
        for (int i : array){
            System.out.print(i + " ");
        }
    }

}