package B4_Metanit.P9_Threads.P6_Semafors;
import java.util.concurrent.Semaphore;
public class P1 {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);
        CommonResource res = new CommonResource();
        new Thread(new CountThread(res,sem,"CountThread 1")).start();
        new Thread(new CountThread(res,sem,"CountThread 2")).start();
        new Thread(new CountThread(res,sem,"CountThread 3")).start();

    }
}

class CommonResource{
    int x = 0;
}
class CountThread implements Runnable{
    CommonResource res;
    Semaphore sem;
    String name;
    CountThread(CommonResource res, Semaphore sem, String name){
        this.res = res;
        this.sem = sem;
        this.name = name;
    }
    public void run(){
        try{
            System.out.println(name + " ожидает разрешение");
            sem.acquire();
            res.x = 1;
            for (int i = 1; i < 5; i++){
                System.out.println(this.name + ": " + res.x);
                res.x++;
                Thread.sleep(100);
            }
        }
        catch (InterruptedException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(name + " освобождает разрешение");
        sem.release();
    }
}
