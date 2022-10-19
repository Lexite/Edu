package B4_Metanit.P3_ObjectOrientedProgramming.Generics.LImit;

public class Program {

    public static void main(String[] args) {
        Account acc1 = new Account("1",4500);
        Account acc2 = new Account("2", 5000);
        Transaction<Account> tran1 = new Transaction<Account>(acc1,acc2, 4000);
        tran1.execute();
        tran1 = new Transaction<>(acc2,acc1, 4000);
        tran1.execute();
        System.out.println();


        AccountT<String> acc3 = new AccountT<String>("3", 4500);
        AccountT<String> acc4 = new AccountT<String>("4", 1500);
        TransactionString<AccountT<String>> tran2 = new TransactionString<AccountT<String>>(acc3,acc4,4000);
        tran2.execute();
        tran2 = new TransactionString<AccountT<String>>(acc3,acc4,4000);
        tran2.execute();
        System.out.println();
        System.out.println();

        AccountInterface acc5 = new AccountInterface("1235rwr",5000);
        AccountInterface acc6 = new AccountInterface("2373", 4300);
        TransactionInterface<AccountInterface> tran3 = new TransactionInterface<AccountInterface>(acc5,acc6, 1560);
        tran3.execute();


    }
}

class Transaction<T extends Account>{

    private T from;     // с какого счета перевод
    private T to;       // на какой счет перевод
    private int sum;    // сумма перевода

    Transaction(T from, T to, int sum){
        this.from = from;
        this.to = to;
        this.sum = sum;
    }
    public void execute(){

        if (from.getSum() > sum)
        {
            from.setSum(from.getSum() - sum);
            to.setSum(to.getSum() + sum);
            System.out.printf("Account %s: %d \nAccount %s: %d \n",
                    from.getId(), from.getSum(),to.getId(), to.getSum());
        }
        else{
            System.out.printf("Operation is invalid");
        }
    }
}
class Account {
    private String id;
    private int sum;
    Account (String id, int sum) {
        this.id = id;
        this.sum = sum;
    }
    public String getId() {return id;}
    public int getSum() {return sum;}
    public void setSum(int sum) {this.sum = sum;}
}

class TransactionString<T extends AccountT<String>>{
    private T from;
    private T to;
    private int sum;
        TransactionString (T from, T to, int sum) {
        this.from = from;
        this.to = to;
        this.sum = sum;
    }
    public void execute() {
        if (from.getSum() > sum) {
            from.setSum(from.getSum() - sum);
            to.setSum((to.getSum() + sum));
            System.out.printf("Account %s: %d \nAccount %s: %d \n",
                    from.getId(),from.getSum(),to.getId(),to.getSum());
        }
        else {
            System.out.printf("Operation is invalid");
        }
    }

}
class AccountT<T>{
    private T id;
    private int sum;
    AccountT (T id, int sum) {
        this.id = id;
        this.sum = sum;
    }
    public T getId() {return id;}
    public int getSum() {return sum;}
    public void setSum(int sum) {this.sum = sum;}
}

interface Accountable {
    String getId();
    int getSum();
    void setSum(int sum);
}
class AccountInterface implements Accountable {
    private String id;
    private int sum;
    AccountInterface(String id, int sum) {
        this.id = id;
        this.sum = sum;
    }
    public String getId() {
        return id;
    }
    public int getSum() {
        return sum;
    }
    public void setSum(int sum) {
        this.sum = sum;
    }
}
class TransactionInterface<T extends Accountable> {
    private T from;
    private T to;
    private int sum;
    TransactionInterface(T from, T to, int sum) {
        this.from = from;
        this.to = to;
        this.sum = sum;
    }
    public void execute(){
        if (from.getSum() > sum) {
            from.setSum(from.getSum() - sum);
            to.setSum(to.getSum() + sum);
            System.out.printf("Account %s: %d \nAccount %s: %d \n",
                    from.getId(),from.getSum(),to.getId(),to.getSum());
        }
        else {
            System.out.printf("Operation is invalid");
        }
    }



}

class Person{}
interface Accountable1{}
class Transaction1<T extends Person & Accountable1>{}