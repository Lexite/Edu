package B1_Start.SimpleExamples;
import java.util.Random;
public class RemoveDuplicatesBySortingCounting {
    public static int randomNumber() {
        int upperBound = 500;
        Random random = new Random();
        int randomNumber = random.nextInt(upperBound);
        return randomNumber;
    }
    public static int[] randomArray(int arrayLength) {
        int[] randomArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i ++) {
            randomArray[i] = randomNumber();
        }
        return randomArray;
    }
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    public static int[] numbers() {
        int startingValue = 0;
        int upperBound = 500;
        int[] numbers = new int[upperBound];
        for (int i = 0; i < upperBound; i ++) {
            numbers[i] = startingValue;
            startingValue++;
        }
        return numbers;
    }
    public static int[] removeDuplicates(int[] array,int[] numbers) {
        int l = 0;
        int j = 0;
        int count = 0;
        int[] removeDuplicates = new int[numbers.length];
        for (int i = 0; i < numbers.length; i ++) {
            for (int n = 0; n < array.length; n ++) {
                if (array[n] == numbers[i]) {
                    count++;
                }
            }
            if (count != 0) {
                removeDuplicates[l] = numbers[i];
                l++;
            }
            else {
                j++;
            }
            /* System.out.print(numbers[i] + " - " + count + ":    ");
            for (int f: removeDuplicates) {
                System.out.print(f + " ");
            }
            System.out.print("     j = " + j);
            System.out.println();
            */
            count = 0;
        }
        int[] newRemoveDuplicates = new int[removeDuplicates.length-j];
        for (int y = 0; y < newRemoveDuplicates.length; y ++) {
            newRemoveDuplicates[y] = removeDuplicates[y];
        }
        return newRemoveDuplicates;
    }
    public static void main(String[] args) {
        var before = java.lang.System.nanoTime();
        int arrayLength = 2000000;
        int[] randomArray = randomArray(arrayLength);
        printArray(randomArray);

        System.out.println();
        System.out.println();
        int[] numbers = numbers();
        int[] removeDuplicates = removeDuplicates(randomArray,numbers);
        printArray(removeDuplicates);
        var after = java.lang.System.nanoTime();
        System.out.println("time taken: " + (after-before)/1000000000 + " seconds");

    }

}
