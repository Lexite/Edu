package A1_Programs.V1_DataStructuresAndAlgorithms.P0_SimpleAlgorithms.P01_ProjectEuler;

public class P1_MultiplesOf3And5 {

    public static void main(String[] args) {
        int length = 1000;
        System.out.println(sumOfMultiples(length));

    }

    static int sumOfMultiples(int length){
        int sum = 0;

        for (int i = 0; i < length; i ++){
            if (i % 3 == 0 || i % 5 == 0){
                sum += i;
                System.out.println("i = " + i + " sum = " + sum);
            }
        }
        return sum;
    }
}
