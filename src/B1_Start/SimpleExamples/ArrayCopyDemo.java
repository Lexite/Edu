package B1_Start.SimpleExamples;
import java.util.Arrays;
public class ArrayCopyDemo {
    public static void main(String[] args) {
        String[] copyFrom = {"Americano", "Cappuccino", "Corretoo", "Cortado", "Doppio",
                "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiatto", "Marocchino", "Ristretto"};

        String[] copyTo = new String[7];
        System.arraycopy(copyFrom,2,copyTo,0,7);
        for (String coffee: copyTo) {
            System.out.print(coffee + " ");
        }
        System.out.println();
        String[] copyTo2 = java.util.Arrays.copyOfRange(copyFrom,2,9);
        for (String coffee : copyTo2) {
            System.out.print(coffee + " ");
        }
        System.out.println();
        if (Arrays.equals(copyTo,copyTo2)) {
            System.out.println("The arrays are identical");
        }
        System.out.println();
        Arrays.binarySearch(copyFrom,"Freddo");
        for (String coffee: copyFrom) {
            System.out.print(coffee + " ");
            Arrays.fill(copyTo2, "val");
        }
        System.out.println();
        for (String coffee: copyTo2) {
            System.out.print(coffee + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(copyTo));
    }
}
