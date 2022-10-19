package B1_Start.SimpleExamples;

import java.util.Scanner;

public class OneFibonacci {

    public static void main (String[] args) {
        System.out.println("Enter number up to which Fibonnaci series to print");
        int number = new Scanner(System.in).nextInt();
        System.out.println("Fibonnaci series up to " + number + " numbers:");
        for (int i = 1; i <= number; i++) {
            System.out.print(fibonnaciIteration(i) + " ");
        }
        System.out.println("and");
        for (int i = 1; i <= number; i++) {
            System.out.print(fibonnaciRecursion(i) + "");
        }
    }



    public static int fibonnaciRecursion (int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonnaciRecursion(number - 1) + fibonnaciRecursion(number - 2);
    }

    /*
    * fibRec(1) = 1;
    * fibRec(2) = 1;
    * fibRec(3) = 2;    fibRec(2) + fibRec(1) = 1 + 1 = 2
    * fibRec(4) = 3;    fibRec(3) + fibRec(2) = 2 + 1 = 3
    * fibRec(5) = 5;    fibRec(4) + fibRec(3) = 3 + 2 = 5
    *
    *
    *
    *
    */


    public static int fibonnaciIteration (int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        int fibo1 = 1;
        int fibo2 = 1;
        int fibonnaci = 1;
        for (int i = 3; i <= number; i++) {
            fibonnaci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonnaci;
        }
        return fibonnaci;
    }
}






/* Fibonnaci series - 1 1 2 3 5 8 12 20 32 52 84
сложить два предыдущих числа
первое число 0? второе 1? 3ее тоже один
надо вести первые два значения массива фиббоначи

*
*
*
* */