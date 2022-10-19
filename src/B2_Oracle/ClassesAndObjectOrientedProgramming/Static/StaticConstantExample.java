package Learning.FirstLearnign.ClassesAndObjectOrientedProgramming.Static;

public class StaticConstantExample {
    public static void main(String[] args) {
        double radius = 60;
        System.out.printf("Radius: %f \n", radius);
        System.out.printf("Area: %f \n", Math.PI * radius);
    }
}

class Math {
    public static final double PI = 3.14;
}
