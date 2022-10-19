package B4_Metanit.P8_LambdaExpressions.P1_Intro;

public class ClassLevel {
    static int x = 10;
    static int y = 20;

    public static void main(String[] args) {
        Operation op = ()-> {
            x = 30;
            return x + y;
        };
        System.out.println(op.calculate());
        System.out.println(x);
    }
}

interface Operation{
    int calculate();
}
