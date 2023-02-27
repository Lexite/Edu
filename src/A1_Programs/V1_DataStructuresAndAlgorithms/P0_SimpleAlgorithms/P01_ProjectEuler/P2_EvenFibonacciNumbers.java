package A1_Programs.V1_DataStructuresAndAlgorithms.P0_SimpleAlgorithms.P01_ProjectEuler;

public class P2_EvenFibonacciNumbers {
    static final int NUM = 4_000_000;
    public static void main(String[] args) {
        int length = 40;
        int[] fibSer = fiboSeries(length);
        printArray(fibSer);
        int[] fibSer4Mil = fiboSeriesUpTo4Mil(fibSer);
        printArray(fibSer4Mil);
        int sum = sumOfEvenFiboNumbers(fibSer4Mil);
        System.out.println(sum);
    }

    static int[] fiboSeries(int length){
        int[] array = new int[length];
        array[0] = 1;
        array[1] = 2;

        for (int i = 2; i < length; i ++){
            array[i] = array[i-1] + array[i-2];
        }
        return array;
    }
    static int[] fiboSeriesUpTo4Mil(int[] array) {
        int i = 0;

        while (array[i] < NUM){
        i++;
        }

        int[] newArray = new int[i];
        for (int j = 0; j < i; j ++){
            newArray[j] = array[j];
        }


        return newArray;
    }
    static int sumOfEvenFiboNumbers(int[] array){
        int sum = 0;

        for (int i = 0; i < array.length; i ++){
            if (array[i] % 2 == 0){
                sum = sum + array[i];
                System.out.print(sum + " ");
            }
        }
        return sum;
    }

    static void printArray(int[] array){
        System.out.println("Array");
        for (int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }



}
