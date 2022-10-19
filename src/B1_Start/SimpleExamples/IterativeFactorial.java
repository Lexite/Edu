package B1_Start.SimpleExamples;

public class IterativeFactorial {
    static final int number = 11;
    static int factorialOfNumber;

    public static void main(String[] args) {
        int factorial = factorial(number);
        System.out.println(factorial);

    }

    public static int factorial(int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = i * factorial;
            System.out.println(factorial);
        }

        return factorial;
    }
}