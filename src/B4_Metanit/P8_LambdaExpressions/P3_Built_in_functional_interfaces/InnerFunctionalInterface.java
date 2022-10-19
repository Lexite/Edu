package B4_Metanit.P8_LambdaExpressions.P3_Built_in_functional_interfaces;
import java.util.Scanner;

public class InnerFunctionalInterface {
    public static void main(String[] args) {
        Predictable<Integer> isPositive = x -> x > 0;
        Predictable<Character> isA = x -> x == 'A';

        System.out.println(isPositive.test(5));
        System.out.println(isPositive.test(-5));

        System.out.println(isA.test('A'));
        System.out.println(isA.test('B'));
        System.out.println(isA.test('a'));

        BinaryOperator<Integer> multiply = (x, y) -> x*y;
        System.out.println(multiply.apply(3, 5));
        System.out.println(multiply.apply(10, -2));

        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(5));

        Function<Integer, String> convert = x -> String.valueOf(x) + " dollars";
        System.out.println(convert.apply(5));

        Consumer<Integer> printer = x -> System.out.printf("%d dollars \n",x);
        printer.accept(600);

        Supplier<User1> userFactory = () -> {
            Scanner in = new Scanner(System.in);
            System.out.println("Your name: ");
            String name = in.nextLine();
            return new User1(name);
        };

        User1 u1 = userFactory.get();
        User1 u2 = userFactory.get();

        System.out.println("Name u1: " + u1.getName());
        System.out.println("Name u2: " + u2.getName());

    }

}

class User1{
    private String name;
    String getName(){return name;}
    User1(String name){
        this.name = name;
    }
}
