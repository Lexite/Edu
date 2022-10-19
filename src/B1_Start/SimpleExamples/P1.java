package B1_Start.SimpleExamples;
public class P1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1,2,5,10);
        System.out.println(rectangle.getPerimiter());
        System.out.println(rectangle.getArea());
    }
}
abstract class Figure{
    float x;
    float y;
    Figure(float x, float y){
        this.x = x;
        this.y = y;
    }
}
class Rectangle extends Figure{
    float width;
    float height;

    Rectangle(float x, float y, float width, float height){
        super(x,y);
        this.width = width;
        this.height = height;
    }
    public float getPerimiter() {
        return width*2 + height*2;
    }
    public float getArea() {
        return width*height;
    }
}





