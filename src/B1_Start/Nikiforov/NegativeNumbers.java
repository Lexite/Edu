package Learning.FirstLearnign.Nikiforov;

public class NegativeNumbers {
    public static void main(String[] args) {
        byte maxByteValue = 0b01111111; //127 - max byte
        System.out.println(maxByteValue);
        byte minusOne = (byte) 0b11111111;
        System.out.println(minusOne);
        byte one = 0b00000001;
        System.out.println(one);
        System.out.println("1 + (-1) = ");
        System.out.println(minusOne + one);

    }
}
