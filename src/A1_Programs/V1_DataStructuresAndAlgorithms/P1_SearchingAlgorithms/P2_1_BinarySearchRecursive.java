package A1_Programs.V1_DataStructuresAndAlgorithms.P1_SearchingAlgorithms;

public class P2_1_BinarySearchRecursive {
    static final int LENGTH = 1000;
    public static void main(String[] args) {
        int[] array = new int[LENGTH];
        for (int i = 0; i < LENGTH; i ++){
            array[i] = i;
        }
        int result = binarySearch(array, 146, 0, LENGTH);
        if ( result == -1){
            System.out.println("not found");
        }
        else
            System.out.println("element found at index " + result);

    }
    static int binarySearch(int[] array, int x, int low, int high){
        if(high >= low) {
            int mid = low + (high - low) / 2;

            if (array[mid] == x)
                return mid;

            if (array[mid] > x)
                return binarySearch(array, x, low, mid - 1);

            return binarySearch(array, x, mid + 1, high);
        }
        return -1;
    }

}
