package B1_Start.Arrays;

public class Arrays {

    public static void main(String[] args) {
        float[] theVals = new float[3];
        theVals[0] = 10.0f;
        theVals[1] = 20.0f;
        theVals[2] = 15.0f;
        float sum = 0.0f;
        float sum1 = 0.0f;


        for(int index = 0; index < theVals.length; index++)
            sum += theVals[index];
        System.out.println(sum);

        float[] theVals2 = { 7.0f, 26.0f, 35.0f };
        for(int index1 = 0; index1 < theVals2.length; index1++)
            sum1 += theVals2[index1];
        System.out.println(sum1);



    }
}
