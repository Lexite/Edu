package B1_Start.PluralSight;



import java.time.LocalDate; // imported date types
import java.util.Scanner; // imported scanner type



public class CalcEngine {



    public static void main(String[] args) {
        double[] leftVals = {100.0d, 25.0d, 225.0d, 33.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'a', 's', 'm', 'd'};
        double[] results = new double[opCodes.length];

        if (args.length == 0) {
            for (int i = 0; i < opCodes.length; i++) {
                results[i] = execute(opCodes[i], leftVals[i], rightVals[i]);
            }
            for (double currentResult : results)
                System.out.println(currentResult);
        } else if (args.length == 1 && args[0].equals("interactive"))
            executeInteractively();
        else if (args.length == 3)
            handleCommandLine(args);
        else
            System.out.println("Please provide an operation code and 2 numeric values");
    }



    static double execute(char opCode, double leftVal, double rightVal) {
        double result;
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
                System.out.println("Invalid opCode" + opCode);
                result = 0.0d;
                break;
        }
        return result;
    }



    private static void handleCommandLine(String[] args) {
        char opCode = args[0].charAt(0);
        double leftVal = Double.parseDouble(args[1]);
        double rightVal = Double.parseDouble(args[2]);
        double result = execute(opCode, leftVal, rightVal);
        System.out.println(result);

    }



    static void executeInteractively() { // execute by gathering users input
        System.out.println("Enter an operation and two numbers:");
        Scanner scanner = new Scanner(System.in); // create variable scanner of type scanner - new instance gets details from the user (.in)
        String userInput = scanner.nextLine(); // reads all the input from the user until enter is pressed
        String[] parts = userInput.split( " "); // splits the string in parts
        performOperation(parts);
    }



    private static void performOperation(String[] parts) {
        char opCode = opCodeFromString(parts[0]); // opCode from string
        if (opCode == 'w')
            handleWhen(parts);
        else {
            double leftVal = valueFromWord(parts[1]);
            double rightVal = valueFromWord(parts[2]);
            double result = execute(opCode, leftVal, rightVal);
            displayResult(opCode, leftVal, rightVal, result);
        }
    }



    private static void handleWhen(String[] parts) {
        LocalDate startDate = LocalDate.parse(parts[1]); // will take the string value of date typed by the user
        // will translate that string into an instance of local date and assign it to our startDate variable
        long daysToAdd = (long) valueFromWord(parts[2]);
        LocalDate newDate = startDate.plusDays(daysToAdd);
        String output = String.format("%s plus %d days is %s", startDate, daysToAdd, newDate);
        System.out.println(output);
    }



    private static void displayResult(char opCode, double leftVal, double rightVal, double result) {
        char symbol = symbolFromOpCode(opCode);

//        StringBuilder builder = new StringBuilder(20); //create new instance of string builder
//        builder.append(leftVal);
//        builder.append(" ");
//        builder.append(symbol);
//        builder.append(" ");//
//        builder.append(rightVal);
//        builder.append(" = ");
//        builder.append(result);
//        String output = builder.toString();//toString method to build a string
        String output = String.format("%.3f %c %.3f = %.3f",leftVal,symbol,rightVal,result);
        System.out.println(output);
    }



    private static char symbolFromOpCode(char opCode) {
        char[] opCodes = {'a','s','m','d'};
        char[] symbols = {'+','-','*','/'};
        char symbol = ' ';
        for(int index = 0; index < opCodes.length; index++) {
            if(opCode == opCodes[index]) {
                symbol = symbols[index];
                break;
            }
        }
        return symbol;
    }



    static char opCodeFromString(String operationName) {
        char opCode = operationName.charAt(0); // grab first letter of the operation , multiply - m, add - a
        return opCode;
    } //translate the words to values that the program will understand



    static double valueFromWord(String word) {                         // single string parameter word
        String[] numberWords = {                                       // declare string of number words through which we are going to loop
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };
        double value = -1d;                                            // declare local variable value
        for (int index = 0; index < numberWords.length; index++) {     // create for loop to count through the array
            if (word.equals(numberWords[index])) {                     // create if statement to find whether the typed words match with the values
                value = index;                                         // assign index to local variable value
                break;                                                 //  exit the loop when done - jump out of the for loop to the following statement
            }
        }
        if (value == -1d)
            value = Double.parseDouble(word);


        return value; // gives back the numeric value of the word that the user types in
    } // translate work for numeric words
}