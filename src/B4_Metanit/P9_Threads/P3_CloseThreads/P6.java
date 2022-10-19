package B4_Metanit.P9_Threads.P3_CloseThreads;

public class P6 {
    public static void main(String[] args) {

        System.out.println("Main thread started...");
        JThread3 t = new JThread3("JThread");
        t.start();
        try{
            Thread.sleep(150);
            t.interrupt();

            Thread.sleep(150);
        }
        catch(InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
        System.out.println("Main thread finished...");
    }
}

class JThread3 extends Thread {

    JThread3(String name){
        super(name);
    }
    public void run(){
        System.out.printf("%s started... \n", Thread.currentThread().getName());
        int counter=1;
        try{
            while(!isInterrupted()){
                System.out.println("Loop " + counter++);
                Thread.sleep(100);
            }
        }
        catch (InterruptedException ex){
            System.out.println(getName() + " has been interrupted");
        }
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}

