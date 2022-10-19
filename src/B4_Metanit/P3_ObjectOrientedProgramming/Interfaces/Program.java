package B4_Metanit.P3_ObjectOrientedProgramming.Interfaces;
public class Program {
    public static void main(String[] args) {
        Book b1 = new Book("Java", "H.Shildt"); //класс бук реализует функционал интерфейса
        b1.print();

        Printable printable = new Book("Java", "H.Shildt"); //создаем два объекта типа принтабл как экземпляры обоих классов
        printable.print();
        printable = new Journal("Foreign policy");
        printable.print();
        printable.printDefault();

        Printable p = new Journal("Foreign affairs");//переменная типа принтабл может хранить ссылку на объект типа журнал
        p.print();
        String name = ((Journal)p).getName();// интерфейс не имеет метода гетнаме, необходимо приведение
        System.out.println(name);// в интерфейсе нету метода, явным образом надо выполнить преобразование в тип журнал

        Printable.read();

        Calculatable c = new Calculation();
        System.out.println(c.sum(1,2));
        System.out.println(c.sum(1,2,4));

        WaterPipe pipe = new WaterPipe();
        pipe.printState(1);

        Printer.Printable p1 = new JournalNew("Foreign affairs");
        p1.print();

        Printable printable1 = createPrintable("Foreign affairs", false);
        printable1.print();
        read(new Book("Java", "C. Holms"));
        read(new Journal("Java Daily News"));
    }

    static void read(Printable p) {
        p.print();
    }
    static Printable createPrintable(String name, boolean option) {
        if (option)
            return new Book(name, "undefined");
        else
            return new Journal(name);
    }
}
class Book implements Printable, Searchable {
    String name;
    String authour;
    Book (String name, String authour) {
        this.name = name;
        this.authour = authour;
    }
    public void print() {
        System.out.printf("%s (%s) \n", name, authour);
    }
}
class Journal implements Printable {
    private String name;
    String getName() {
        return name;
    }
    Journal(String name) {
        this.name = name;
    }
    public void print() {
        System.out.println(name);
    }
}
interface Printable{
    void print();
    default void printDefault() {
        System.out.println("undefined printable");
    } //можно не определять метод в классе
    static void read() {
        System.out.println("Read printable");
    }
}
interface Searchable {}

class Calculation implements Calculatable {}
interface Calculatable {
    default int sum(int a, int b) {
        return sumAll(a,b);
    }
    default int sum(int a, int b, int c) {
        return sumAll(a,b,c);
    }
    private int sumAll(int ... values) {
        int result = 0;
        for (int i: values) {
            result += i;
        }
        return result;
    }
}

class WaterPipe implements Stateable {
    public void printState(int n) {
        if (n == OPEN)
            System.out.println("water is opened");
        else if (n == CLOSED)
            System.out.println("water is closed");
        else
            System.out.println("State is invalid");
    }
}
interface Stateable {
    int OPEN = 1; // по умолчанию public static final
    int CLOSED = 0;
    void printState(int n);
}

interface BookPrintable extends Printable {
    void paint();
}

class Printer {
    interface Printable {
        void print();
    }
}





