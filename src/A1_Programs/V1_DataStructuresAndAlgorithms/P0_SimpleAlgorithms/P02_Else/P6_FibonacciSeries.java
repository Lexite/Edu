package A1_Programs.V1_DataStructuresAndAlgorithms.P0_SimpleAlgorithms.P02_Else;

public class P6_FibonacciSeries {
    public static void main(String[] args) {
        int[] fibSer = fibonnaciSeries(15);

        for (int i : fibSer){
            System.out.print(i + " ");
        }

    }

    static int[] fibonnaciSeries(int max){
        int[] array = new int[max];
        if(max < 2){
            System.out.println("fib starts with 0 1");
            return null;
        }

        else if(max < 3){
            array[0] = 0;
            array[1] = 1;
            return array;
        }
        else {
            array[0] = 0;
            array[1] = 1;
            for (int i = 2; i < max; i++) {
                array[i] = array[i - 1] + array[i - 2];
            }
        }
        return array;
    }
}
