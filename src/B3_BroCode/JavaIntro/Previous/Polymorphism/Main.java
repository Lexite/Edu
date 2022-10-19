package B3_BroCode.JavaIntro.Previous.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Plane plane = new Plane();

        Vehicle[] vehicles = {car, bicycle, plane};
        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }
    }
}

