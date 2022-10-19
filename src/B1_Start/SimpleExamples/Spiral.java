package B1_Start.SimpleExamples;

import java.util.Arrays;
public class Spiral {
    public static void main(String[] args) {
        int rows = 6;
        int cols = 6;
        int[][] startMatrix = new int[rows][cols];
        int[][] firstRowMatrix = new int[rows][cols];
        int[][] shrinkMatrix = new int[rows][cols];
        int[][] transposeMatrix = new int[rows][cols];
        int[][] rotateMatrix = new int[rows][cols];
        int[][] recursiveSpiral = new int[rows][cols];

        startMatrix = startMatrix(startMatrix,rows,cols);
        printStartMatrix(startMatrix);
        System.out.println("The recursive array is: ");

        recursiveSpiral = recursiveSpiral(startMatrix, firstRowMatrix, shrinkMatrix, transposeMatrix, rotateMatrix, rows, cols);
        //printRecursiveSpiral(recursiveSpiral);
    }

    public static int[][] startMatrix(int[][] startMatrix, int rows, int cols) {
        int number = 1;
        startMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                startMatrix[i][j] = number;
                number++;
            }
        }
        return startMatrix;
    }
    public static int[][] firstRowMatrix(int[][] startMatrix, int[][] firstRowMatrix, int rows, int cols) {
        firstRowMatrix = new int[1][cols];
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < cols; j++) {
                firstRowMatrix[i][j] = startMatrix[i][j];
            }
        }
        return firstRowMatrix;
    }
    public static int[][] shrinkMatrix(int[][] startMatrix, int[][] shrinkMatrix, int rows, int cols) {
        shrinkMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                shrinkMatrix[i][j] = startMatrix[i + 1][j];
            }
        }
        return shrinkMatrix;
    }
    public static int[][] transposeMatrix(int[][] shrinkMatrix, int[][] transposeMatrix, int rows, int cols) {
        transposeMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposeMatrix[i][j] = shrinkMatrix[j][i];
            }
        }
        return transposeMatrix;
    }
    public static int[][] rotateMatrix(int[][] matrix, int[][] rotateMatrix, int rows, int cols) {
        int a = 0;
        rotateMatrix = new int[rows][cols];
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = 0; j < cols; j++) {
                rotateMatrix[a][j] = matrix[i][j];
            }
            a++;
        }
        return rotateMatrix;
    }
    public static int[][] recursiveSpiral(int[][] recursiveArray, int[][] firstRowMatrix, int[][] shrinkMatrix, int[][] transposeMatrix, int[][] rotateMatrix, int rows, int cols) {
        if (rows < 1 && cols < 1) {
            return recursiveArray;
        }
        else {
            spiralArray(recursiveArray,cols);
            firstRowMatrix = firstRowMatrix(recursiveArray, firstRowMatrix, rows, cols);
            //printFirstRowMatrix(firstRowMatrix);
            rows = shrinkRows(rows);
            shrinkMatrix = shrinkMatrix(recursiveArray, shrinkMatrix, rows, cols);
            //printShrinkMatrix(shrinkMatrix);
            int swapRows = 0;
            int swapCols = 0;
            swapRows = cols;
            swapCols = rows;
            rows = swapRows;
            cols = swapCols;
            transposeMatrix = transposeMatrix(shrinkMatrix, transposeMatrix, rows, cols);
            //printTransposeMatrix(transposeMatrix);
            rotateMatrix = rotateMatrix(transposeMatrix, rotateMatrix, rows, cols);
            //printRotateMatrix(rotateMatrix);
            recursiveArray = rotateMatrix;
        }
        return recursiveSpiral(recursiveArray, firstRowMatrix, shrinkMatrix, transposeMatrix, rotateMatrix, rows, cols);
    }

    public static int shrinkRows(int rows) {
        rows = rows - 1;
        return rows;
    }

    public static void printStartMatrix(int[][] startMatrix) {
        System.out.println("Start Matrix:");
        System.out.println();
        System.out.println(Arrays.deepToString(startMatrix).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        System.out.println();
    }
    public static void printFirstRowMatrix(int[][] firstRowMatrix) {
        System.out.println("First Row of the Matrix:");
        System.out.println();
        System.out.println(Arrays.deepToString(firstRowMatrix).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        System.out.println();
    }
    public static void printShrinkMatrix(int[][] shrinkMatrix) {
        System.out.println("Shrinked Matrix:");
        System.out.println();
        System.out.println(Arrays.deepToString(shrinkMatrix).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        System.out.println();
    }
    public static void printTransposeMatrix(int[][] transposeMatrix) {
        System.out.println("Transposed Matrix:");
        System.out.println();
        System.out.println(Arrays.deepToString(transposeMatrix).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        System.out.println();

    }
    public static void printRotateMatrix(int[][] rotateMatrix) {
        System.out.println("Rotated Matrix:");
        System.out.println();
        System.out.println(Arrays.deepToString(rotateMatrix).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        System.out.println();
    }
    public static void printRecursiveSpiral(int[][] recursiveSpiral) {
        System.out.println(Arrays.deepToString(recursiveSpiral).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        System.out.println();
    }
    public static void spiralArray(int[][] recursiveArray, int cols) {
        for (int i = 0; i < 1; i ++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(recursiveArray[i][j] + " ");
            }
        }
    }
}






