package B3_BroCode.JavaIntro.L85_Multhithreading;

public class Main {
    public static void main(String[] args) throws InterruptedException{

    MyThread thread1 = new MyThread();
    MyRunnable runnable1 = new MyRunnable();
    Thread thread2 = new Thread(runnable1);

    thread1.setDaemon(true);
    thread2.setDaemon(true);

    thread1.start();
    //thread1.join(3000); // calling thread (ex.main) waits until thread1 dies for x millis.
    thread2.start();

        System.out.println(1/0);


    }

}
