package A1_Programs.V1_DataStructuresAndAlgorithms.P0_SimpleAlgorithms.P5_LeetCode;
public class P3_LongestSubstring {
    public static void main(String[] args) {
        String string = "wordwr";
        System.out.println(new P3_LongestSubstring().lengthOfLongestSubstring(string));

    }

    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        String sub = null;



        for (int i = 0; i < s.length(); i ++){
            sub = s.substring(0,i+1);


            System.out.print(s.charAt(i) + "; sub = " + sub);
            for (int n = 0; n < i; n ++){

                if (sub.charAt(n) == sub.charAt(i)){
                    System.out.print(" Found duplicate");
                    s = s.substring(n);
                    System.out.print(" new string: " + s.substring(n+1));
                    i = 0;
                    n = 0;
                    sub = null;
                }

            }
            System.out.println();










        }


        System.out.println();
        return length;

    }


}