package A1_Programs.V1_DataStructuresAndAlgorithms.P0_SimpleAlgorithms.P01_ProjectEuler;

public class P7_PrimeNumber {
    final static int MAX = 1_000;
    public static void main(String[] args) {
        int desiredIndex = 10001;
        System.out.println(findPrimeVal(desiredIndex));

    }

    static boolean isPrime(int number) {

        int index = 0;
        int m = 0;
        int n = 0;
        m = number/2;
        int flag = 0;

        if(number < 2){return false;}
        else {
            for (int i = 2; i <= m; i++) {
                if (number % i == 0) {
                    flag = 1;
                    break;
                }
            }
        }
        return flag == 0;
    }

    static int findPrimeVal(int desiredIndex){
        int index = 1;
        int value = 0;
        int i = 2;



        while (index <= desiredIndex){
            if (isPrime(value)){
                index++;
            }
            value++;
        }
        return value-1;
    }
}



