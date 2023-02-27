package A1_Programs.V1_DataStructuresAndAlgorithms.P2_SortingAlgorithms;

import java.util.Random;

public class P8_QuickSort {
    final static int LENGTH = 100;

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[LENGTH];
        int[] array1 = {2,3,8,7,4,9,1,0,6,5};

        System.out.println("Array: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        quickSort(array, 0, array.length - 1);

        System.out.println();
        System.out.println("Sorted array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    static void quickSort(int[] array, int start, int end) {

        if(end <= start) return;
        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);

    }

    static int partition(int[] array, int start, int end){

        int pivot = array[end];
        int i = start-1;

        for (int j = start; j <= end; j ++){
            if (array[j] < pivot) {
                i++;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;

    }

}
