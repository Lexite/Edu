package B1_Start.SimpleExamples;
import java.util.Scanner;
public class ArmstrongNumber {
    public static String arrayLength() {
        Scanner arrayLengthObject = new Scanner(System.in);
        System.out.println("Enter the number up to which to list Armstrong numbers");
        String arrayLength = arrayLengthObject.nextLine();
        System.out.println("List o" +
                " numbers up to " + (arrayLength) + " is:");
        return arrayLength;
        }
    public static int[] arrayOfNumbers(int arrayLength, int[] arrayOfNumbers) {
        for (int i = 0; i < arrayLength; i++) {
            arrayOfNumbers[i] = i + 1;
        }
        for (int i : arrayOfNumbers) {
            System.out.print(i + " ");
        }
        System.out.println();
        return arrayOfNumbers;
    }
    public static int[] convertNumberToNumberArray(int number) {
        String newNumber = Integer.toString(number);
        int[] newNumber1 = new int[newNumber.length()];
        for (int i = 0; i < newNumber.length(); i++) {
            newNumber1[i] = newNumber.charAt(i) - '0';
        }
        return newNumber1;
    }
    public static int[] cubeNumberArray(int[] numberArray) {
        int[] cubeNumberArray = new int[numberArray.length];
        for (int i = 0; i < numberArray.length; i ++) {
            cubeNumberArray[i] = numberArray[i]*numberArray[i]*numberArray[i];
        }
        return cubeNumberArray;
    }
    public static int sumOfCubeNumbers(int[] cubeNumberArray) {
        int sum = 0;
        for (int i = 0; i < cubeNumberArray.length; i ++) {
            sum = sum + cubeNumberArray[i];
        }
        return sum;
    }
    public static boolean isArmstrongNumber( int number, int sumOfCubeNumbers) {
        if (number == sumOfCubeNumbers)
            return true;
        else
            return false;
    }









    public static void main(String[] args) {
        int arrayLength = Integer.parseInt(arrayLength());
        int[] arrayOfNumbers = new int[arrayLength];
        arrayOfNumbers = arrayOfNumbers(arrayLength, arrayOfNumbers);
        for (int i = 0; i < arrayLength; i ++) {
            arrayOfNumbers[i] = i + 1;
            int[] numberArray = convertNumberToNumberArray(i);
            int[] cubeNumberArray = cubeNumberArray(numberArray);
            int sumOfCubeNumbers = sumOfCubeNumbers(cubeNumberArray);
            boolean isArmstrongNumber = isArmstrongNumber(sumOfCubeNumbers, i);
            if (isArmstrongNumber == true) {
                System.out.print(i + " ");
            }
        }
    }
}
