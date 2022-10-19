package B5_JavaRush.StaticSimpleMethods;

public class Min {
    int min(int a, int b) {
        return a < b ? a : b;
    }
    int min(int a, int b, int c) {
        int t = min(a,b);
        return min(t,c);
    }
}
