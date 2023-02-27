package A1_Programs.V1_DataStructuresAndAlgorithms.P2_SortingAlgorithms;

import java.util.Random;

public class P7_MergeSort {
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
        mergeSort(array1);

        System.out.println();
        System.out.println("Sorted array: ");
        for (int i : array1) {
            System.out.print(i + " ");
        }
    }

    static void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1) return;

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0;
        int j = 0;
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
        int leftSize = length /2;
        int rightSize = length - leftSize;

        int i = 0, l = 0, r = 0;

        while (l < leftSize && r < rightSize){
            if(leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while(l < leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while(r < rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }

    }
}
