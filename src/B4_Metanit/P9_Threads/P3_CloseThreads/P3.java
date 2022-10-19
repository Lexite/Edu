package B4_Metanit.P9_Threads.P3_CloseThreads;

public class P3 {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        MyThread1 myThread = new MyThread1();
        Thread t = new Thread(myThread,"MyThread");
        t.start();
        try{
            Thread.sleep(150);
            t.interrupt();
            Thread.sleep(150);
        }
        catch (InterruptedException ex){
            System.out.println("Thread has been interrupted");
        }
        System.out.println("Main thread finished...");
    }
}

class MyThread1 implements Runnable{
    public void run(){
        System.out.printf("%s started... \n",Thread.currentThread().getName());
        int counter = 1;
        while(!Thread.currentThread().isInterrupted()){
            System.out.println("Loop " + counter++);
        }
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}
