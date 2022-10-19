package B4_Metanit.P9_Threads.P2_Threads;
class JThread extends Thread{
    JThread(String name){
        super(name);
    }
    @Override
    public void run(){
        System.out.printf("%s started ... \n", Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}
class MyThread implements Runnable{
    @Override
    public void run(){
        System.out.printf("%s started... \n", Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}
public class Program {
    public static void joinTryCatch(Thread thread){
        try {
            thread.join(); //main thread waits until JThread is finished
        }
        catch (InterruptedException e){
            System.out.printf("%s has been interrupted", thread.getName());
        }
    }
    public static void startJoin(Thread thread){
        thread.start();
        joinTryCatch(thread);
    }

    public static void main(String[] args) {
        System.out.println("Main thread started...");
        //JThread thread1 = new JThread("JThread");
        //thread1.start();

        //for(int i = 1; i < 6; i++)
        //    new JThread("JThread " +i).start();



        Runnable r = ()->{
            System.out.printf("%s started... \n",Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                System.out.print("Thread has been interrupted");
            }
            System.out.printf("%s finished... \n", Thread.currentThread().getName());
        };





        JThread thread1 = new JThread("JThread");
        MyThread myThread2 = new MyThread();
        Thread thread2 = new Thread(myThread2,"MyThread2");
        Thread thread3 = new Thread(new MyThread(),"MyThread3");
        Thread thread4 = new Thread(r,"MyThread4");

        startJoin(thread1);
        startJoin(thread2);
        startJoin(thread3);
        startJoin(thread4);

        System.out.println("Main thread finished...");
    }
}
