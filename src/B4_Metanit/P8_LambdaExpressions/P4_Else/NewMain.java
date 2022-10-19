package B4_Metanit.P8_LambdaExpressions.P4_Else;

public class NewMain {
    public static void main(String[] args) {
        int s = a(1).e(1,2);
        int s1 = a(2).e(5,3);
        int mu = a(3).e(5,10);
        int d = a(4).e(54,9);
        int z = a(15123).e(1,2);
        int ub = 10;
        int lb = -10;
        int length = ub - lb;
        int[] nums = new int[length];

        for (int i = -10; i < length; i ++){
            int n = 0;
            nums[n] = i;
            n++;
            System.out.println(i);
        }

        BooleanIsEqual e = (n) -> n%2 == 0;
        int sumOfEvenNumbers = sum(nums,e);
        System.out.println(sumOfEvenNumbers);


    }

    static IntOperation a(int m){
        switch(m){
            case 1 -> {return (a,b)->a+b;}
            case 2 -> {return (a,b)->a-b;}
            case 3 -> {return (a,b)->a*b;}
            case 4 -> {return (a,b)->a/b;}
            default -> {return (a,b)->0;}
        }
    }
    static int sum(int[] nums, BooleanIsEqual e){
        int r=0;
        for (int i: nums){
            if(e.isEqual(i))
                r+=i;
        }
        return r;
    }

}

interface IntOperation {
    int e(int a, int b);
}
interface BooleanIsEqual {
    boolean isEqual(int i);
}