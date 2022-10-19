package B4_Metanit.P8_LambdaExpressions.P1_Intro;

public class CodeBlocks {
    public static void main(String[] args) {
        Operationable operation = (x, y) -> {
            if(y==0)
                return 0;
            else
                return x/y;
        };
        System.out.println(operation.calculate(100,20));
        System.out.println(operation.calculate(20,0));
    }
}
