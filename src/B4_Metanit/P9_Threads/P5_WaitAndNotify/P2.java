package B4_Metanit.P9_Threads.P5_WaitAndNotify;

public class P2 {
    static final int product1 = 600;
    static final int product2 = 1000;
    public static void main(String[] args) {
        Cedrus tfVisina4 = new Cedrus();
        Order panilino = new Order(tfVisina4,product1);
        Production product1 = new Production(tfVisina4);
        Accounting account1 = new Accounting(tfVisina4);
        Store1 store1 = new Store1(tfVisina4);

        Cedrus dgAlb = new Cedrus();
        Order franzeluta = new Order(dgAlb,product2);
        Production product2 = new Production(dgAlb);
        Accounting account2 = new Accounting(dgAlb);
        Store1 store2 = new Store1(dgAlb);


        new Thread(panilino).start();
        new Thread(store1).start();
        //new Thread(production).start();
        //new Thread(accounting).start();
        // new Thread(store1).start();

    }
}
class Cedrus{
    private int product = 0;

    private boolean isAvailable = false;
    private boolean isRequested = false;
    private boolean isProduced = false;
    private boolean isRegistered = false;

    public synchronized void get(){
        while(product<1){
            try{
                wait();
            }
            catch (InterruptedException ex){

            }
        }
    }
    public synchronized void produce(){
        while (product >= 2000){
            try {
                wait();
            }
            catch (InterruptedException ex){
            }
        }
        product += 200;
        System.out.println("Произведено 200 кг T/F Visina 4");
        System.out.println("T/F Visina 4 на складе: " + product + " кг");
        notify();
    }



    public synchronized void request(int amount){
        isRequested = true;
    }
    public synchronized void checkAvailability(int amount){
        if (amount < product){

        }
        else {
            isAvailable = true;
        }

    }
    public synchronized void transfer(){}
    public synchronized void register(){}
}
class Order implements Runnable{
    Cedrus cedrus;
    private int product;
    Order(Cedrus cedrus, int product){
        this.cedrus=cedrus;
        this.product = product;
    }
    public void run(){
        for (int i = 1; i < 10; i ++){
            cedrus.get();
        }
    }
}
class Production implements Runnable{
    Cedrus cedrus;
    Production(Cedrus cedrus){
        this.cedrus = cedrus;
    }
    public void run(){
        for (int i = 0; i < 10; i++){
            cedrus.produce();
        }
    }
}



class Store1 implements Runnable{
    Cedrus cedrus;
    Store1(Cedrus cedrus){
        this.cedrus = cedrus;
    }
    public void run(){
        for (int i = 0; i < 10; i++){
            cedrus.transfer();
        }
    }
}
class Accounting implements Runnable{
    Cedrus cedrus;
    Accounting(Cedrus cedrus){
        this.cedrus=cedrus;
    }
    public void run(){
        for (int i = 1; i < 10; i++){
            cedrus.register();
        }
    }
}
