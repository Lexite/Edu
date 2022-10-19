package B5_JavaRush;

public class Car {
    public static void main(String[] args) {
        Vehicle honda = new Vehicle();
        honda.setModelName("Avec");
        honda.setSpeed(90);
        String avec = honda.getModelName();
        int avecSpeed = honda.getSpeed();

        System.out.println(avec + " " + avecSpeed);

    }
}

class Vehicle {
    private String modelName;
    private int speed;

    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
