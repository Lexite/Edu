package B4_Metanit.P8_LambdaExpressions.P1_Intro;

public class Generics {
    public static void main(String[] args) {
        Operationable2<Integer> operation1 = (x,y)-> x+y;
        Operationable2<String> operation2 = (x,y)-> x+y;

        System.out.println(operation1.calculate(10,20));
        System.out.println(operation2.calculate("10","20"));

    }
}

interface Operationable2<T>{
    T calculate(T x, T y);

}
