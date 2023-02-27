package A1_Programs.V1_DataStructuresAndAlgorithms.P2_SortingAlgorithms;

import java.util.Random;

public class P02_SortingAlgorithms {
    static final int LENGTH = 30;

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[LENGTH];
        for (int i = 0; i < LENGTH; i++) {
            int randVal = random.nextInt(LENGTH);
            array[i] = randVal;
        }
        printArray(array);
        quickSort(array,0, array.length - 1);
        printArray(array);


    }

    static void printArray(int[] array) {
        System.out.print("Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int temp = array[i];
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        return array;
    }

    static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        return array;
    }

    static void mergeSort(int[] array) {
        int length = array.length;
        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];
        int i = 0, j = 0;

        if (length <= 1) {
            return;
        }
        for (; i < array.length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);

    }

    static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int length = array.length;
        int leftSize = length / 2;
        int rightSize = length - leftSize;

        int i = 0, l = 0, r = 0;

        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                l++;
                i++;
            } else {
                array[i] = rightArray[r];
                r++;
                i++;
            }
        }
        while (l < leftSize) {
            array[i] = leftArray[l];
            l++;
            i++;
        }
        while (r < rightSize) {
            array[i] = rightArray[r];
            r++;
            i++;
        }


    }

    static void quickSort(int[] array, int start, int end){

        if (start >= end){return;}

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);

    }
    static int partition(int[] array, int start, int end){
        int pivot = array[end];
        int i = start - 1;
        for (int j = start; j  < end - 1; j ++){
            if (array[j] < pivot){
                i++;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        i++;
        int temp = array[end];
        array[end] = array[i];
        array[i] = temp;




        return i;
    }
}
