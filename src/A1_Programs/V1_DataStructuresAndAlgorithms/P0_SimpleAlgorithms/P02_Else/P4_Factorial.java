package A1_Programs.V1_DataStructuresAndAlgorithms.P0_SimpleAlgorithms.P02_Else;

public class P4_Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(7));

    }
    static int factorial(int num){
        int factorial = 1;
        if (num == 0){
            return factorial;
        }
        else {

            factorial = num * factorial(num - 1);
        }
        return factorial;
    }
}
