package A1_Programs.V1_DataStructuresAndAlgorithms.P2_SortingAlgorithms;

import java.util.Random;

public class P5_SelectionSort {
    final static int LENGTH = 100;

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[LENGTH];

        System.out.println("Array: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        selectionSort(array);

        System.out.println();
        System.out.println("Sorted array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i ++){
            int min = i;
            for (int j = i+1; j < array.length; j ++){
                if (array[min] > array[j]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        }




        return array;
    }
    static int[] selectionSort1(int[] array) {
        for (int i = 0; i < array.length; i++){
            int min = i;
            for (int j = i; j < array.length-1; j ++){
                if (array[min] > array[j+1]){
                    min = j+1;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }





        return array;
    }
}