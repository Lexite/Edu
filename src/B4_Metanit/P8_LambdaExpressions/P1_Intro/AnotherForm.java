package B4_Metanit.P8_LambdaExpressions.P1_Intro;

public class AnotherForm {
    public static void main(String[] args) {
        Operationable1 operation = new Operationable1() {
            @Override
            public int calculate(int x, int y) {
                return x + y;
            }
        };
        int z = operation.calculate(20,10);
        System.out.println(z);
    }
}

interface Operationable1 {
    int calculate(int x, int y);
}
