package B4_Metanit.P8_LambdaExpressions.P2_Lambda_as_method_parameters_and_results;

public class Parameters {
    public static void main(String[] args) {
        Calculate calc = (n) -> n < 10;
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int result = sumIf(numbers,calc);
        System.out.println(result);
    }

    private static int sumIf(int[] numbers, Calculate calc){
        int sum = 0;
        for (int i : numbers){
            if(calc.isValid(i))
            sum += i;
            System.out.println("i:" + i + " r:" + sum);
        }
        return sum;
    }
}

interface Calculate{

    boolean isValid(int n);
}