package B1_Start.SimpleExamples;

public class RecursiveFactorial {
    static final int number = 11;
    public static void main(String[] args) {
        int num = 2;
        int factorial = 1;
        int factorial1 = factorial(num,factorial);
        System.out.println(factorial1);

    }
    public static int factorial(int num, int factorial){
        if (number == 0 || number == 1) {
            return 1;
        }
        else if (num == number) {
            return factorial;
        }
        factorial = factorial * num;
        System.out.println("num = " + num + ";" + " factorial = " + factorial);
        num++;
        return factorial(num, factorial);
    }
}
