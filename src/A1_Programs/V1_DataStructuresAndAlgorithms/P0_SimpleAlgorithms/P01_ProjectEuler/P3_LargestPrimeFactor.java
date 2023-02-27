package A1_Programs.V1_DataStructuresAndAlgorithms.P0_SimpleAlgorithms.P01_ProjectEuler;

public class P3_LargestPrimeFactor {
    static final int NUMBER = 11237;
    public static void main(String[] args) {
        boolean isPrime = isPrime(157);
        System.out.println(isPrime);

    }

    static boolean isPrime(int number){
        int index = 1;
        int i = 0;
        int middle = number/2;
        int flag = 0;

        if (number < 2){
            return false;
        }
        else {
            for (i = 2; i <= middle; i ++){
                if (number %  i == 0){
                    flag = 1;
                    break;
                }
                System.out.println(index);
                index++;

            }
        }
        return (flag == 0);
    }

}