package B1_Start.SimpleExamples;
import java.util.Random;
public class RemoveDuplicatesFromAnArray {
    public static int randomNumber() {
        int upperBound = 25;
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
            System.out.print(i + ",");
        }
        System.out.println();
    }
    public static int[] shrinkArray(int i, int[] array) {
        int[] shrinkArray = new int[array.length-1];
        for (int n = 0; n < i; n ++) {
            shrinkArray[n] = array[n];
        }
        for (int n = i; n < shrinkArray.length; n ++) {
            shrinkArray[n] = array[n+1];
        }
        return shrinkArray;
    }
    public static int[] arrayWithoutDuplicates(int[] array) {
        int[] arrayWithoutDuplicates = new int[array.length];
        for (int i = 0; i < arrayWithoutDuplicates.length; i ++) {
            for (int n = 0; n < i; n ++) {
                if (array[i] == array[n]) {
                    arrayWithoutDuplicates = shrinkArray(i,array);
                    array = arrayWithoutDuplicates;
                    i--;
                    break;
                }
            }
        }
        return arrayWithoutDuplicates;
    }
    public static void main(String[] args) {
        int arrayLength = 50;
        int[] randomArray = randomArray(arrayLength);
        printArray(randomArray);
        int[] arrayWithoutDuplicates = arrayWithoutDuplicates(randomArray);
        System.out.println();
        printArray(arrayWithoutDuplicates);
    }
}