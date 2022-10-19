package B4_Metanit.P3_ObjectOrientedProgramming.Abstract;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 6, 10, 5);
        rectangle1.getArea();
        rectangle1.getPerimeter();
        rectangle1.displayInfo();
    }

}
abstract class Figure {
    float x;
    float y;
    Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public abstract float getPerimeter();
    public abstract float getArea();
}
class Rectangle extends Figure {
    private float width;
    private float height;
    Rectangle(float x, float y, float width, float height) {
        super(x,y);
        this.width = width;
        this.height = height;
    }
    public float getPerimeter() {
        return width * 2 + height * 2;
    }
    public float getArea() {
        return height * width;
    }
    public void displayInfo() {
        System.out.println("Perimeter: " + getPerimeter() + "Area: " + getArea());
    }

}
