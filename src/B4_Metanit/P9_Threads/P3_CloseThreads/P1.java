package B4_Metanit.P9_Threads.P3_CloseThreads;

public class P1{
    public static void main(String[] args) {
        System.out.println("Main thread started...");


        MyThread myThread = new MyThread();
        new Thread(myThread,"MyThread").start();
        try{
            Thread.sleep(1100);
            myThread.disable();
            Thread.sleep(1000);
        }
        catch (InterruptedException ex){
            System.out.println("Thread has been interrupted");
        }


        MyThread myThread1 = new MyThread();
        new Thread(myThread1,"MyThread").start();
        try{
            Thread.sleep(1100);
            myThread1.disable();
            Thread.sleep(1000);
        }
        catch (InterruptedException ex){
            System.out.println("Thread has been interrupted");
        }


        System.out.println("Main thread finished...");
    }
}
class MyThread implements Runnable{
    private boolean isActive;
    void disable(){
        isActive=false;
    }
    MyThread(){
        isActive=true;
    }
    public void run(){
        System.out.printf("%s started... \n", Thread.currentThread().getName());
        int counter = 1;
        while(isActive){
            System.out.println("loop " +counter++);
            try {
                Thread.sleep(400);
            }
            catch (InterruptedException e){
                System.out.println("Thread has been interrupted");
            }
        }
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}