package B5_JavaRush.Examples.Ex1122;

public class Program{

    public static int salary;

    public static void add(int increase) {

        salary += increase;
    }
    public static void main(String[] args) {
        add(100500);
        System.out.println(salary);
        }
    }
