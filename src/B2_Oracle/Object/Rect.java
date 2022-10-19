package B2_Oracle.Object;

public class Rect {
    private int x, y;
    private int width, height;


    public Rect() {
        this(0,0,1,1);
    }

    public Rect(int width, int height) {
        this(0,0,width,height);
    }

    public Rect(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

}
