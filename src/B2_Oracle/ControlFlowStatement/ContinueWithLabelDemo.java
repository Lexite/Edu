package Learning.FirstLearnign.ControlFlowStatement;

public class ContinueWithLabelDemo {
    public static void main(String[] args) {
        String searchMe = "look for a substring in me";
        String substring = "sub";
        boolean foundIt = false;

        int max = searchMe.length() - substring.length();

        test:
        for (int i = 0; i <= max; i++) {
            int j = i;
            int k = 0;
            int n = substring.length();

            System.out.println("at the start of the loop i = " + i);
            System.out.println("j = " + j);
            System.out.println("k = " + k);
            System.out.println("n = " + n);

            while (n-- != 0) {
                System.out.println("n = " + (n+1));
                if (searchMe.charAt(j++) != substring.charAt(k++)) {
                    System.out.println("s(j) = " + searchMe.charAt(j-1));
                    System.out.println("ss(k) = " + substring.charAt(k-1));
                    continue test;
                }
            }
            foundIt = true;
            break test;
        }
        System.out.println(foundIt ? "Found it" : "Didn't find it");
    }
}

// i = 0, n = 3, j = 0;
// n = 3, s(j) = l, ss(k) = s,
//