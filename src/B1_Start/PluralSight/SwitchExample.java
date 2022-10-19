package B1_Start.PluralSight;



public class SwitchExample {



    public static void main(String[] args) {


        double[] leftVals = {1.0d, 2.5d, 3.7d, 6.7d};
        double[] rightVals = {5.4d, 5.4d, 10.2d, 15.4d};
        char[] opCodes = {'a', 's', 'm', 'd'};
        double[] results = new double[opCodes.length];
        if (args.length == 0) {
            for (int i = 0; i < opCodes.length; i++) {
                results[i] = execute(opCodes[i], leftVals[i], rightVals[i]);
                System.out.println(results[2]);
            }
            for (double currentResult : results)
                System.out.println(currentResult);
        }

        else if (args.length == 3)
            handleCommandLine(args);
        else
            System.out.println("Please provide an operation code and 2 numeric values");
        }



    static double execute ( char opCode, double leftVal, double rightVal){
            double result = 0.0d;
            switch (opCode) {
                case 'a':
                    result = leftVal + rightVal;
                    break;
                case 's':
                    result = leftVal - rightVal;
                    break;
                case 'm':
                    result = leftVal * rightVal;
                    break;
                case 'd':
                    result = rightVal != 0 ? leftVal / rightVal : 0.0d;
                    break;
                default:
                    result = 0.0d;
                    System.out.println("Invalid opCode " + opCode);
            }
            return result;
        }



    private static void handleCommandLine (String[]args){
        char opCode = args[0].charAt(0);
        double leftVal = Double.parseDouble(args[1]);
        double rightVal = Double.parseDouble(args[2]);
        double result = execute(opCode, leftVal, rightVal);
        System.out.println(result);
    }



}



