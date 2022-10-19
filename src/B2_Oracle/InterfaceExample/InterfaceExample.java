package Learning.FirstLearnign.InterfaceExample;

public class InterfaceExample implements WaterBottleInterface {

    public static void main(String[] args) {
        System.out.println(color);
        InterfaceExample ex = new InterfaceExample();
        ex.fillUp();


    }

    @Override
    public void fillUp() {
        System.out.println("It is filled ");
    }
}
