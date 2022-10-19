package B4_Metanit.P8_LambdaExpressions.P4_Else;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
public class NN {
    static final int minN = -100;
    static final int maxN =  100;
    static final int totalElements = 20_000;
    public static void main(String[] args) {
        BooleanLogic isEven = (n) -> n % 2 == 0;
        Random r = new Random();
        var arr = IntStream.generate(() -> r.nextInt(minN,maxN)).limit(totalElements).toArray();
        System.out.println("Array before: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Array after: ");
        long before = System.nanoTime();
        //final int[] answer = applyLogic(arr,isEven);
        int[] newArr = new int[0];
        for (int i: arr){
            if (i%2==0)
            System.out.print(i +" ");
        }
        System.out.println();
        long after = System.nanoTime();
        System.out.println("Taken time: " + (after - before) / 1_000_000 + " millis");
    }

    public static void printArray(int[] array) {
        System.out.print("[ ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }
    public static int[] deleteElementByIndex(int[] array,int i){
        int[] newArray = new int[array.length-1];
        for (int n = 0; n < i; n ++){
            newArray[n]=array[n];
        }
        for (int n = i; n < newArray.length; n ++){
            newArray[n]=array[n+1];
        }
        array=newArray;
        return array;
    }
    public static int[] applyLogic(int[] array, BooleanLogic booleanLogic){
        for (int i = 0; i < array.length; i++){
            if(booleanLogic.booleanLogic(array[i])==false){
                array = deleteElementByIndex(array,i);
                i--;
            }
        }
        return array;
    }
}

