package A1_Programs.V1_DataStructuresAndAlgorithms.P1_SearchingAlgorithms;

import java.util.Random;

public class P1_LinearSearch {

    static final int LENGTH = 1000;

    public static void main(String[] args) {
        int target = 558;
        int[] array = new int[LENGTH];

        Random random = new Random();
        for (int i = 0; i < LENGTH; i ++) {
            array[i] = random.nextInt(1000);
            System.out.println("i = " + i + "; value = " + array[i]);
        }

        System.out.println();
        System.out.println();
        int index = linearSearchMethod(array,target);
        if (index == -1){
        System.out.println("The target value "  + target + " was not found");
        }
        else {
        System.out.println("Target value " + target + " was found at index " + index);
        }

    }

    public static int linearSearchMethod(int[] array, int target){

        for (int i  = 0; i < array.length; i ++){
            if (array[i] == target){
                return i;
            }
        }
        return -1;
    }


}
