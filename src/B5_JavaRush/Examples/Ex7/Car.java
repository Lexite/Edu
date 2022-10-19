package B5_JavaRush.Examples.Ex7;

public class Car {

    Engine engine = new Engine();


    class Engine {
        private boolean isRunning = false;
        public void start() {
            if (!isRunning){
                isRunning = true;
            }
            System.out.println(isRunning);
        }
        public void stop() {
            if (isRunning){
                isRunning = false;
            }
            System.out.println(isRunning);
        }

        class InnerEngine{
        }
    }
}


