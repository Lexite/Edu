package A1_Programs.V1_DataStructuresAndAlgorithms.P1_SearchingAlgorithms;

import java.util.Random;

public class P2_BinarySearch {
    static final int LENGTH = 20;

    public static void main(String[] args) {
        int target = 25;
        int[] array = new int[LENGTH];

        Random random = new Random();
        array[0] = 1;
        for (int i = 0; i < LENGTH; i ++) {

            //System.out.println("i = " + i + "; value = " + array[i]);
            array[i] = squared(i+1);
            System.out.println("i:" + i + ": " + array[i] + " ");
        }

        System.out.println();
        System.out.println();

        int index = binarySearchMethod(array,target);

        if (index == -1){
            System.out.println(target + " was not found");
        }
        else {
            System.out.println("Element found at index " + index);
        }



    }

    static int binarySearchMethod(int[] array, int target){
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {

            int middle = low + (high - low) / 2;
            int middleValue = array[middle];

            System.out.println(middleValue);

            if (middleValue < target){
                low = middle + 1;
            }
            else if (middleValue > target){
                high = middle - 1;
            }
            else return middle;
        }

        return -1;
    }

    static int squared(int x){
        int y = x * x;
        return y;
    }



}
