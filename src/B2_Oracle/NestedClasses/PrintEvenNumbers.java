package Learning.FirstLearnign.NestedClasses;
public class PrintEvenNumbers {
    private final int SIZE = 40;
    private int[] evenNumbersArray = new int[SIZE];
    public PrintEvenNumbers() {
        for (int i = 0; i < SIZE; i ++) {
            evenNumbersArray[i] = i;
        }
    }
    public void printEvenNumbersMethod() {
        PrintEvenNumbersInterface iterator = this.new PrintEvenNumbersIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    interface PrintEvenNumbersInterface extends java.util.Iterator<Integer> {}
    private class PrintEvenNumbersIterator implements PrintEvenNumbersInterface {
        private int nextIndex = 0;
        public boolean hasNext() {
            return (nextIndex <= SIZE - 1);
        }
        public Integer next() {
            Integer retValue = Integer.valueOf(evenNumbersArray[nextIndex]);
            nextIndex += 2;
            return retValue;
        }
    }
    public static void main(String[] args) {
        PrintEvenNumbers pen = new PrintEvenNumbers();
        pen.printEvenNumbersMethod();
    }
}