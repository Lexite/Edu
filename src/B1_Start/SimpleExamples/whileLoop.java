package B1_Start.SimpleExamples;

public class whileLoop {

    public static void main(String[] args) {
        int someValue = 4;
        int factorial = 1;
        while(someValue > 1) {
            factorial *= someValue;
            someValue--;
        }
        System.out.println(factorial);
    }
}
