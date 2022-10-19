package B5_JavaRush;

public class Solution {
    public static void main(String[] args) {
        Window window = new Window();
        window.printSize();
        window.changeSize(4,5);
        window.printSize();
    }
}

class Window {
    private int height = 2;
    private int width = 3;

    public void changeSize(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight(){return height;}
    public int getWidth(){return width;}

    public void printSize(){
        System.out.println("Height = " + getHeight());
        System.out.println("Width = " + getWidth());
    }
}