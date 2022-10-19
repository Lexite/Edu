package B4_Metanit.P9_Threads.P5_WaitAndNotify;

public class P1 {
    public static void main(String[] args) {

        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        new Thread(producer).start();
        new Thread(consumer).start();

    }
}



class Store{
    private int product = 0;
    public synchronized void get(){
        while(product<1){
            try {
                wait();
            }
            catch (InterruptedException ex){
            }
        }
        product--;
        System.out.println("Consumer bought one item");
        System.out.println("Items in store: " + product);
        notify();
    }
    public synchronized void put(){
        while(product>=3){
            try{
                wait();
            }
            catch (InterruptedException ex){
            }
        }
        product++;
        System.out.println("Producer added 1 item");
        System.out.println("Items in store " + product);
        notify();
    }
}
class Producer implements Runnable{
    Store store;
    Producer(Store store){
        this.store = store;
    }
    public void run(){
        for (int i = 1; i < 6; i++){
            store.put();
        }
    }
}
class Consumer implements Runnable{
    Store store;
    Consumer(Store store){
        this.store = store;
    }
    public void run(){
        for (int i = 1; i < 6; i++){
            store.get();
        }
    }
}