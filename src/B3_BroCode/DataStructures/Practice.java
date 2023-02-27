package B3_BroCode.DataStructures;

public class Practice {
    public static final int LENGTH = 20;

    public static void main(String[] args) {
        int[] array = new int[100000];
        int target = 5;

        for (int i = 0; i < array.length; i++){
            array[i] = i;
        }

        //int index = Arrays.binarySearch(array,target);
        int index = binarySearch(array,target);


        if (index == -1){
            System.out.println(target + " not found");
        }
        else {
            System.out.println("Element found at " + index);

        }

    }

    private static int binarySearch(int[] array, int target){
        int low = 0;
        int high = array.length - 1;
        int count = 0;

        while (low <= high) {
            int middle = low + (high - low) /2;
            int mid = array[middle];
            System.out.println("middle: " + mid + "; count: " + count);
            if (mid < target){
                low = middle + 1;
                count++;
            }
            else if (mid > target){
                high = middle - 1;
                count++;
            }
            else
                return middle;
        }
        return -1;
    }

}
