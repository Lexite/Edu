package A1_Programs.V1_DataStructuresAndAlgorithms.P0_SimpleAlgorithms.P02_Else;

public class P2_FindTheLargestNumber {
    public static void main(String[] args) {
        System.out.println(largestNumber(50,475,2551));

    }
    static int largestNumber(int a, int b, int c){
        int largestNumber = 0;

        if (a > b){
            if (a > c){
                largestNumber = a;
            }
            else largestNumber = c;
        }
        else {
            if (b > c){
                largestNumber = b;
            }
            else largestNumber = c;
        }
        return largestNumber;
    }
}
