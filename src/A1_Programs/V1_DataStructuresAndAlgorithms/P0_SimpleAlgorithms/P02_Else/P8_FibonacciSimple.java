package A1_Programs.V1_DataStructuresAndAlgorithms.P0_SimpleAlgorithms.P02_Else;

public class P8_FibonacciSimple {
    public static void main(String[] args) {
        fibonacciNumber(15);

    }
    static void fibonacciNumber(int count){
        int n1 = 0;
        int n2 = 1;
        int n3;
        int i;

        if (count < 3){
            System.out.print(n1 + " " + n2);
        }
        else {
            System.out.print(n1 + " " + n2);
            for (i = 2; i < count; ++i){
                n3 = n1 + n2;
                System.out.print(" "  + n3);
                n1 = n2;
                n2 = n3;
            }
        }
    }
}
