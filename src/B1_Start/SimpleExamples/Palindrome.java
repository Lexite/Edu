package B1_Start.SimpleExamples;
public class Palindrome {
    public static void main(String[] args) {
        String text = "IOHOHOI";
        char[] array = text.toCharArray();
        printArray(array);
        printReverseArray(array);
        compressArray(array);
    }
    public static char[] compressArray(char[] array) {
        if (array.length < 2) {
            return isPalindrome();
        }
        else if (array.length > 1) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] != reverseArray(array)[i]) {
                    return notPalindrome();
                } else {
                    array = compress(array,i);
                }
            }
        }
        return compressArray(array);
    }
    public static char[] compress(char[] array, int iterationNumber) {
        char[] compressArray = new char[array.length - 2];
        for (int n = 0; n < compressArray.length; n++) {
            compressArray[n] = array[n + 1];
        }
        array = compressArray;
        System.out.println(array);
        return array;
    }
    public static char[] reverseArray(char[] array) {
        int i = 0;
        int n = 0;
        char[] reverseArray = new char[array.length];
        for (i = array.length - 1; i >= 0; i--) {
            reverseArray[n] = array[i];
            n++;
        }
        return reverseArray;
    }
    public static char[] notPalindrome() {
        String text = "The array is not a palindrome";
        char[] notPalindrome = text.toCharArray();
        System.out.println(notPalindrome);
        return notPalindrome;
    }
    public static char[] isPalindrome() {
        String text = "The array is a palindrome";
        char[] isPalindrome = text.toCharArray();
        System.out.println(isPalindrome);
        return isPalindrome;
    }
    public static void printArray(char[] array) {
        System.out.print(array);
        System.out.print(" - array");
        System.out.print("\n");
    }
    public static void printReverseArray(char[] array) {
        System.out.print(reverseArray(array));
        System.out.print(" - reverse array");
        System.out.print("\n");
    }
}