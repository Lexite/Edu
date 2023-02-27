package A1_Programs.V1_DataStructuresAndAlgorithms.P3_GrowthModel;

import java.util.Random;

public class P1_GrowthModel1 {

    static final double commission = 0.0008;
    static final double startingBalance = 100;
    static final double winRate = 0.33;

    static final int trades = 100;
    static final double stopLoss = 0.005;
    static final double profitFactor = 3;

    static double growthModel(double balance, double stopLoss, double profitFactor, double winRate){

        String profitOrLoss;

        double startingBalance = balance;
        double baseBalance = balance;
        double newBalance = balance;
        double result;
        double absCommission;
        double cumulativeAbsCommission = 0;
        int leverage = 3;
        int profitCount = 0;
        int lossCount = 0;


        for (int i = 0; i < trades; i ++){

            if (profitable()){
                profitOrLoss = "profit";
                result = balance * leverage * stopLoss * profitFactor;
                profitCount++;
            }
            else {
                profitOrLoss = "loss";
                result =- balance * leverage * stopLoss;
                lossCount++;
            }

            absCommission = -balance * commission * leverage;
            newBalance = balance + result + absCommission;
            cumulativeAbsCommission = cumulativeAbsCommission + absCommission;

            //System.out.printf("trade %d: balance: %.2f; %S = %.2f; commission: %.2f; new balance: %.2f; working volume: %.2f",i+1, balance, profitOrLoss, result, absCommission, newBalance, balance*leverage);
            //System.out.println();
            balance = newBalance;

            if (newBalance < 1.2 * baseBalance){
                leverage = 3;
            }
            else if (newBalance > (1.25 * baseBalance) && newBalance < (1.5 * baseBalance)){
                leverage = 5;
            }
            else if (newBalance > (1.5 * baseBalance) && newBalance < (1.75 * baseBalance)){
                leverage = 8;
            }
            else if (newBalance > (1.75 * baseBalance) && newBalance <(2 * baseBalance)){
                leverage = 10;
            }
            else if (newBalance > (2 * baseBalance)){
                baseBalance = newBalance;
            }
        }


        double commissionCashBack = cumulativeAbsCommission/4;

        /*
        System.out.println();
        System.out.printf("stop-loos: %.2f percent; profit-factor: %.2f; win-rate: %.2f;",stopLoss * 100,profitFactor,winRate);
        System.out.println();
        System.out.printf("starting balance: %.2f;  final balance: %.2f;", startingBalance,newBalance);
        System.out.println();
        System.out.printf("total profits: %d; total losses: %d;",profitCount,lossCount);
        System.out.println();
        System.out.printf("Total commission: %.2f ; cashback: %.2f ", -cumulativeAbsCommission, -commissionCashBack);
        System.out.println();
        System.out.printf("Final Balance = %.2f ",(newBalance - commissionCashBack));
        System.out.println();


         */

        double depositMultiplier = newBalance/startingBalance;
       // System.out.printf("DepositMultiplier: %.2f", depositMultiplier);
        return depositMultiplier;

    }
    static boolean profitable() {
        if (new Random().nextDouble() < winRate) {
            return true;
        }
        else {
            return false;
        }
    }
    static double avgDepositMultiplier(double stopLoss, double profitFactor, double winRate){
        double innerSum = 0;
        double outerSum = 0;

        int innerIterations = 1000000;
        int outerIterations = 1;

        for (int length = 1; length <= outerIterations; length ++) {
            for (int i = 0; i < innerIterations; i++) {
                innerSum = innerSum + growthModel(startingBalance, stopLoss, profitFactor, winRate);
            }

            double innerAverageDepositMultiplier = innerSum/innerIterations;

            //System.out.println();
            //System.out.printf("%d iterations: average deposit multiplier = x %.2f", innerIterations, innerAverageDepositMultiplier);

            outerSum = outerSum + innerAverageDepositMultiplier;

            innerSum = 0;
        }

        double outerAverageDepositMultiplier = outerSum/outerIterations;

        System.out.println();
        System.out.printf("stop loss: %.3f; profit factor: %.2f; win rate: %.2f; deposit multiplier per %d trades: x%.2f",stopLoss, profitFactor,winRate, trades, outerAverageDepositMultiplier);

        return outerAverageDepositMultiplier;

    }
    public static void main(String[] args) {

        double stopLoss = 0;
        double profitFactor = 0;
        double winRate = 0;

        double maxStopLoss = 0.1;
        double maxProfitFactor = 10;
        double maxWinRate = 0.6;

       /* for (stopLoss = 0.005; stopLoss < maxStopLoss; stopLoss = stopLoss + 0.005){
         for (profitFactor = 1; profitFactor < maxProfitFactor; profitFactor = profitFactor + 0.25){
             for (winRate = 0.2; winRate < maxWinRate; winRate = winRate + 0.05){
                 avgDepositMultiplier(stopLoss, profitFactor, winRate);
             }
         }
        }

        */
        //growthModel(25.00,0.005,3.00, 0.3);

        avgDepositMultiplier(0.005,5,0.4);


    }

}
