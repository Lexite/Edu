package B4_Metanit.P8_LambdaExpressions.P1_Intro;

public class TerminalLambaExpressions {
    public static void main(String[] args) {

        Printable p1 = new Printable() {
            @Override
            public void print(String s) {
                System.out.println("Hello world" + s);
            }
        };



        Printable printer = s -> System.out.println(s);
        printer.print("Hello Java!");
        p1.print("Alexei");
    }
}

interface Printable{
    void print(String s);
}
