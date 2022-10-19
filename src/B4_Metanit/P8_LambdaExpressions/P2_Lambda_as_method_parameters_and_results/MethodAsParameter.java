package B4_Metanit.P8_LambdaExpressions.P2_Lambda_as_method_parameters_and_results;
public class MethodAsParameter {
    public static void main(String[] args) {
        int[] nums = {-10,-9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10};

        int sum1 = sum(nums, ExpressionHelper::isEven);
        int sum2 = sum(nums, ExpressionHelper::isPositive);
        int sum3 = sum(nums, ExpressionHelper::isNegative);
        int sum4 = sum(nums, ExpressionHelper::isDivisibleByFour);

        Expression expression = ExpressionHelper::isEven;

        ExpressionHelper nonStaticExpression = new ExpressionHelper();
        Expression ex = nonStaticExpression::isEvenAndPositive;

        int sum5 = sum(nums, expression);
        int sum6 = sum(nums, ex);

        System.out.println("sum1: " + sum1);
        System.out.println("sum2: " + sum2);
        System.out.println("sum3: " + sum3);
        System.out.println("sum4: " + sum4);
        System.out.println("sum5: " + sum5);

    }
    private static int sum (int[] numbers, Expression func){
        int result = 0;
        for (int i : numbers)
        {
            if (func.isEqual(i))
                result += i;
        }
        return result;
    }
}
class ExpressionHelper{
    static boolean isEven(int n){
        return n%2 == 0;
    }
    static boolean isPositive(int n) {
        return  n > 0;
    }
    static boolean isNegative(int n) {return  n < 0; }
    static boolean isDivisibleByFour(int n) {return n%4 == 0;}
    boolean isEvenAndPositive(int n){return n%2 == 0 && n > 0;}

}
interface Expression{
    boolean isEqual(int n);
}