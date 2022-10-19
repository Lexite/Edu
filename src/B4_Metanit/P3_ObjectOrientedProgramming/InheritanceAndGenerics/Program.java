package B4_Metanit.P3_ObjectOrientedProgramming.InheritanceAndGenerics;

public class Program {
    public static void main(String[] args) {
        DepositAccountSimple dAccountSimple1 = new DepositAccountSimple();
        System.out.println(dAccountSimple1.getId());

        DepositAccount<Integer,String> dAccount1 = new DepositAccount<Integer, String>(20,"Alex");
        System.out.println(dAccount1.getId() + " : " + dAccount1.getName());
        DepositAccount<String, Integer> dAccount2 = new DepositAccount<String, Integer>("12345",23546);
        System.out.println(dAccount2.getId() + " : " +  dAccount2.getName());

        DepositAccountGeneric<String> dAccountGeneric1 = new DepositAccountGeneric<String>("Richard","561");
        System.out.println(dAccountGeneric1.getId() + " : " + dAccountGeneric1.getName());

        DepositAccount1<Integer> depAccount = new DepositAccount1(10);
        Account1<Integer> account = (Account1<Integer>)depAccount;
        System.out.println(account.getId());

        DepositAccount1<Integer> depAccount1 = new DepositAccount1(10);
        //Account1<String> account1 = (Account<String>)depAccount1; // inconvertible types - Integer to String




    }

    }
class Account<T> {
    private T _id;
    T getId(){return _id;}
    Account(T id){
        _id = id;
    }
}
class DepositAccountSimple extends Account<Integer> {
    DepositAccountSimple(){
        super(5);
    }
}
class DepositAccount<T,S> extends Account<T> {
    private S _name;
    S getName(){return _name;}
    DepositAccount(T id, S name) {
        super(id);
        this._name = name;
    }
}

class AccountSimple {
    private String _name;
    String getName() {return  _name;}
    AccountSimple (String name) {
        _name = name;
    }
}
class DepositAccountGeneric<T> extends AccountSimple {
    private T _id;
    T getId() {return _id;}
    DepositAccountGeneric(String name, T id) {
        super(name);
        _id = id;
    }
}

class Account1<T> {
    private T _id;
    T getId() {return _id;}
    Account1(T id) {
        _id = id;
    }
}
class DepositAccount1<T> extends Account1<T>{
    DepositAccount1(T id) {
        super(id);
    }
}




