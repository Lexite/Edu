package B1_Start.SimpleExamples;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
public class RemoveDuplicateByArrays {
    static final int maxN = 100;
    static final int totalEl = 20_000_000;
    public static void main(String[] args) {
        Random r = new Random();
        var arr = IntStream.generate(() -> r.nextInt(maxN)).limit(totalEl).toArray();
        System.out.println("Array before: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Array after: ");
        long before = System.nanoTime();
        final int[] answer = rmDuplicate(arr);
        long after = System.nanoTime();
        System.out.println(Arrays.toString(answer));
        System.out.println("Taken time: " + (after - before) / 1_000_000 + " millis");
        var expected = Arrays.stream(arr).distinct().toArray();
        System.out.println("Is answer correct: " + Arrays.equals(answer,expected));
    }
    public static int[] rmDuplicate(int[] arr) {
        int[] nums = new int[maxN];
        Arrays.fill(nums, -1);
        int[] positions = new int[maxN];
        Arrays.fill(positions, - 1);

        for (int i = 0; i < arr.length; i ++) {
            if (nums[arr[i]] != 1) {
                nums[arr[i]] = 1;
                positions[arr[i]] = i;
            }
        }
        int[] noDups = new int[totalEl];
        Arrays.fill(noDups, -1);
        for (int i = 0; i < positions.length; i ++) {
            if (positions[i] == -1) continue;
            int nextIndex = positions[i];
            noDups[nextIndex] = i;
        }
        var countM = 0;
        for (int i = 0; i < noDups.length; i ++) {
            if (noDups[i] == - 1) {
                countM++;
            }
        }
        int[] result = new int[noDups.length - countM];
        for (int i = 0, j = 0; i < noDups.length; i ++) {
            if (noDups[i] != -1) {
                result[j] = noDups[i];
                j++;
            }
        }
        return result;
    }
}
