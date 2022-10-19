package B4_Metanit.P3_ObjectOrientedProgramming.Generics;

public class Program {
    public static void main(String[] args) {

        Account acc1 = new Account(2334, 5000); // id - число
        int acc1Id = (int)acc1.getId();
        System.out.println(acc1Id);
        System.out.println();

        Account acc2 = new Account("sid5523", 5000);    // id - строка
        System.out.println(acc2.getId());
        System.out.println();

        Account1<String> acc4 = new Account1<String>("2345",5000);
        String acc4Id = acc4.getId();
        System.out.println(acc4Id);
        System.out.println();

        Account1<Integer> acc5 = new Account1<Integer>(2345,5000);
        Integer acc5Id = acc5.getId();
        System.out.println(acc5Id);
        System.out.println();

        Accountable<String> acc6 = new Account2("1235rwr", 5000);
        Account2 acc7 = new Account2("2373", 4300);
        System.out.println(acc6.getId());
        System.out.println(acc7.getId());
        System.out.println();

        Account3<String> acc8 = new Account3<String>("1235rwr",5000);
        Account3<String> acc9 = new Account3<String>("2373",5000);
        System.out.println(acc8.getId());
        System.out.println(acc9.getId());
        System.out.println();

        Printer printer = new Printer();
        String[] people = {"T", "A", "S", "K", "B", "H"};
        Integer[] numbers = {23, 4, 5, 6, 13, 456, 4};
        printer.<String>print(people);
        System.out.println();
        printer.<Integer>print(numbers);
        System.out.println();
        System.out.println();

        Account4<String, Double> acc10 = new Account4<String, Double>("354",5000.87);
        String id = acc10.getId();
        Double sum = acc10.getSum();
        System.out.printf("Id: %s Sum: %f \n", id, sum);
        System.out.println();

        Account5 acc11 = new Account5("cid2373", 5000);
        Account5 acc12 = new Account5(53534, 4000);
        System.out.println(acc11.getId());
        System.out.println(acc12.getId());
        System.out.println();

    }
}
interface Accountable<T>{
    T getId();
    int getSum();
    void setSum(int sum);
}
class Printer{
    public <T> void print(T[] items) {
        for (T item: items) {
            System.out.print(item);
        }
    }
}
class Account{
    private Object id;
    private int sum;

    Account(Object id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public Object getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}
class Account1<T> {
    private T id;
    private int sum;

    Account1(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }
    public T getId() {return id;}
    public int getSum(){return sum;}
    public void setSum(int sum){this.sum = sum;}

}
class Account2 implements Accountable<String>{
    private String id;
    private int sum;

    Account2(String id, int sum) {
        this.id = id;
        this.sum = sum;
    }
    public String getId() {return id;}
    public int getSum() {return sum;}
    public void setSum(int sum) {this.sum = sum;}

}
class Account3<T> implements Accountable<T> {
    private T id;
    private int sum;

    Account3(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {return id;}
    public int getSum() {return sum;}
    public void setSum(int sum) {this.sum = sum;}


}
class Account4<T,S>{
    private T id;
    private S sum;

    Account4(T id, S sum) {
        this.id = id;
        this.sum = sum;
    }
    public T getId() {return id;}
    public S getSum() {return sum;}
    public void setSum(S sum) {this.sum = sum;}
}
class Account5{
    private String id;
    private int sum;

    <T>Account5(T id, int sum) {
        this.id = id.toString();
        this.sum = sum;
    }

    public String getId() {return id;}
    public int getSum() {return sum;}
    public void setSum(int sum) {this.sum = sum;}
}
class Account6{}
