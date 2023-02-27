package A1_Programs.V1_DataStructuresAndAlgorithms.P5_Pluralsight_Collections.P1_CSC;

public class P1_Practice {
    public static void main(String[] args) {
        Operation sum = new Operation() {
            @Override
            public int calculate(int num1, int num2) {
                return num1+num2;
            }
        };

        Operation sub = (num1,num2) -> (num1-num2);
        Operation div = (num1,num2) -> (num1/num2);
        Operation mult = (num1,num2) -> (num1*num2);



        int sum1 = sum.calculate(1,2);
        int sub1 = sub.calculate(5,2);
        int div1 = div.calculate(6,2);
        int mul1 = mult.calculate(5,3);

        System.out.printf("%d %d %d %d", sum1, sub1, div1, mul1);
        System.out.println();


    }

}


interface Operation{

    int calculate(int num1, int num2);

}
