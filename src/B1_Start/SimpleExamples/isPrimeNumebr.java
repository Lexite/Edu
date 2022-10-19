package B1_Start.SimpleExamples;

import java.util.Scanner;

public class isPrimeNumebr {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int number = Integer.MAX_VALUE;
        System.out.println("Eneter number to check if prime or not");
        while (number != 0) {
            number = scnr.nextInt();
            System.out.printf("Is %d prime? %s %s %s %n", number, isPrime(number), isPrimeOrNot(number), isPrimeNumber(number));
        }
    }


    public static boolean isPrime(int number) {
        int sqrt = (int) Math.sqrt(number) + 1; //sqrt = sqrt(4) + 1 = 3
        for (int i = 2; i < sqrt; i++) {        // for i < [sqrt(number) +1]
            if (number % i == 0) {              // if number / i is a whole number
                return false;                   //
            }
        }
        return true;
    }

    public static boolean isPrimeNumber(int number) {
        if (number == 2 || number ==3) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 3; i < sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String isPrimeOrNot(int num) {
        if (num < 0) {
            return "not valid";
        }
        if (num == 0 || num == 1) {
            return "not prime";
        }
        if ((num * num - 1) % 24 == 0) {
            return "prime";
        }
        else {
            return "not prime";
        }
    }

}
