package Learning.FirstLearnign.Operators;

public class BitDemo {
    public static void main(String[] args) {
        int bitmask = 0x000F;
        int val = 0x2222;
        System.out.println(val & bitmask);
        System.out.println(val | bitmask);
    }
}
