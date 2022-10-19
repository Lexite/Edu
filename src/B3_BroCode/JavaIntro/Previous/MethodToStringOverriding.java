package B3_BroCode.JavaIntro.Previous;
public class MethodToStringOverriding {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);
    }
}
class Car{
    String name = "toyota";
    String model = "avensis";
    String color = "red";
    int year = 2021;
    public String toString(){
        return name + " " + model + " " + color + " " + year;
    }
}
