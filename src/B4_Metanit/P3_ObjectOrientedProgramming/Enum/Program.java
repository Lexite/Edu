package B4_Metanit.P3_ObjectOrientedProgramming.Enum;

public class Program{

    public static void main(String[] args) {
        Book b1 = new Book("War and Peace", "L. Tolstoy", Type.BELLETRE);
        System.out.printf("Book '%s' has a type %s", b1.name, b1.bookType);
        switch(b1.bookType){
            case BELLETRE:
                System.out.println("Belletre");
                break;
            case SCIENCE:
                System.out.println("Science");
                break;
            case SCIENCE_FICTION:
                System.out.println("Science fiction");
                break;
            case PHANTASY:
                System.out.println("Phantasy");
                break;
        }
        Type[] types = Type.values();
        for (Type s : types) {
            System.out.println(s);
        }
        System.out.println(Type.BELLETRE.ordinal());

        System.out.println(Color.RED.getCode());
        System.out.println(Color.GREEN.getCode());

        Operation op = Operation.SUM;
        System.out.println(op.action(10,4));
        op = Operation.MULTIPLY;
        System.out.println(op.action(6,4));
        op = Operation.SUBTRACT;
        System.out.println(op.action(6,4));
        op = Operation.DIVIDE;
        System.out.println(op.action(6,4));
    }
}
class Book{
    String name;
    Type bookType;
    String author;
    Book(String name, String author, Type type){
        bookType = type;
        this.name = name;
        this.author = author;
    }
}
enum Type {
    SCIENCE,
    BELLETRE,
    PHANTASY,
    SCIENCE_FICTION
}
enum Color {

    RED("#FF0000"),
    BLUE("#0000FF"),
    GREEN("#00FF00");

    private String code;
    Color(String code) {
        this.code = code;
    }
    public String getCode() {
        return code;
    }
}
enum Operation {
    SUM {
        public int action(int x, int y) {
            return x + y;
        }
    },
    SUBTRACT {
        public int action(int x, int y) {
            return x - y;
        }
    },
    MULTIPLY {
        public int action(int x, int y) {
            return x * y;
        }
    },
    DIVIDE {
        public int action(int x, int y) {
            return x / y;
        }
    };
    public abstract int action(int x, int y);
}