/*package Class;

import java.awt.*;
import java.io.PrintStream;

public class computePayment {

    public double computePayment(
            double loanAmt,
            double rate,
            double futureValue,
            int numPeriods) {
        double interest = rate / 100.0;
        double partial1 = Math.pow((1 + interest),
                -numPeriods);
        double denominator = ((1 - partial1) / interest);
        double answer = (-loanAmt / denominator)
                - ((futureValue * partial1) / denominator);
        return answer;
    }

    public Polygon polygonFrom(Point... corners) {
        int numberOfSides = corners.length;
        double squareOfSide1, lengthOfSide1;
        squareOfSide1 = (corners[1].x - corners[0].x)
                * (corners[1].x - corners[0].x)
                + (corners[1].y = corners[0].y)
                * (corners[1].y - corners[0].y);
        lengthOfSide1 = Math.sqrt(squareOfSide1);
        return null;
    }

    public PrintStream printf(String format, B2_Oracle.Object... args) {
        System.out.printf("%s: %d, %s%n", name, idnum, address);
        return null;
    }
}

public class Circle {
    private int x,y, radius;
    public void setOrigin(int x, int y) {
        ...
    }
}

 */