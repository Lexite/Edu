package A1_Programs.V1_DataStructuresAndAlgorithms.P2_SortingAlgorithms;

import java.util.Random;

public class P4_BubbleSort {
    final static int LENGTH  = 10;

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[LENGTH];
        System.out.print("Unsorted array: ");

        for (int i = 0; i < array.length; i ++){
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("Sorted array: ");
        bubbleSort(array);

        for (int i: array){
            System.out.print(i + " ");
        }


    }

    static int[] bubbleSort(int[] array){
        for (int i = 0; i < array.length; i ++){
            for (int j = 0; j < array.length - i - 1; j ++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
                printArray(array);
                System.out.println();
            }

        }
        return array;
    }
    static void printArray(int[] array){
        for (int i : array){
            System.out.print(i + " ");
        }
    }



}
