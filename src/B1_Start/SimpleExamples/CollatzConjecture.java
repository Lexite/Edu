package B1_Start.SimpleExamples;

import java.util.Random;

public class CollatzConjecture {

    public static void main(String[] args) {
        int upperbound = 10000;
        Random number = new Random();
        int num = number.nextInt(upperbound);
        collatzConjecture(num);
    }


    public static int collatzConjecture(int num) {
        System.out.println(num);
        if (num < 2) {
            return num;
        }
        else if (num % 2 == 0) {
            num = num / 2;
            //System.out.print("/2=");
        }
        else {
            num = num * 3 + 1;
            //System.out.print("*3+1=");
        }
        return collatzConjecture(num);
    }
}
