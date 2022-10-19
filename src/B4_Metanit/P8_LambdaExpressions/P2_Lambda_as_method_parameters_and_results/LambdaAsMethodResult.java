package B4_Metanit.P8_LambdaExpressions.P2_Lambda_as_method_parameters_and_results;
public class LambdaAsMethodResult {
    public static void main(String[] args) {
        Operation1 func = action("sum");
        int a = func.execute(6,5);
        int b = action("minus").execute(8,2);
        int c = action("mult").execute(8,2);
        int d = action("defo").execute(8,2);


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
    private static Operation1 action(String method){
        switch(method){
            case "sum" -> { return (x,y) -> x+y;}
            case "minus" -> { return (x,y) -> x-y;}
            case "mult" -> { return (x,y) -> x*y;}
            default -> { return (x,y) -> 0;}
        }
    }
}

interface Operation1{
    int execute(int x, int y);
}
