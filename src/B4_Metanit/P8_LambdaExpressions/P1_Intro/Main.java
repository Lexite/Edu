package B4_Metanit.P8_LambdaExpressions.P1_Intro;

public class Main {
    public static void main(String[] args) {
        Operationable operation1 = (x,y) -> x+y;
        Operationable operation2 = (x,y) -> x-y;
        Operationable operation3 = (x,y) -> x*y;
        Operationable operation4 = (x,y) -> x/y;


        int result1 = operation1.calculate(100,20);
        int result2 = operation2.calculate(100,20);
        int result3 = operation3.calculate(100,20);
        int result4 = operation4.calculate(100,20);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}
interface Operationable{
    int calculate(int x, int y);
}
