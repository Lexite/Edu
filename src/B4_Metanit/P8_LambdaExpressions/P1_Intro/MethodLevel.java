package B4_Metanit.P8_LambdaExpressions.P1_Intro;


public class MethodLevel {
    public static void main(String[] args) {
        int n = 70;
        int m = 30;
        Operation op = () -> {
            return m + n;
        };
        System.out.println(op.calculate());
    }
}


