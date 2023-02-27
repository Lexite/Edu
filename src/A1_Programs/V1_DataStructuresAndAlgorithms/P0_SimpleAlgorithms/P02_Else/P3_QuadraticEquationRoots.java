package A1_Programs.V1_DataStructuresAndAlgorithms.P0_SimpleAlgorithms.P02_Else;

public class P3_QuadraticEquationRoots {
    public static void main(String[] args) {

        roots(1,-2,1);


    }
    static void roots(int a, int b, int c){
        int x = 0;
        int x1 = 0;
        int x2 = 0;
        int D = (int)(Math.pow(b,2) - (4 * a * c));
        if (D > 0) {
            x1 = (int)((-b + Math.sqrt(D))/(2*a));
            x2 = (int)((-b - Math.sqrt(D))/(2*a));
            System.out.println("root 1 = " + x1);
            System.out.println("root 2 = " + x2);
        }
        else if (D == 0){
            x = -b /(2*a);
            System.out.println("root = " + x);
        }
        else {
            System.out.println("Do not want to do imaginary part");
        }


    }
}
