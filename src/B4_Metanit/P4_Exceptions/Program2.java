package B4_Metanit.P4_Exceptions;

public class Program2 {

    public static void main(String[] args) {

        int r = getFactorial(-6);
        System.out.println(r);
    }

    public static int getFactorial(int num) {
        int result = 1;
        try {
            if (num < 1) throw new Exception("The number is less than 1");
            for (int i = 1; i <= num; i++) {
                result *= i;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.getStackTrace();
            ex.printStackTrace();

            result = num;
        }
        return result;
    }
}