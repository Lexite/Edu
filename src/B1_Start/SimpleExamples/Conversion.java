package B1_Start.SimpleExamples;

public class Conversion {

    public static void main(String[] args) {
        int intValueOne = 50;
        long longValueOne = intValueOne;

        long longValueTwo = 50;
        int intValueTwo = (int) longValueTwo;

        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        short resutl = (short) longVal;
        short result1 = (short) (byteVal - longVal);
        float result3 = longVal - floatVal;

        System.out.println(result3);

        System.out.println("Success");
    }
}
