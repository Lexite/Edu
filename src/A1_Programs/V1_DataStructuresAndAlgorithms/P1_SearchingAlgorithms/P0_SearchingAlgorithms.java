package A1_Programs.V1_DataStructuresAndAlgorithms.P1_SearchingAlgorithms;


public class P0_SearchingAlgorithms {
    static final int LENGTH = 10;
    public static void main(String[] args) {
        int[] array = new int[LENGTH];
        for (int i = 0; i < LENGTH; i ++){
            array[i] = (int)Math.pow(2,i);
        }
        printArray(array);

        int target1 = 128;
        int target2 = 32;
        int target3 = 4;

        int index1 = linearSearch(array, target1);
        int index2 = binarySearch(array, target2);
        int index3 = interpolationSearch(array, target3);

        printIndex(index1);
        printIndex(index2);
        printIndex(index3);
    }
    static void printArray(int[] array){
        System.out.println("Array: ");
        for (int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static int linearSearch(int[] array, int target){
        for (int i = 0; i < array.length; i ++){
            if (array[i] == target){
                return i;
            }
        }
        return -1;
    }
    static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (high >= low) {
            int middle = low + (high - low) / 2;
            System.out.println("middle: " + middle + "; array[middle]: " + array[middle]);
            if (target < array[middle]) {
                high = middle - 1;

            } else if (target > array[middle]) {
                low = middle + 1;
            }
            else {
                return middle;
            }

        }
        return -1;
    }
    static int interpolationSearch(int[] array ,int target){
        int low = 0;
        int high = array.length - 1;

        while (high >= low) {
            int probe = low + (high - low) * (target - array[low]) / (array[high] - array[low]);
            System.out.println("probe: " + probe + "; array[probe]: " + array[probe]);

            if (target < array[probe]) {
                high = probe - 1;

            } else if (target > array[probe]) {
                low = probe + 1;
            }
            else {
                return probe;
            }

        }
        return -1;
    }
    static void printIndex(int index){
        if (index == -1){
            System.out.println("The value was not found");
        }
        else {
            System.out.println("The value was found at index: " + index);
        }
    }
}
